package br.com.agenda.schedule.service;

import br.com.agenda.schedule.model.Agenda;
import br.com.agenda.schedule.repository.AgendaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AgendaService {

    @Autowired
    private AgendaRepository agendaRepository;

    public List<Agenda> getAllAgenda() {
        return agendaRepository.findAll();
    }

    public Optional<Agenda> getAgendaById(Long id) {
        return agendaRepository.findById(id);
    }

    public Agenda createAgenda(Agenda agenda) {
        return agendaRepository.save(agenda);
    }

    public Agenda updateAgenda(Long id, Agenda agendaDetails) {
        Agenda agenda = agendaRepository.findById(id).orElseThrow(() -> new RuntimeException("Agenda not found"));
        agenda.setNome(agendaDetails.getNome());
        agenda.setCompromisso(agendaDetails.getCompromisso());
        agenda.setData(agendaDetails.getData());
        agenda.setHora(agendaDetails.getHora());
        return agendaRepository.save(agenda);
    }

    public void deleteAgenda(Long id) {
        agendaRepository.deleteById(id);
    }
}
