package fookteste.crm.fooktesteapi.controller;

import java.util.List;

import fookteste.crm.fooktesteapi.model.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import fookteste.crm.fooktesteapi.repository.ClienteRepository;

@RestController //ele diz pro programa que vamos desenvolver nosso endpoint na estrutura de REST
@RequestMapping("/clientes") //vai mapear os endpoints que estamos desenvolvendo dentro desta classe para receber requisições iniciada com "/clientes". Ou seja, adicionar um "http://www.(....)/cliente"
public class ClienteController {
  @Autowired //vai injetar uma instancia de "ClienteRepository" no "clienteRepository"
  private ClienteRepository clienteRepository;
  //Obs. essa private eu só adicionei após criar o banco de dados e a interface
    @GetMapping //precisamos do @GetMapping para que quando chegue uma requisição HTTP "GET" em /clientes,
                // a função "listar" é o que vai responder a requisição
    public List<Cliente> listar(){ //para essa lista funcionar, tivemos que criar uma classe "Cliente", no mesmo nível do diretório do controller.
        return clienteRepository.findAll();
    }
  /* Agora, FINALMENTE, vou cadastrar alguns clientes, para que a API não  uma array vazia.
   * Vou lá no src/main/resources/application.properties. Lá, adiciono a linha
   *"spring.jpa.show-sql=true". Com essa linha de propriedade nós ativamos a impressão dos SQLs da aplicação.
   * Essa configuração é para podermos visualizar apenas. É bastante utilizada em ambiente de desenovolvimento,
   * mas não é muito utilizada na produção em si.
   *
   * AGORA, VAMOS CRIAR OS MÉTODOS "POST", para implementar o cadastro de clientes!
   */
  @PostMapping
  @ResponseStatus(HttpStatus.CREATED) //com essa anotação, o êxito no cadastro não vai exibir código 200 "sucesso", mas sim o 201 "Sucesso na criação"
  public Cliente cadastrar(@RequestBody Cliente cliente) {
    return clienteRepository.save(cliente);
  }
}
/*
Nosso método chamado "cadastrar" recebe um "cliente" e devolve um "cliente" cadastrado.
O @RequestBody anotando o parâmetro Cliente serve pra informar que o corpo da requisição (o JSON) vai ser convertido
para um objeto JAVA do tipo "Cliente".
Por fim, é preciso anotar com "@PostMapping", para indicar que requisições post devem cair nesse método

 */




 /*  @GetMapping     -ESTE FRAGMENTO SERIA APENAS UM TESTE DESENVOLVENDO PARAMETERS. QUERIA VER SE FUNFAFA. ele entraria dentro da public class
    public String hello(@RequestParam(required = false) String name) {
        name.toString();
        return "oi, " + name;
    } */