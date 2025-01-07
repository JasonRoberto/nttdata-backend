package com.nttdata.api.client.application.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class GetClientRequestDto {
    private String documentType;
    private String documentNumber;
}
