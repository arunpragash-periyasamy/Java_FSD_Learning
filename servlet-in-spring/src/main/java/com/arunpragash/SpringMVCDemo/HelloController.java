package com.arunpragash.SpringMVCDemo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;



@Controller
public class HelloController {
    @RequestMapping("/")
    public String home() {
        return "index";
    }

    // // With the http servlet and the http session
    // @RequestMapping("/add")
    // public String add(HttpServletRequest req, HttpSession session) {
    // int num1 = Integer.parseInt(req.getParameter("num1"));
    // int num2 = Integer.parseInt(req.getParameter("num2"));
    // int result = num1 + num2;
    // System.out.println(result);
    // session.setAttribute("result", result);
    // return "result.jsp";
    // }

    // // without http servlet
    // @RequestMapping("/add")
    // public String add(int num1, @RequestParam("num2") int num, HttpSession
    // session) {
    // int result = num1 + num;
    // System.out.println(result);
    // session.setAttribute("result", result);
    // return "result.jsp";
    // }

    // // without sessions
    // @RequestMapping("/add")
    // public String add(int num1, @RequestParam("num2") int num, Model model) {
    // int result = num1 + num;
    // System.out.println(result);
    // model.addAttribute("result", result);
    // return "result";
    // }

    // Sending a modelandview object instead of sending a jsp page
    @RequestMapping("/add")
    public ModelAndView add(int num1, @RequestParam("num2") int num, ModelAndView mv) {
        int result = num1 + num;
        System.out.println(result);
        mv.addObject("result", result);
        mv.setViewName("result");
        return mv;
    }

    @RequestMapping("/addAlien")
    public String addAlien(Alien alien) {
        return "result";
    }

}
