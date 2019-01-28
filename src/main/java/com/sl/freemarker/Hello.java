package com.sl.freemarker;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("con")
public class Hello {
    @RequestMapping(value = "helloFtl")
    public String helloFtl(Model model) {
        model.addAttribute("hello", "hello world!");
        return "helloFtl";
    }
}
