package com.practice.spring.controller;

import com.practice.spring.service.SortService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MainController {

    // 정렬 알고리즘 적용
    // 한번만 초기화 할꺼라서 final 키워드를 붙여주고, 한번만 초기화 할 수 있는 이유는 생성자 주입을 할 것이기 때문
    private final SortService sortService;

    // sortSertvice에 대한 의존성이 컨트롤러 생성자 단에서 API형식으로 노출 해서 주입을 받는다.
    // 나중에 web application에 뜨면 Spring container가 자동으로 해준다.
    public MainController(SortService sortService) {
        this.sortService = sortService;
    }

    @GetMapping("/")
    public String hello(@RequestParam List<String> list) {
        return sortService.doSort(list).toString();
    }
}
