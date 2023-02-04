package ru.sladkkov.testserver.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@Slf4j
public class TestController {
    String personJson = """
            {
             "firstName" : "Danila",
             "lastName" : "Sladkov",
             "age" : 22
            }""";

    @GetMapping("/test")
    public ResponseEntity<String> testRestTemplateRequest() {
        return ResponseEntity.ok(personJson);
    }


}
