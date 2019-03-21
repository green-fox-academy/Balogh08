package com.greenfoxacademy.trialexam.service;

import com.greenfoxacademy.trialexam.model.Alias;
import com.greenfoxacademy.trialexam.repository.AliasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AliasService {

    @Autowired
    private AliasRepository aliasRepository;

    public List<Alias> listAll() {
        return new ArrayList<>(aliasRepository.findAll());
    }

    public Alias getById(Long id) {
        return aliasRepository.findById(id).get();
    }

    public void createAlias(Alias alias) {
        aliasRepository.save(alias);
    }


}
