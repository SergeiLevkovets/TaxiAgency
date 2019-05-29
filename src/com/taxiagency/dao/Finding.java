package com.taxiagency.dao;

import com.taxiagency.domain.Car;
import com.taxiagency.domain.Entity;

import java.util.ArrayList;
import java.util.List;

public class Finding<K extends Entity, J>  {
    public List<K> findBy(J obj, Find find) {
//        List<K> list = findAll();
        List<K> kList = new ArrayList<>();
        /*J j = k.find;
        for (K k : list) {
            if (j.equals(obj)) {
                kList.add(k);
            }
        }*/
        return kList;
    }
}
