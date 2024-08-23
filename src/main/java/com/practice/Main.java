package com.practice;


import com.practice.logic.BubbleSort;
import com.practice.logic.JavaSort;
import com.practice.logic.Sort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Sort<String> sort = new JavaSort<>();

        System.out.println("[result] : " + sort.sort(Arrays.asList(args)));
    }
}
