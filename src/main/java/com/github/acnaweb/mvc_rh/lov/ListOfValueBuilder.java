package com.github.acnaweb.mvc_rh.lov;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Component;

import com.github.acnaweb.mvc_rh.model.Uf;
import com.github.acnaweb.mvc_rh.repository.CargoRepository;
import com.github.acnaweb.mvc_rh.repository.DepartamentoRepository;

@Component
public class ListOfValueBuilder {

    @Autowired
    private DepartamentoRepository departamentoRepository;

    @Autowired
    private CargoRepository cargoRepository;

    public List<ListOfValues> getListOfDepartamentos() {
        List<ListOfValues> lov = departamentoRepository.findAll(Sort.by(Sort.Direction.ASC, "nome"))
            .stream()
            .map(item -> new ListOfValues(item.getId(), item.getNome()))
            .toList();
        return lov;
    }

    public List<ListOfValues> getListOfCargos() {
        List<ListOfValues> lov = cargoRepository.findAll(Sort.by(Sort.Direction.ASC, "nome"))
            .stream()
            .map(item -> new ListOfValues(item.getId(), item.getId() + "/" + item.getNome()))
            .toList();
        return lov;
    }

    public List<ListOfValues> getListOfUf() {
        List<ListOfValues> lov = Arrays.asList(Uf.values())
            .stream()
            .map(item -> new ListOfValues(item.name(), item.name()))
            .toList();
        return lov;
    }
}
