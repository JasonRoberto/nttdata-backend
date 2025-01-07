package com.nttdata.api.client.domain.api;

import com.nttdata.api.client.domain.model.Client;

public interface IGetClientServicePort {
    Client getClientByDocument(String documentType, String documentNumber);
}
