package com.basis.bsb.bancanoix.web.rest;

import com.basis.bsb.bancanoix.servico.dto.CargoDTO;
import com.basis.bsb.bancanoix.servico.dto.MotivoDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/motivos")
public class MotivoRecurso {

    private final MotivoServico servico;

    @GetMapping
    public ResponseEntity<Page<MotivoDTO>> findAll(
            @RequestParam (value ="page", defaultValue = "0") Integer page,
            @RequestParam (value ="linesPerPage", defaultValue = "12") Integer linesPerPage,
            @RequestParam (value ="direction", defaultValue = "ASC") String direction,
            @RequestParam (value ="orderBy", defaultValue = "name") String orderBy
    ) {
        PageRequest pageRequest = PageRequest.of(page, linesPerPage, Sort.Direction.valueOf(direction), orderBy);
        Page<CargoDTO> list = servico.findAllPaged(pageRequest);
        return ResponseEntity.ok().body(list);
    }

    @GetMapping (value = "/{id}")
    public ResponseEntity<CargoDTO> findById(@PathVariable Long id){
        CargoDTO cargoDTO = servico.findById(id);
        return ResponseEntity.ok().body(cargoDTO);
    }

    @PostMapping
    public ResponseEntity<CargoDTO> insert(@RequestBody CargoDTO dto) {
        dto = servico.insert(dto);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(dto.getId()).toUri();
        return ResponseEntity.created(uri).body(dto);
    }

    @DeleteMapping
    public ResponseEntity<CargoDTO> delete (@PathVariable Long id){
        servico.delete(id);
        return ResponseEntity.noContent().build();
    }

}