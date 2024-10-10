package com.example.RectangleExamlple;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ConrollerRect extends Figure {

    @GetMapping("/Rect")
    public String calc(@RequestParam(name = "a", defaultValue = "0") int a,
                           @RequestParam(name = "b", defaultValue = "0") int b, Model model){
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        model.addAttribute("result", area());
        return "tempRect";
    }
    @GetMapping("/Rect2")
    public String calc2(@RequestParam(name = "q", defaultValue = "0") int q,
                           @RequestParam(name = "w", defaultValue = "0") int w, Model model){
        System.out.println("q = " + q);
        System.out.println("w = " + w);
        model.addAttribute("result", perimeter());
        return "tempRect";
    }

    @Override
    public double perimeter() {
        return Math(2*(q+w));
    }

    @Override
    public double area() {
        return Math(a*b);
    }
}
