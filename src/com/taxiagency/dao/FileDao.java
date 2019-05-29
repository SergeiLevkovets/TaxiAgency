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
        //Читаем строки из файла в список
        List<String> list = fileRead();
        //Проверяем наличие объекта, если находим break;
        for (int i = 0, j = list.size(); i < j; i++) {
            if (list.get(i).contains("id: " + obj.getId() + ";")) {
               return;
            }
        }
        //Записываем строку в файл
        list.add(obj.toString());

        //Записываем список в файл
        fileWrite(list);
    }

    @Override
    public void update(T obj) {
        //Читаем строки из файла в список
        List<String> list = fileRead();

        //Переписываем объект в списке
        for (int i = 0, j = list.size(); i < j; i++) {
            if (list.get(i).contains("id: " + obj.getId() + ";")) {
                list.set(i, obj.toString());
            }
        }

        //Записываем список в файл
        fileWrite(list);
    }

    @Override
    public void upsert(T obj) {
        //Читаем строки из файла в список
        List<String> list = fileRead();

        //Переписываем объект в списке
        for (int i = 0, j = list.size(); i < j; i++) {
            if (list.get(i).contains("id: " + obj.getId() + ";")) {
                list.set(i, obj.toString());
                return;
            }
        }
        //Если объект не найден добовляем новый
            list.add(obj.toString());

        //Записываем список в файл
        fileWrite(list);

    }

    @Override
    public void delete(T obj) {
        //Читаем строки из файла в список
        List<String> list = fileRead();

        //Удаляем объект из списка
        for (int i = 0, j = list.size(); i < j; i++) {
            if (list.get(i).contains("id: " + obj.getId() + ";")) {
                list.remove(i);
            }
        }

        //Записываем список в файл
        fileWrite(list);

    }

    @Override
    public T findById(String id) {
        T obj = null;
        //Читаем строки из файла в список
        List<String> list = fileRead();

        //Ищем объект в списке
        String str;
        for (int i = 0, j = list.size(); i < j; i++) {
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
        //Читаем строки из файла в список
        List<String> listObj = fileRead();
//?????? как преобразовать в List<T>
        for (String s : listObj){

        }
        return list;
    }

    private void fileWrite(List<String> list){
        try ( FileWriter fw = new FileWriter(file);
              BufferedWriter bw = new BufferedWriter(fw)
        ){
            for (String s : list) {
                bw.write(s + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private  List<String> fileRead(){
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
