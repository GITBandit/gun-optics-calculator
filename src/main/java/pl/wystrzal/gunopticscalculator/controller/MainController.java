package pl.wystrzal.gunopticscalculator.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import pl.wystrzal.gunopticscalculator.model.CmToMoaConverter;
import pl.wystrzal.gunopticscalculator.model.Result;


@Controller
public class MainController {

    @GetMapping("/")
    public String mainPage(Model model){

        Result result = new Result(0,0,0,0,0,0,0);

        //CmToMoaConverter cmToMoaConverter = new CmToMoaConverter();

/*        Result result = cmToMoaConverter.getResult(deviation, distance);
              *//*  290.888208,10000);*/

        model.addAttribute("result", result);

        return "index";
    }

    @PostMapping("/")
    public String mainPage(@RequestParam("deviation") Double deviation,
                           @RequestParam("distance") Double distance,
                           Model model){

        CmToMoaConverter cmToMoaConverter = new CmToMoaConverter();

        try {
            Result result = cmToMoaConverter.getResult(deviation, distance);
            model.addAttribute("result", result);
            model.addAttribute("deviation", deviation);
            model.addAttribute("distance", distance);
        } catch (NullPointerException e){
            return "incorrect_values";
        }
        /*  290.888208,10000);*/


        return "index";
    }

}
