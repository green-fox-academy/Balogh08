package com.greenfoxacademy.trialexam.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Alias {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String url;
    private String aliasName;
    private int hitCount;
    private String secretCode;

    public Alias() {
        secretCode = String.format ("%04d" ,(int) (Math.random() * 10000));
        hitCount = 0;
    }

    public Alias(String url, String alias) {
        this.url = url;
        this.aliasName = aliasName;
        hitCount = 0;
        secretCode = String.format ("%04d" ,(int) (Math.random() * 10000));
    }

    public long getId() {
        return id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getAliasName() {
        return aliasName;
    }

    public void setAliasName(String aliasName) {
        this.aliasName = aliasName;
    }

    public int getHitCount() {
        return hitCount;
    }

    public void setHitCount(int hitCount) {
        this.hitCount = hitCount;
    }

    public String getSecretCode() {
        return secretCode;
    }
}
