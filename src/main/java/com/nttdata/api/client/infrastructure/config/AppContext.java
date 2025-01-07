package com.nttdata.api.client.infrastructure.config;

import com.nttdata.api.client.domain.api.IGetClientServicePort;
import com.nttdata.api.client.domain.spi.IClientRepository;
import com.nttdata.api.client.domain.usecase.GetClientUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppContext {

    @Bean
    public IGetClientServicePort getClientServicePort(IClientRepository clientRepository) {
        return new GetClientUseCase(clientRepository);
    }
}
