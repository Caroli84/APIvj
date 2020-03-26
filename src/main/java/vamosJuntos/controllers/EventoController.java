package vamosJuntos.controllers;

import vamosJuntos.dao.EventoRepository;
import vamosJuntos.entity.Evento;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class EventoController {
    @Autowired
    EventoRepository eventoRepository;

    @GetMapping("/vamosjuntos/evento/{id}")
    public ResponseEntity<Evento> getEvento(@PathVariable Long id) {
        Optional<Evento> eventoOpt=eventoRepository.findById(id);
        if(eventoOpt.isPresent()){
            Evento evento=eventoOpt.get();
            return new ResponseEntity<Evento>(evento, HttpStatus.OK);
        }else{
            return new ResponseEntity<Evento>(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("/vamosjuntos/evento")
    public Iterable<Evento> getEvento() {
        return eventoRepository.findAll();
    }

    @PostMapping("/vamosjuntos/evento")
    public void addEvento(@RequestBody Evento evento){eventoRepository.save(evento);}

    @DeleteMapping("/vamosjuntos/evento/{id}")
    public void deleteEvento(@PathVariable Long id) {
        if(eventoRepository.findById(id).isPresent()){
            eventoRepository.deleteById(Long.valueOf(id));
        }else{
            System.out.println("id no existe");
        }

    }

    @PutMapping("/vamosjuntos/evento")
    public void updateEvento(@RequestBody Evento evento){eventoRepository.save(evento);}
}
