package lab2.lab2.Controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;



@Controller
public class Bai4ProductController {
    @GetMapping("/products/form")
    public String form(Model model) {
        Product p = new Product();
        p.setName("Iphone 16");
        p.setPrice(46000.0);
        model.addAttribute("p", p);
        return "bai4/product";
    }
    
    @PostMapping("/products/save")
    public String save(@ModelAttribute("p") Product pro, Model model) {
    model.addAttribute("p", pro); 
    return "bai4/product";
    }
 
    @ModelAttribute("list")
    public List<Product> getItems(){
        return Arrays.asList(new Product("Bánh",11.0), new Product("Samsung", 12.0));
    }
}
