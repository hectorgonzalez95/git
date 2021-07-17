package com.git.git.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

@RequestMapping("/pruebaPrimera")
public class PruebaPrimerBranchController {
  private final RestTemplate restTemplate;

    public PruebaPrimerBranchController(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }
}
