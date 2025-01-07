package com.nttdata.api.client.application.mapper.factory;

import com.nttdata.api.client.application.dto.ClientDto;
import com.nttdata.api.client.domain.model.Client;
import org.mapstruct.ObjectFactory;
import org.springframework.stereotype.Component;

@Component
public class ClientFactory {
    @ObjectFactory
    public Client createClient(ClientDto clientDto) {
        return Client.create(
                clientDto.getFirstName(),
                clientDto.getSecondName(),
                clientDto.getFirstSurname(),
                clientDto.getSecondSurname(),
                clientDto.getPhone(),
                clientDto.getAddress(),
                clientDto.getCity()
        );
    }
}
