package com.example.dockerimg;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @GetMapping("/")
    public String welPage() {
        return "Welcome to Docker-Git Integration";
    }
    @GetMapping("/view")
    public String viewPage() {
        return "Welcome to View Page";
    }
    @GetMapping("/test")
    public String testPage() {
        return "This is test page";
    }
}
