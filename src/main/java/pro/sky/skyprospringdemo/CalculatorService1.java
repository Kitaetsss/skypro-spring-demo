package pro.sky.skyprospringdemo;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService1 implements CalculatorInterface {
    @Override
    public int plus(int num1, int num2) {
        return num1 + num2;
    }
    @Override
    public int minus(int num1, int num2){
        return num1 - num2;
    }
    @Override
    public int divide(int num1, int num2){
        if(num2 == 0){
            throw new IllegalArgumentException("Делить на ноль нельзя");
        }
        return num1/num2;
    }
    @Override
    public int multiply(int num1, int num2){
        return num1 * num2;
    }
}
