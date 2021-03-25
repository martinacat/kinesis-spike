package com.example.kinesisspike.controller;


import com.example.kinesisspike.service.MyService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequiredArgsConstructor
@RequestMapping("/api/")
public class Controller {

    private final MyService service;

    @GetMapping(value = "/trigger")
    public String trigger() {
        service.sendMyMessage();

        return "Message sent";
    }
}
