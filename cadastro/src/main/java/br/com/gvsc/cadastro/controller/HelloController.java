package br.com.gvsc.cadastro.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cadastro")
@Slf4j
public class HelloController {

    @GetMapping("get")
    public String get(){
        log.info("*********** chamou aqui *********");
        return "microservice de cadastro";
    }
}
