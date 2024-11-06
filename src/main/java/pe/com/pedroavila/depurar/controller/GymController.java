package pe.com.pedroavila.depurar.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GymController {

    @GetMapping("/listGyms")
    public String gyms() {

        return "index-gym";
    }

}
