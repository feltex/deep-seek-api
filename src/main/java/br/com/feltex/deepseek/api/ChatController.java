package br.com.feltex.deepseek.api;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.List;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping(produces = MediaType.APPLICATION_JSON_VALUE)
public class ChatController {

    @Value("${app.api.url}")
    private String apiUrl;

    @Value("${app.api.key}")
    private String apiKey;

    @GetMapping("/")
    public String chat(@RequestParam(value = "query", defaultValue = "Conte uma curiosidade sobre o mapa mundi")
        String query) throws JsonProcessingException {

        var restTemplate = new RestTemplate();
        var headers = new HttpHeaders();
        headers.setBearerAuth(apiKey);
        headers.setContentType(MediaType.APPLICATION_JSON);

        var deepseekAssistant = new DeepSeekMessage("system", "Você é um assistente especialista em geografia" +
            " e geopolítica!");
        var deepSeekPrompt = new DeepSeekMessage("user", query);

        var deepSeekPromptRequest = new DeepSeekPromptRequest("deepseek-chat", false,
            List.of(deepseekAssistant, deepSeekPrompt));

        ObjectMapper objectMapper= new ObjectMapper();
        var prompt = objectMapper.writeValueAsString(deepSeekPromptRequest);


        var httpRequest = new HttpEntity<>(prompt, headers);

        var response = restTemplate.exchange(apiUrl, HttpMethod.POST, httpRequest, String.class);

        if(response.getStatusCode().value() == 200){
            return response.getBody();
        }else {
        return "error " + response.getStatusCode();
        }


    }

}
