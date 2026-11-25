package web.mvc.cicd02_boot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
    @GetMapping("/")
    public String index(){ return "GitHub Actions를 이용한 first CI/CD TEST- github action에서 모든일 하기~~"; }

}
