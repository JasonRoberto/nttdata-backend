package com.nttdata.api.client.infrastructure.output.mock;

import com.nttdata.api.client.domain.model.Client;
import com.nttdata.api.client.domain.spi.IClientRepository;
import org.springframework.stereotype.Repository;

@Repository
public class ClientRepositoryImpl implements IClientRepository {


    @Override
    public Client getClientByDocument(String documentType, String documentNumber) {
        if (documentType.equals("C") && documentNumber.equals("23445322")) {
            return Client.create("FirstName", "SecondName", "FirstSurname", "SecondSurname",
                    "3001234567", "Calle 123 # 45 - 67", "Bogotá");
        }
        return null;
    }
}
