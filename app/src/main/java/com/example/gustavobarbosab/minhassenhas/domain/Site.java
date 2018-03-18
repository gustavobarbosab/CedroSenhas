package com.example.gustavobarbosab.minhassenhas.domain;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

import java.io.Serializable;

/**
 * Created by gustavobarbosab on 17/03/18.
 */

@DatabaseTable
public class Site implements Serializable{

    private static final long serialVersionUID = -222864131214757024L;

    @DatabaseField(columnName = "id",allowGeneratedIdInsert = true, generatedId = true)
    private int siteId;
    @DatabaseField(columnName = "url")
    private String url;
    @DatabaseField(columnName = "email")
    private String email;
    @DatabaseField(columnName = "password")
    private String password;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }



}
