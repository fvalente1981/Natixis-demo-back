package com.natixis.demo.web.clients;

import ch.qos.logback.core.net.server.Client;
import com.natixis.demo.model.Cliente;
import com.natixis.demo.service.ClienteService;
import jakarta.inject.Inject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@CrossOrigin(origins ="${server}" )
@RestController
public class ClientController {

    @Autowired
    ClienteService clienteService;

    @GetMapping("/api/getListaClientes")
    public ClientResponse getClients() {
        List<Cliente> lista = clienteService.getListaClientes();
        return new ClientResponse(lista);
    }

    @PostMapping("/api/saveCliente")
    public Cliente saveCliente(@RequestBody Cliente cliente) {
        return clienteService.saveCliente(cliente);
    }

    @PostMapping("/api/deleteCliente")
    public void deleteCliente(@RequestBody Cliente cliente) {
         clienteService.deleteCliente(cliente);
    }
}
