package com.greenfoxacademy.rest.Service;

import com.greenfoxacademy.rest.Repository.LogRepository;
import com.greenfoxacademy.rest.model.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LogService  {
    private LogRepository logRepository;

    @Autowired
    public LogService(LogRepository logRepository) {
        this.logRepository = logRepository;
    }

    public List<Log> listAll() {
        return logRepository.findAll();
    }

    public void saveLog(String endpoint, String data) {
        logRepository.save(new Log(endpoint, data));
    }
}
