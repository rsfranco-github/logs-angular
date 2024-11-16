package com.developer.logsAngular.controller;

import com.developer.logsAngular.DTO.MessageDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
public class LogsController {

    @PostMapping("/messaje")
    public ResponseEntity<?> receiveMessage(@RequestBody MessageDTO messageDTO) {
        // Imprime el valor del campo "mensaje" en consola
        System.out.println("Mensaje recibido: " + messageDTO.getMessage());
        return new ResponseEntity<>(messageDTO, HttpStatus.OK);
    }
}
