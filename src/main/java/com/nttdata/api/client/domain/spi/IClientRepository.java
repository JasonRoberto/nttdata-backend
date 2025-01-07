package com.nttdata.api.client.domain.spi;

import com.nttdata.api.client.domain.model.Client;

public interface IClientRepository {
    Client getClientByDocument(String documentType, String documentNumber);
}
