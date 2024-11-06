package pe.com.pedroavila.depurar.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ObjetivoController {

    @GetMapping("/listObjetivos")
    public String objetivos() {

        return "index-objetivo";
    }

}
