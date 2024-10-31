package aula.web.api;

import org.springframework.context.annotation.Bean;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;

public class OpenApiConfig {

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
            .info(new Info()
                .title("My First Project API")
                .version("1.0")
                .description("API de exemplo utilizando Spring Boot")
                .contact(new Contact()
                    .name("Seu Nome")
                    .url("http://www.seusite.com.br")
                    .email("voce@seusite.com.br")));
    }
    
}
