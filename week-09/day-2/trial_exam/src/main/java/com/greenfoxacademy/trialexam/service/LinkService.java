package com.greenfoxacademy.trialexam.service;

import com.greenfoxacademy.trialexam.model.Link;
import com.greenfoxacademy.trialexam.repository.LinkRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class LinkService {
    private LinkRepository linkRepository;

    @Autowired
    public LinkService(LinkRepository linkRepository) {
        this.linkRepository = linkRepository;
    }

    public List<Link> listAll() {
        return new ArrayList<>(linkRepository.findAll());
    }

    public void add(String urlName, String alias) {
        Link result = new Link(urlName, alias);
        linkRepository.save(result);
    }

    public Link findByUrl(String urlName) {
        return linkRepository.findBy
    }

//    public Link findbyAlias() {
//        return linkRepository.findAllById();
//    }
}
