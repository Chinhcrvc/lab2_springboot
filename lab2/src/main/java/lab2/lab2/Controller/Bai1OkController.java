package lab2.lab2.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;




@Controller
public class Bai1OkController {
@RequestMapping("/ctrl/ok")
public String ok(){
    return"bai1/ok";
}

@GetMapping("/ctrl/ok")
public String m2(Model model){
    model.addAttribute("method", "m2()");
    return "bai1/ok";
} 
@PostMapping("/ctrl/ok")  
public String method(Model model, @RequestParam(value = "x", required = false )String x) { 
    if ( x!=null&&!x.isEmpty()) {  
        return m3(model);  
    } else {  
        return m1(model);  
    }  
}  

public String m1(Model model) {  
    model.addAttribute("method", "m1()");  
    return "bai1/ok"; 
}  

public String m3(Model model) {  
    model.addAttribute("method", "m3()");  
    return "bai1/ok";  
}
}
