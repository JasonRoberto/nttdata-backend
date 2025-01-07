package com.nttdata.api.client.domain.usecase;

import com.nttdata.api.client.domain.api.IGetClientServicePort;
import com.nttdata.api.client.domain.model.Client;
import com.nttdata.api.client.domain.spi.IClientRepository;
import com.nttdata.api.client.infrastructure.exception.ClientNotFoundException;
import com.nttdata.api.client.infrastructure.exception.InvalidInputException;

public class GetClientUseCase implements IGetClientServicePort {

    private final IClientRepository clientRepository;

    public GetClientUseCase(IClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    @Override
    public Client getClientByDocument(String documentType, String documentNumber) {
        if (documentType == null || !documentType.equals("C") && !documentType.equals("P")) {
            throw new InvalidInputException("Tipo de documento inválido.");
        }
        if (documentType == null || documentType.isEmpty() || documentNumber == null) {
            throw new InvalidInputException("El tipo y número de documento son obligatorios.");
        }
        Client client = this.clientRepository.getClientByDocument(documentType, documentNumber);
        if (client == null) {
            throw new ClientNotFoundException("Cliente no encontrado");
        }
        return client;
    }
}
