package com.basis.bsb.bancanoix.web.rest;

import com.basis.bsb.bancanoix.servico.MotivoServico;
import com.basis.bsb.bancanoix.servico.dto.MotivoDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/motivos")
public class MotivoRecurso {

    private final MotivoServico servico;

    @GetMapping
    public ResponseEntity<List<MotivoDTO>> findAll() {
        return ResponseEntity.ok(servico.findAll());
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<MotivoDTO> findById(@PathVariable Long id) {
        MotivoDTO motivoDTO = servico.findById(id);
        return ResponseEntity.ok().body(motivoDTO);
    }

    @PostMapping
    public ResponseEntity<MotivoDTO> create(@RequestBody MotivoDTO dto) {
        dto = servico.save(dto);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(dto.getId()).toUri();
        return ResponseEntity.created(uri).body(dto);
    }

    @DeleteMapping
    public ResponseEntity<MotivoDTO> delete(@PathVariable Long id) {
        servico.delete(id);
        return ResponseEntity.noContent().build();
    }

}