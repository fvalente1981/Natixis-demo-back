package com.natixis.demo.config;

import com.natixis.demo.model.Cliente;
import com.natixis.demo.model.Endereco;
import com.natixis.demo.repository.ClienteRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;

@Configuration
public class DataBaseInit {

    @Bean
    CommandLineRunner initDatabase(ClienteRepository repo) {
        return args -> {

                //criar cliente
                Cliente c = new Cliente();
                c.setNome("Cliente Demo");
                c.setDataNasc(LocalDate.of(1990, 5, 10));
                c.setNif(123456789);

                //criar endereço
                Endereco e = new Endereco();
                e.setRua("Rua Principal");
                e.setNumero("100");
                e.setComplemento("Apto 1");
                e.setCodigoPostal("1000-001");
                e.setConselho("Lisboa");
                e.setDistrito("Lisboa");
                c.addEndereco(e);

                repo.save(c);

        };
    }
}
