package com.practice.spring;


import com.practice.spring.config.Config;
import com.practice.spring.logic.JavaSort;
import com.practice.spring.logic.Sort;
import com.practice.spring.service.SortService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);

//        Sort<String> sort =  context.getBean(Sort.class); // new 키워드 없이 spring context에서 bean을 꺼내오는 코드

        SortService sortService = context.getBean(SortService.class);


//        Sort<String> sort = new JavaSort<>(); // 필요 X

        System.out.println("[result] : " + sortService.doSort(Arrays.asList(args)));
    }
}
