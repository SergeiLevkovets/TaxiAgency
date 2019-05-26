package com.taxiagency.dao;

import com.taxiagency.domain.Entity;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileDao<T extends Entity> implements Dao<T> {

    private File file;
    private String fileName = "com/taxiagency/File/FileDao.txt";

    public FileDao() {
        this.file = new File(".\\src\\com\\taxiagency\\File\\FileDao.txt");
    }

    /*public FileDao(String fileName) {
        this.fileName = fileName;
        this.file = new File(this.fileName);
        try {
            if (!this.file.exists()) {
                this.file.createNewFile();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }*/

    @Override
    public void save(T obj) {
        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file));
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))
        ) {
            List<T> list = ((List<T>) ois.readObject());
            list.add(obj);
            oos.writeObject(list);

            } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void update(T obj) {

        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file, true));
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))
        ) {
            List<T> list = ((List<T>) ois.readObject());
            for (int i = 0; i < list.size(); i++) {
                if (obj.getId().equals(list.get(i).getId())){
                    list.set(i, obj);
                    oos.writeObject(list);
                    break;
                }
            }

        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void upsert(T obj) {

        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file, true));
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))
        ) {
            List<T> list = ((List<T>) ois.readObject());
            for (int i = 0; i < list.size(); i++) {
                if (obj.getId().equals(list.get(i).getId())){
                    list.set(i, obj);
                    oos.writeObject(list);
                    break;
                }
            }

            list.add(obj);
            oos.writeObject(list);

        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void delete(T obj) {

        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file, true));
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))
        ) {
            List<T> list = ((List<T>) ois.readObject());
            list.remove(obj);
            oos.writeObject(list);

        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }

    @Override
    public T findById(String id) {
        T t = null;
        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))
        ) {
            List<T> list = ((List<T>) ois.readObject());
            for (int i = 0; i < list.size(); i++) {
                if (id.equals(list.get(i).getId())){
                    t = list.get(i);
                }
            }
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return t;
    }

    @Override
    public List<T> findAll() {
        List<T> list = null;
        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))
        ) {
            list = ((List<T>) ois.readObject());


        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return list;
    }
}
