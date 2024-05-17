package com.example.ticketCompra.controller;

import com.example.ticketCompra.model.CD;
import com.example.ticketCompra.model.TicketCompra;
import com.example.ticketCompra.service.CDClient;
import com.example.ticketCompra.service.TicketCompraService;
import jakarta.ws.rs.Path;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/tickets")
public class TicketComprasController {

    @Autowired
    private TicketCompraService ticketCompraService;

    @Autowired
    private CDClient cdClient;

    @GetMapping("")
    public List<TicketCompra> getAllTickets(){
        return ticketCompraService.getAllTickets();
    }

    @GetMapping("/cds")
    public List<CD> getAllCDS(){
        return cdClient.getAllCDS();
    }

    @GetMapping("/cds/{id}")
    public Optional<CD> findCDById(@PathVariable Long id){
        return cdClient.getCDById();
    }

    @PostMapping("/add/{id}")
    public TicketCompra addTicket(@RequestBody TicketCompra ticketCompra, @PathVariable Long id){
        return ticketCompraService.addTicket(ticketCompra, id);
    }
}
