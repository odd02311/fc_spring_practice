package com.practice.spring.logic;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Component
public class JavaSort <T extends Comparable<T>> implements Sort<T>{

    @Override
    public List<T> sort(List<T> list) {
        List<T> result = new ArrayList<>(list);
        Collections.sort(result);

        return result;
    }

}
