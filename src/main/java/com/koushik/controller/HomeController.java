package com.koushik.controller;

import com.koushik.exception.CustomerNotFoundException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customer")
public class HomeController {

    @GetMapping("/{cusId}")
    public String getCustomerById(@PathVariable Integer cusId)
    {
        if(cusId >100)
        {
            return "Koushik";
        }
        else {
            throw  new CustomerNotFoundException("Invalid customer Id");
        }
    }


    @GetMapping("/msg")
    public String getMsg()
    {
        return "Hello world";
    }
    @GetMapping("/hello")
    public String gethello()
    {
        return " Ho Gello";
    }

}
