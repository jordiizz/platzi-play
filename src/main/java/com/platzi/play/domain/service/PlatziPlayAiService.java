package com.platzi.play.domain.service;

import dev.langchain4j.service.UserMessage;
import dev.langchain4j.service.V;
import dev.langchain4j.service.spring.AiService;

@AiService
public interface PlatziPlayAiService {

    @UserMessage("""
            Genera un saludo de bienvenida a la plataforma de gestión de películas {{platform}}. 
            Usa menos de 120 caracteres y hazlo con un estilo amigable.
            """)
    public String generateGreeting(@V("platform") String platform);
}
