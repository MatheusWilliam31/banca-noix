package web.rest.rest;


import com.basis.bsb.bancanoix.servico.EventoServico;

import com.basis.bsb.bancanoix.servico.dto.EventoDTO;
import com.basis.bsb.bancanoix.servico.filtro.EventoFiltro;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/eventos")
public class EventoRecurso {

    private final EventoServico eventoServico;


    @GetMapping("filtro")
    ResponseEntity<List<EventoDTO>> filtrarData(EventoFiltro filtro) {
        return ResponseEntity.ok(eventoServico.filtrarData(filtro));
    }

<<<<<<< HEAD
=======

>>>>>>> ee2b70676004b74d95e18c1c8b4579ea7955aa73
    @GetMapping(value = "/{id}")
    public ResponseEntity<EventoDTO> findById(@PathVariable Long id) {
        EventoDTO eventoDTO = eventoServico.findById(id);
        return ResponseEntity.ok().body(eventoDTO);
    }

    @PostMapping
    public ResponseEntity<EventoDTO> insert(@RequestBody EventoDTO dto) {
        dto = eventoServico.insert(dto);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(dto.getId()).toUri();
        return ResponseEntity.created(uri).body(dto);
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<EventoDTO> delete(@PathVariable Long id) {
        servico.delete(id);
        return ResponseEntity.noContent().build();
    }
}

