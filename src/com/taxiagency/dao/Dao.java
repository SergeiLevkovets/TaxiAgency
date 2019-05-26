package com.taxiagency.dao;

import com.taxiagency.domain.Entity;

import java.util.List;

public interface Dao<T extends Entity> {
    void save(T obj);

    void update(T obj);

    void upsert(T obj);

    void delete(T obj);

    T findById(String id);

    List<T> findAll();
}
