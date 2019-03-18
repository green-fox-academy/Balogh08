package com.greenfoxacademy.rest.Service;

import com.greenfoxacademy.rest.Repository.LogRepository;
import com.greenfoxacademy.rest.model.Log;
import com.greenfoxacademy.rest.model.LogServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LogService implements LogServiceInterface {
    private LogRepository logRepository;

    @Autowired
    public LogService(LogRepository logRepository) {
        this.logRepository = logRepository;
    }

    public List<Log> listAll() {
        return logRepository.findAll();
    }

    public void log(String endpoint, String data) {
        logRepository.save(new Log(endpoint, data));
    }

    public long countEntries() {
        return logRepository.count();
    }
}
