package com.nttdata.api.client.application.handler;

import com.nttdata.api.client.application.dto.ClientDto;
import com.nttdata.api.client.application.dto.GetClientRequestDto;
import com.nttdata.api.client.application.mapper.IClientMapper;
import com.nttdata.api.client.domain.api.IGetClientServicePort;
import com.nttdata.api.client.domain.model.Client;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
public class ClientHandler {
    private final IGetClientServicePort getClientServicePort;
    private final IClientMapper clientMapper;

    public ClientHandler(IGetClientServicePort getClientServicePort, IClientMapper clientMapper) {
        this.getClientServicePort = getClientServicePort;
        this.clientMapper = clientMapper;
    }

    public ClientDto getClient(GetClientRequestDto getClientRequestDto){
        Client client = getClientServicePort.getClientByDocument(getClientRequestDto.getDocumentType(), getClientRequestDto.getDocumentNumber());
        return this.clientMapper.toClientDto(client);
    }

}
