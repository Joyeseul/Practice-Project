package com.ysjo.example.model;

import org.springframework.boot.autoconfigure.domain.EntityScan;

@EntityScan
public class Member {

    private long idx;
    private String id;
    private String email;

    public long getIdx() {
        return idx;
    }

    public void setIdx(long idx) {
        this.idx = idx;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
