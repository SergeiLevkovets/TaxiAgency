package com.taxiagency.dao;

import com.taxiagency.domain.Entity;

import java.util.*;

public class RamDao<T extends Entity> implements Dao<T>{

    private Map<String, T> ram;

    public RamDao(){
        this.ram = new HashMap<>();
    }

    @Override
    public void save(T obj) {
        ram.put(obj.getId(), obj);
    }

    @Override
    public void update(T obj) {
        ram.put(obj.getId(), obj);
    }

    @Override
    public void upsert(T obj) {
        ram.put(obj.getId(), obj);
    }

    @Override
    public void delete(T obj) {
        ram.remove(obj.getId());
    }

    @Override
    public T findById(String id) {
        return ram.get(id);
    }

    @Override
    public List<T> findAll() {
        List<T> list = new ArrayList<>();
        Set<String> keys = ram.keySet();
        for (String key : keys){
            T obj = ram.get(key);
            list.add(obj);
        }
        return list;
    }
}
