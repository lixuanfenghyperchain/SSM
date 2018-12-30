package example.controller;

import example.pojo.Student;
import example.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@RequestMapping("/home")
public class IndexController {
    @Autowired
    private StudentService studentService;

    @RequestMapping("/index")
    public String index() {
        return "index";
    }


    @RequestMapping(value = "/string", method = RequestMethod.GET)
    @ResponseBody
    public String getString() {
        studentService.say();
        return "ok";
    }
}


