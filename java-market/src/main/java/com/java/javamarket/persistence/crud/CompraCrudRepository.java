package com.java.javamarket.persistence.crud;

import com.java.javamarket.persistence.entity.Compra;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface CompraCrudRepository extends CrudRepository<Compra, Integer> {
    //Optional<List<Compra>> findByIdCliente(String idCliente);
    @Query(value = "select * from compras where id_cliente = ?",nativeQuery = true)
    Optional<List<Compra>> findByIdCliente(String id_cliente);
    //select * from compras where id_cliente = '?'
}
