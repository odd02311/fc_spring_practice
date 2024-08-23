package com.practice.logic;

import java.util.ArrayList;
import java.util.List;

public class BubbleSort <T extends Comparable<T>> implements Sort<T> {

    @Override
    public List<T> sort(List<T> list) {

        List<T> result = new ArrayList<>(list);

        for(int i = result.size() - 1; i > 0; i--) {
            for(int j = 0; j < i; j++) {
                if(result.get(j).compareTo(result.get(j+1)) > 0) {
                    T temp = result.get(j);
                    result.set(j, result.get(j+1));
                    result.set(j+1, temp);
                }
            }
        }

        return result;

    }
}
