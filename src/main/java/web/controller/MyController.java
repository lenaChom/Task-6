package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.CarService.CarService;

@Controller
public class MyController {

    private CarService carService;

    public MyController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping("/cars")
    public String getCar(Model model, @RequestParam(value = "count", required = false) Integer count) {
        model.addAttribute("car", carService.getCars(count));
        return "cars";
    }
}
