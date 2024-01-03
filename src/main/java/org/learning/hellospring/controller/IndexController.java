package org.learning.hellospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Random;

@Controller
@RequestMapping("/")
public class IndexController {
    @GetMapping
    public String index(Model model){
        int randomNumber = generateRandomNumber();

        // Passa il numero random come attributo del Model
        model.addAttribute("randomNumber", randomNumber);

        return "home";
    }

    private int generateRandomNumber() {
        // Logica per generare un numero random
        Random random = new Random();
        return random.nextInt(6) + 1;
    }
}
