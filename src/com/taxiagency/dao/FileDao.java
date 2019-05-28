package com.taxiagency.dao;

import com.taxiagency.domain.Entity;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileDao<T extends Entity> implements Dao<T> {

    private File file;
    private String fileName = ".\\src\\com\\taxiagency\\File\\FileDao.txt";

    public FileDao() {

        this.file = new File(fileName);
    }

    @Override
    public void save(T obj) {
        try (FileWriter fw = new FileWriter(file, true);
             BufferedWriter bw = new BufferedWriter(fw)
        ) {
            //Записываем строку в файл
            String str = obj.toString();
            bw.write(str + "\n");

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void update(T obj) {
        try (FileReader fr = new FileReader(file);
             BufferedReader br = new BufferedReader(fr);
             FileWriter fw = new FileWriter(file);
             BufferedWriter bw = new BufferedWriter(fw)
        ) {
            //Читаем строки из файла в список
            List<String> list = new ArrayList<>();
            String str;
            while ((str = br.readLine()) != null ){
                list.add(str);
            }
            //Переписываем объект в списке
            for (int i = 0, j = list.size(); i < j; i++) {
                if (list.get(i).contains("id: " + obj.getId() + ";")){
                    list.set(i, obj.toString());
                }
            }
            //Записываем список в файл
            for (String s : list){
                bw.write(s + "\n");
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void upsert(T obj) {

        try (FileReader fr = new FileReader(file);
             BufferedReader br = new BufferedReader(fr);
             FileWriter fw = new FileWriter(file);
             BufferedWriter bw = new BufferedWriter(fw)
        ) {
            //Читаем строки из файла в список
            List<String> list = new ArrayList<>();
            String str;
            while ((str = br.readLine()) != null ){
                list.add(str);
            }
            //Переписываем объект в списке
            Boolean contain = true;
            for (int i = 0, j = list.size(); i < j; i++) {
                if (list.get(i).contains("id: " + obj.getId() + ";")){
                    list.set(i, obj.toString());
                    contain = false;
                }
            }
            //Если объект не найден добовляем новый
            if (contain){
                list.add(obj.toString());
            }
            //Записываем список в файл
            for (String s : list){
                bw.write(s + "\n");
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void delete(T obj) {

        try (FileReader fr = new FileReader(file);
             BufferedReader br = new BufferedReader(fr);
             FileWriter fw = new FileWriter(file);
             BufferedWriter bw = new BufferedWriter(fw)
        ) {
            //Читаем строки из файла в список
            List<String> list = new ArrayList<>();
            String str;
            while ((str = br.readLine()) != null ){
                list.add(str);
            }
            //Удаляем объект из списка
            for (int i = 0, j = list.size(); i < j; i++) {
                if (list.get(i).contains("id: " + obj.getId() + ";")){
                    list.remove(i);
                }
            }
            //Записываем список в файл
            for (String s : list){
                bw.write(s + "\n");
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @Override
    public T findById(String id) {
            T obj = null;
        try (FileReader fr = new FileReader(file);
             BufferedReader br = new BufferedReader(fr);
        ) {
            //Читаем строки из файла в список
            List<String> list = new ArrayList<>();
            String str;
            while ((str = br.readLine()) != null ){
                list.add(str);
            }
            //Ищем объект в списке
            for (int i = 0, j = list.size(); i < j; i++) {
                if (list.get(i).contains("id: " + id + ";")){
                    str = list.get(i);
                }
            }



        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
return null;
    }

    @Override
    public List<T> findAll() {
        List<T> list = null;
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))
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
