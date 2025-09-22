package com.natixis.demo.web.clients;

import com.natixis.demo.model.Cliente;

import java.util.List;

public record ClientResponse(List<Cliente> listaClientes ) {}
