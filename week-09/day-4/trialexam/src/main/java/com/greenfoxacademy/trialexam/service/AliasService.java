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
        if (aliasRepository.findById(id) != null) {
            return aliasRepository.findById(id).get();
        }
        return null;
    }

    public void createAlias(Alias alias) {
        aliasRepository.save(alias);
    }

    public boolean isExist(String aliasName) {
        List<Alias> aliases = new ArrayList<>(aliasRepository.findAll());
        for (Alias alias : aliases) {
            if (alias.getAliasName().equalsIgnoreCase(aliasName)) {
                aliasRepository.findById(alias.getId()).get().setDuplicate(true);
                return true;
            }
        }
        return false;
    }

    public Alias getByAliasName(String aliasName) {
        if (aliasRepository.findAliasByAliasName(aliasName) != null) {
            return aliasRepository.findAliasByAliasName(aliasName);
        }
        return null;
    }

    public void increaseHits(String aliasName) {
        for (Alias alias : aliasRepository.findAll()) {
            if (alias.getAliasName().equalsIgnoreCase(aliasName)) {
                alias.setHitCount();
                aliasRepository.save(alias);
                System.out.println(alias.getHitCount());
            }
        }
    }

    public void removeAlias(Long id) {
        aliasRepository.deleteById(id);
    }

    public List<String> getSecretCodes() {
        List<String> secretCodes = new ArrayList<>();
        for (Alias alias : aliasRepository.findAll()) {
            secretCodes.add(alias.getSecretCode());
        }
        return secretCodes;
    }

    public boolean existById(Long id) {
        return aliasRepository.existsById(id);
    }
}
