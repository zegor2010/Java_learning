package Projects.Math;

import java.math.BigInteger;

public class Factorial {
    public static BigInteger factorial(int number){
        BigInteger result = BigInteger.ONE;
        if(number < 1){
            System.out.println("wrong number");
            return result;
        }
        for (int i = 1; i <= number; i++){
            result = result.multiply(new BigInteger(i + ""));
        }
        return result;
    }
}

