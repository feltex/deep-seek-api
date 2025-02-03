package br.com.feltex.deepseek.api;

import java.util.List;

public record DeepSeekPromptRequest(String model, boolean stream,
                                    List<DeepSeekMessage> messages) {

}
