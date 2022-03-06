package pro.sky.skyprospringdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {
    private final CalculatorInterface calculatorInterface;

    public CalculatorController(CalculatorInterface calculatorInterface){
        this.calculatorInterface = calculatorInterface;
    }
    @GetMapping
    public String hello() {
        return "Добрый день, вот ваш калькулятор";
    }
    @GetMapping("/plus")
    public String plus(@RequestParam("num1") int num1, @RequestParam("num2") int num2){
        return num1 + " + " + num2 + " = " + calculatorInterface.plus(num1,num2);
    }
    @GetMapping("/minus")
    public String minus(@RequestParam("num1") int num1, @RequestParam("num2") int num2){
        return num1 + " - " + num2 + " = " + calculatorInterface.minus(num1,num2);
    }
    @GetMapping("/multiply")
    public String multiply(@RequestParam("num1") int num1, @RequestParam("num2") int num2){
        return num1 + " * " + num2 + " = " + calculatorInterface.multiply(num1,num2);
    }
    @GetMapping("/divide")
    public String divide(@RequestParam("num1") int num1, @RequestParam("num2") int num2){
        return num1 + " / " + num2 + " = " + calculatorInterface.divide(num1,num2);
    }

}
