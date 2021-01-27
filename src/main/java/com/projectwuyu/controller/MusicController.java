package com.projectwuyu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MusicController {

    @GetMapping(value="/bins")
    public String getBinInfo(@RequestParam(value="wasteId", required=false) String wasteId) {
       return "hello " + wasteId;
    }

}
