package lab2.lab2.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;



@Controller
public class Bai3ProductController {
    @GetMapping("/product/form")
    public String form(Model model) {
        return "bai3/product";
    }

    @PostMapping("/product/save")
    public String save(Model model, @RequestParam("name") String name, @RequestParam("price") Double price) {
        model.addAttribute("name", name);
        model.addAttribute("price", price);
        return "bai3/product";
    }
    
}
