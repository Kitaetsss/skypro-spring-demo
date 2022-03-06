package pro.sky.skyprospringdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {
    @GetMapping(path = "calculator")
    public String calculator(){
        return "<b>Добро пожаловать</b>";
    }
    @GetMapping(path = "calculator/multiply")
    public int multiply(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        return num1 * num2;
    }
}
