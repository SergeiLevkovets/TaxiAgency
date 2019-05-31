package com.taxiagency.dao;

import com.taxiagency.domain.Entity;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public  class Finding<T extends Entity, J>   {


    public List<T> find(List<T> list, J findBy, Function<T, J> getData) {
        List<T> ts = new ArrayList<>();
        for (T passenger : list) {
            if (getData.apply(passenger).equals(findBy)) {
                ts.add(passenger);
            }
        }
        return ts;
    }
}
