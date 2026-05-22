package br.com.brunojdsz.config;

import br.com.brunojdsz.services.CarService;
import org.springframework.ai.support.ToolCallbacks;
import org.springframework.ai.tool.ToolCallback;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class ToolConfig {

    @Bean
    public List<ToolCallback> brunoTools(CarService service){
        return List.of(ToolCallbacks.from(service));
    }
}
