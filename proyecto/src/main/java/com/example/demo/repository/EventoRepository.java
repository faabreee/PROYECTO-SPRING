package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.entity.Evento;

public interface EventoRepository extends JpaRepository<Evento, Integer>{

    @Query("SELECT e FROM Evento e WHERE e.usuario.codUsuario = ?1")
    List<Evento> findByUsuarioCodUsuario(Integer codUsuario);

}
