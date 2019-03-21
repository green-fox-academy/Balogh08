package com.greenfoxacademy.trialexam.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

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
    private boolean duplicate;

    public Alias() {
        secretCode = String.format ("%04d" ,(int) (Math.random() * 10000));
        hitCount = 0;
        duplicate = false;
    }

    public Alias(String url, String alias) {
        this.url = url;
        this.aliasName = aliasName;
        hitCount = 0;
        secretCode = String.format ("%04d" ,(int) (Math.random() * 10000));
        duplicate = false;
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

    public void setHitCount() {
        this.hitCount++;
    }

    @JsonIgnore
    public String getSecretCode() {
        return secretCode;
    }

    public boolean isDuplicate() {
        return duplicate;
    }

    public void setDuplicate(boolean duplicate) {
        this.duplicate = duplicate;
    }

    @Override
    public String toString() {
        if (!duplicate) {
            return "Your URL is aliased to <b>" + aliasName + "</b> and your secret code is <b>" + secretCode + "</b>";
        } else {
            return "Your alias is already in use!";
        }
    }
}
