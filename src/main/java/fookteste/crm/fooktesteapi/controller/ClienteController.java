package fookteste.crm.fooktesteapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController //ele diz pro programa que vamos desenvolver nosso endpoint na estrutura de REST
@RequestMapping("/clientes") //vai mapear os endpoints qe estamos desenvolvendo dentro desta classe para receber requisições iniciada com "/clientes". Ou seja, adicionar um "http://www.(....)/cliente"
public class ClienteController {

  /*  @GetMapping     //ESSE FRAGMENTO É APENAS UM TESTE DESENVOLVENDO PARAMETERS. QUERIA VER SE FUNFAFA.
    public String hello(@RequestParam(required = false) String name) {
        name.toString();
        return "oi, " + name;
    } */

}


