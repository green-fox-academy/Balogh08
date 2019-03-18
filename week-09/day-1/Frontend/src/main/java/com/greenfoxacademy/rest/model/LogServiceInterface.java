package com.greenfoxacademy.rest.model;

import java.util.List;

public interface LogServiceInterface {
    public List<Log> listAll();
    public void log(String endpoint, String data);
    public long countEntries();
}
