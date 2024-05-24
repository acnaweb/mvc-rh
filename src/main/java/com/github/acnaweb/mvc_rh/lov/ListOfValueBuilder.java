package com.github.acnaweb.mvc_rh.lov;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.github.acnaweb.mvc_rh.repository.DepartamentoRepository;

@Component
public class ListOfValueBuilder {

    @Autowired
    private DepartamentoRepository repository;

    public List<ListOfValues> getListOfDepartamentos() {
        List<ListOfValues> lov = repository.findAll().stream().map(d -> new ListOfValues(d.getId(), d.getNome())).toList();
        return lov;
    }

}
