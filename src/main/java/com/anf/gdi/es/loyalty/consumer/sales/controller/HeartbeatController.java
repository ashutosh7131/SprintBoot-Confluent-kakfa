package com.anf.gdi.es.loyalty.consumer.sales.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("${application.api.heartbeat-endpoint}")
public class HeartbeatController {

    @GetMapping
    public ResponseEntity<String> getHeartbeat() {
        return ResponseEntity.noContent().build();
    }
}
