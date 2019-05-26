package com.taxiagency.dao;

import com.taxiagency.domain.Entity;

import java.io.File;
import java.io.FileWriter;
import java.util.List;

public class FileDao<T extends Entity> implements Dao<T>{

    private File file;
    private String fileName;

    public FileDao(String fileName) {
        this.fileName = fileName;
        this.file = new File(this.fileName);
    }

    @Override
    public void save(Entity obj) {
        FileWriter fw = new FileWriter(fileName);


    }

    @Override
    public void update(Entity obj) {

    }

    @Override
    public void upsert(Entity obj) {

    }

    @Override
    public void delete(Entity obj) {

    }

    @Override
    public T findById(String id) {
        return null;
    }

    @Override
    public List findAll() {
        return null;
    }
}
