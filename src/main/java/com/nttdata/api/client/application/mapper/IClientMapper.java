package com.nttdata.api.client.application.mapper;

import com.nttdata.api.client.application.dto.ClientDto;
import com.nttdata.api.client.application.mapper.factory.ClientFactory;
import com.nttdata.api.client.domain.model.Client;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING,
        implementationPackage = "com.nttdata.api.client.application.mapper.impl",
        uses = {ClientFactory.class},
        unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface IClientMapper {
    ClientDto toClientDto(Client client);
    Client toClient(ClientDto clientDto);
}
