package com.example.ticketCompra.service;

import com.example.ticketCompra.model.CD;
import com.example.ticketCompra.model.TicketCompra;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TicketCompraService {

    @Autowired
    CDClient cdClient;

    private final List<TicketCompra> ticketsCompras = new ArrayList<>();

    public List<TicketCompra> getAllTickets(){
        return ticketsCompras;
    }

    public TicketCompra addTicket(TicketCompra ticketCompra, Long id){
        CD cdParaTicket = cdClient.getCDById()
                .orElseThrow(() -> new RuntimeException("CD N°: " + id + " no encontrado"));

        ticketCompra.setCd(cdParaTicket);
        ticketsCompras.add(ticketCompra);

        return ticketCompra;
    }

}
