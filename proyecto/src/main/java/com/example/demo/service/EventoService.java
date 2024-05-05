package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Evento;
import com.example.demo.repository.EventoRepository;

@Service
public class EventoService {
	
	@Autowired
	EventoRepository repository;
	
    public List<Evento> listarEventosPorCodUsuario(Integer usuario) {
        return repository.findByUsuarioCodUsuario(usuario);
    }

}
