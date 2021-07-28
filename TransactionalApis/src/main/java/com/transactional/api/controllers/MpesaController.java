package com.transactional.api.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.transactional.api.dtos.AccessTokenResponse;
import com.transactional.api.services.TransactionAPi;


@RestController
@RequestMapping("mpesa")
public class MpesaController {

    private final TransactionAPi transactionAPi;

    public MpesaController(TransactionAPi transactionAPi) {
        this.transactionAPi = transactionAPi;
    }

    @GetMapping(path = "/token", produces = "application/json")
    public ResponseEntity<AccessTokenResponse> getAccessToken() {
        return ResponseEntity.ok(transactionAPi.getAccessToken());
    }
}



