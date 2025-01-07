package com.nttdata.api.client.infrastructure.input.rest;

import com.nttdata.api.client.application.dto.ClientDto;
import com.nttdata.api.client.application.dto.GetClientRequestDto;
import com.nttdata.api.client.application.handler.ClientHandler;
import com.nttdata.api.client.infrastructure.exception.ClientNotFoundException;
import com.nttdata.api.client.infrastructure.exception.InvalidInputException;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/client")
@CrossOrigin(origins = "http://localhost:4200/")
public class ClientRestCtr {

    private final ClientHandler clientHandler;

    @GetMapping
    public ResponseEntity<ClientDto> getClient(@RequestParam("documentType") String documentType,
                                               @RequestParam("documentNumber") String documentNumber) {
        try{
            GetClientRequestDto getClientRequestDto = new GetClientRequestDto(documentType, documentNumber);
            ClientDto clientDto = this.clientHandler.getClient(getClientRequestDto);
            return ResponseEntity.ok(clientDto);
        } catch (InvalidInputException e) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        } catch (ClientNotFoundException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
