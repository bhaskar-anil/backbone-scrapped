package in.taskoo.category.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class CategoryController {
    @GetMapping(value="/category")
    public String get() {
        return "new SomeData()";
    }
    
}