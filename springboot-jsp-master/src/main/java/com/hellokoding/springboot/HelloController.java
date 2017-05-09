package com.hellokoding.springboot;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.conection.query;
@Controller
public class HelloController {


    
    @RequestMapping("/")
    public String homePage() {
    
        return "index";
    }
 
}
  

     
  
    

    	
    	
    
    

