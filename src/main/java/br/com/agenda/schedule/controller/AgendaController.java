package br.com.agenda.schedule.controller;

import br.com.agenda.schedule.model.Agenda;
import br.com.agenda.schedule.repository.AgendaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/api/agendas")
public class AgendaController {

    @Autowired
    private AgendaRepository agendaRepository;

    @GetMapping
    public List<Agenda> getAllAgenda() {
        return agendaRepository.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Agenda> getAgendaById(@PathVariable Long id) {
        Optional<Agenda> agenda = agendaRepository.findById(id);
        return agenda.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public Agenda createAgenda(@RequestBody Agenda agenda) {
        return agendaRepository.save(agenda);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Agenda> updateAgenda(@PathVariable Long id, @RequestBody Agenda agendaDetails) {
        Optional<Agenda> agenda = agendaRepository.findById(id);
        if (agenda.isPresent()) {
            Agenda updateAgenda = agenda.get();
            updateAgenda.setNome(agendaDetails.getNome());
            updateAgenda.setCompromisso(agendaDetails.getCompromisso());
            updateAgenda.setData(agendaDetails.getData());
            updateAgenda.setHora(agendaDetails.getHora());
            agendaRepository.save(updateAgenda);
            return ResponseEntity.ok(updateAgenda);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteAgenda(@PathVariable Long id) {
        Optional<Agenda> agenda = agendaRepository.findById(id);
        if (agenda.isPresent()) {
            agendaRepository.delete(agenda.get());
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}


