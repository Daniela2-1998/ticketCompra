package com.example.ticketCompra.service;

import com.example.ticketCompra.model.CD;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
import java.util.Optional;

@FeignClient(name = "APICDS")
@Controller
@EnableFeignClients
public class CDClient {

    @GetMapping("/cds")
    public List<CD> getAllCDS();

    @GetMapping("/cds/{id}")
    public Optional<CD> getCDById();
}
