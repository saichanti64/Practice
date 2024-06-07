package com.example.Practice.PracticeController;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/prac")
public class PracController {

    @GetMapping("/getPrac")
    public String getDetails(){
        //comment line modified in master
        // master change
        // feature comment
        return "Getting Practice Details";
        
    }

}
