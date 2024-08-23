package com.practice.logic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class JavaSort <T extends Comparable<T>> implements Sort<T>{

    @Override
    public List<T> sort(List<T> list) {
        List<T> result = new ArrayList<>(list);
        Collections.sort(result);

        return result;
    }

}
