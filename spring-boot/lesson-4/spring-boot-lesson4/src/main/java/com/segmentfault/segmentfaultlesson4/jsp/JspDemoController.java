package com.segmentfault.segmentfaultlesson4.jsp;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Working directory:
 * E:\Workspace\github\Framework\segmentfault-lessons\spring-boot\lesson-4\spring-boot-lesson4
 */
@Controller
public class JspDemoController {


    @RequestMapping("index")
    public String index(Model model) {

        model.addAttribute("message", "Mercy");

        return "index";
    }

}
