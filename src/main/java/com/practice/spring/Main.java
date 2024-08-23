package com.practice.spring;


import com.practice.spring.config.Config;
import com.practice.spring.logic.BubbleSort;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);

        Sort<String> sort = new BubbleSort<>();


        System.out.println("[result] : " + sort.sort(Arrays.asList(args)));
    }
}
