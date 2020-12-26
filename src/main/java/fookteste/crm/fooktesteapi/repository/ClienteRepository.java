package fookteste.crm.fooktesteapi.repository;

import fookteste.crm.fooktesteapi.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/*Vamos fazer essa interface herdar o JPARepository
* Então, vamos apontar para ele Cliente e o tipo do daado, que é "long"
* Então, anotamos essa interface com @repository, para dizer que isso tudo é um
* componente do Spring do tipo "repository", ou seja, alguem reponsavel por interagir com o
* banco de dados.
* Nessa prática, nao preciso de IMPLEMENTAÇÃO, pois o SpringDataJPA já
* fornece a implementação!! */
@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}
