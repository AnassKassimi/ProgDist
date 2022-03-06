package springboot.employee.controller;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/")
public class Error implements ErrorController {

    private static final String PATH = "";

    @GetMapping(value = PATH)
    public String error(Model model) {

        return "error/error404";
    }

    public String getErrorPath() {
        return PATH;
    }
}