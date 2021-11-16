package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.dao.CarsList;

@Controller
public class CarsController {

    private final CarsList carsList;

    @Autowired
    public CarsController(CarsList carsList) {
        this.carsList = carsList;
    }

    @GetMapping(value = "/cars")
    public String printCarsSelect(@RequestParam(value = "count", required = false) String count,
                                  ModelMap model) {
        model.addAttribute("msg", carsList.select(count));
        return "cars";
    }
}

