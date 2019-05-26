package com.taxiagency.dao;

import com.taxiagency.domain.Entity;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class FileDao<T extends Entity> implements Dao<T>{

    private File file;
    private String fileName;

    public FileDao(){
        this.file = new File("com/taxiagency/File/FileDao.txt");
    }

    public FileDao(String fileName) {
        this.fileName = fileName;
        this.file = new File(this.fileName);
        try {
            if (!this.file.exists()){
                this.file.createNewFile();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void save(Entity obj) {

        try (FileWriter fw = new FileWriter(fileName, true);
             BufferedWriter bw = new BufferedWriter(fw)){
            bw.write(obj.toString() + System.getProperty("line.separator"));
        } catch (IOException e) {
            e.printStackTrace();
        }
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
