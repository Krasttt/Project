package com.project.controllers;

import com.project.domain.Test;
import com.project.repos.TestRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
public class MainController {

    final TestRepository testRepository;

    public MainController(TestRepository testRepository) {
        this.testRepository = testRepository;
    }


    @RequestMapping("/tests")
    public String showTests(
            @RequestParam (required = false,defaultValue = "") String filter,
            @RequestParam(value="name", required=false, defaultValue="User") String name,
            Model model){
        List<Test> tests = new ArrayList<>();
        if (filter!="" && !filter.isEmpty() ) {
            tests =testRepository.findByNameContaining(filter);
        } else tests = testRepository.findAllBy();
        model.addAttribute("tests",tests);
        model.addAttribute("name", name);
        return "tests";
    }

    @RequestMapping("/index")
    public String index(){
        return "index";
    }
}
