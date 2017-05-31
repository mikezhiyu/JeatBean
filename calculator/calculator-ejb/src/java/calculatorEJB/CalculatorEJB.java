
package calculatorEJB;

import javax.ejb.Stateless;


@Stateless

public class CalculatorEJB implements CalculatorEJBLocal {

    @Override
    public double add(double val1, double val2) {
        System.out.printf("calculator.add(%f, %f)\n", val1, val2);
        
        return val1+val2;
    }

    
}
