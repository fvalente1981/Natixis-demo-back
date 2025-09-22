package com.natixis.demo.service;

import com.natixis.demo.model.Cliente;
import com.natixis.demo.model.Endereco;
import com.natixis.demo.repository.ClienteRepository;
import com.natixis.demo.repository.EnderecoRepository;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService {


    @Inject
    ClienteRepository clienteRepo;

    public List<Cliente>  getListaClientes(){

        return   clienteRepo.findAll();

    }

    @Transactional
    public Cliente saveCliente(Cliente cliente ) {
        return clienteRepo.save(cliente);

    }

    @Transactional
    public void deleteCliente(Cliente cliente ) {
         clienteRepo.delete(cliente);

    }




}
