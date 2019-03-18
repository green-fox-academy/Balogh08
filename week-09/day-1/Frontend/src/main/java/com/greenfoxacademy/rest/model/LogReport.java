package com.greenfoxacademy.rest.model;

import java.util.List;

public class LogReport {
    private LogServiceInterface service;
    private List<Log> entries;
    private long entry_count;

    public LogReport(LogServiceInterface service) {
        this.service = service;
        entries = service.listAll();
        entry_count = service.countEntries();
    }
}
