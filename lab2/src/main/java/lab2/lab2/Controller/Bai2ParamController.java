package lab2.lab2.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class Bai2ParamController {
    @RequestMapping("/param/form")
    public String form(Model model) {
        return "bai2/form";
    }
    
    @RequestMapping("/param/save/{x}")
    public String save(Model model, @PathVariable("x") String x, @RequestParam("y") String y) {
        model.addAttribute("x", x);
        model.addAttribute("y", y);
        return "bai2/form";
    }
    
}
