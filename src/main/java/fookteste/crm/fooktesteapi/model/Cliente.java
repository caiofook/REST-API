//criamos essa classe para passar as informações de clientes para o nosso controller
package fookteste.crm.fooktesteapi.model;

import lombok.Data;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import javax.persistence.*;
import java.util.Objects;

 /* precisamos armazenar isso tudo num banco de dados para cadastrar e acessar clientes através da nossa lista.
Para isso, vamos adicionar um novo starter: Spring Data JPA.
- JPA "Java Persistence API", serve pra trabalhar com bancos de dados relacional.
- O Spring Data JPA é um projeto do spring pra ajudar a trabalhar com JPA, entao ele ja vai adicionar o JPA também.
- Também vamos adicionar um banco de dados de memória chamado h2. Poderia ser um MySQL. */


/*anotamos nossa classe publica com "entity"(uma anotação do JPA, não do Spring) para que nossa classe seja lida como
uma "entidade". Sendo uma "entidade",será mapeada para uma tabela! Ou seja, "entity" faz com que nossa classe se torne
uma tabela no banco de dados relacional. */
@Data
@Entity
public class Cliente {

    @Id //essa anotação faz com que "private Long id;" seja nossa chave primária. A chave que identifica a nossa entidade!
    @GeneratedValue(strategy = GenerationType.IDENTITY) //estamos delegando o dever de incrementar o "Id" para o próprio banco de dados
    private Long id;
    @Column(nullable = false) //pra que o sistema rejeite entradas nulas
    private String nome;
// vamos agora gerar os getters, setters, hashcode...
// para isso, vou usar o plugin/dependência lombock, que elimina a necessidade
    //de textos e textos de getters, setters e hashcode generators
    //pra isso: @Data

    /*Agora que temos nosso banco de dados (cliente), vamos criar uma nova classe para fazer o "meio de campo"
    entre esse banco de dados e a entidade que deseja tratar esses dados (acessar, adicionar, salvar, excluir...).
    Essa nova classe vamos chamar de REPOSITÓRIO
    Obs. na verdade, nao vamos criar uma classe, mas sim uma INTERFACE*/


}
