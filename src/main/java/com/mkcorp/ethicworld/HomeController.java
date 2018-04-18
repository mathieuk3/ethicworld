package com.mkcorp.ethicworld;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
public class HomeController {

    @RequestMapping("/")
    public String home() throws IOException {
        return "I see you!";
    }

}
