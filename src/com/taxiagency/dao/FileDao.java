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

    public void setFile(File file) {
        this.file = file;
    }

    @Override
    public void save(T obj) {
        List<String> list = fileRead(); //Читаем строки из файла в список
        for (int i = 0, j = list.size(); i < j; i++) {            //Проверяем наличие объекта, если находим break;
            if (list.get(i).contains("id: " + obj.getId() + ";")) {
                return;
            }
        }
        list.add(obj.toString());   //Записываем строку в файл
        fileWrite(list);    //Записываем список в файл
    }

    @Override
    public void update(T obj) {
        List<String> list = fileRead();      //Читаем строки из файла в список
        for (int i = 0, j = list.size(); i < j; i++) {      //Переписываем объект в списке
            if (list.get(i).contains("id: " + obj.getId() + ";")) {
                list.set(i, obj.toString());
            }
        }
        fileWrite(list);        //Записываем список в файл
    }

    @Override
    public void upsert(T obj) {
        List<String> list = fileRead();     //Читаем строки из файла в список
        for (int i = 0, j = list.size(); i < j; i++) {       //Переписываем объект в списке
            if (list.get(i).contains("id: " + obj.getId() + ";")) {
                list.set(i, obj.toString());
                return;
            }
        }
        list.add(obj.toString());   //Если объект не найден добовляем новый
        fileWrite(list);    //Записываем список в файл

    }

    @Override
    public void delete(T obj) {
        List<String> list = fileRead();     //Читаем строки из файла в список
        for (int i = 0, j = list.size(); i < j; i++) {      //Удаляем объект из списка
            if (list.get(i).contains("id: " + obj.getId() + ";")) {
                list.remove(i);
            }
        }
        fileWrite(list);    //Записываем список в файл
    }

    @Override
    public T findById(String id) {
        T obj = null;
        List<String> list = fileRead();     //Читаем строки из файла в список
        String str;
        for (int i = 0, j = list.size(); i < j; i++) {      //Ищем объект в списке
            if (list.get(i).contains("id: " + id + ";")) {
                str = list.get(i);
            }
        }
        //Создаем новый объект
//Как создать из строки объект Т
// ????????  obj = new T(str);
        return null;
    }

    @Override
    public List<T> findAll() {
        List<T> list = null;
        List<String> listObj = fileRead();      //Читаем строки из файла в список
//?????? как преобразовать в List<T>
        for (String s : listObj) {

        }
        return list;
    }

    private void fileWrite(List<String> list) {
        try (FileWriter fw = new FileWriter(file);
             BufferedWriter bw = new BufferedWriter(fw)
        ) {
            for (String s : list) {
                bw.write(s + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private List<String> fileRead() {
        List<String> list = new ArrayList<>();
        try (FileReader fr = new FileReader(file);
             BufferedReader br = new BufferedReader(fr);
        ) {
            String str;
            while ((str = br.readLine()) != null) {
                list.add(str);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return list;
    }

}
