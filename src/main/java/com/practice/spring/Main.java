package com.practice.spring;


import com.practice.spring.logic.JavaSort;
import com.practice.spring.logic.Sort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Sort<String> sort = new JavaSort<>();

        System.out.println("[result] : " + sort.sort(Arrays.asList(args)));
    }
}
