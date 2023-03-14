package com.example.XLReader.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class XlReaderController {

    @GetMapping("/xlReader")
    public String getView(){
        return "reader";
    }
}
