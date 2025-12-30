package Projects.Math;

public class MyInteger {
    private int value;

    public MyInteger(int value){
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public boolean isEven(){
        return value % 2 == 0;
    }
    public boolean isOdd(){
        return value % 2 != 0;
    }
    public boolean isPrime(){
        for(int i = 2; i < value; i++){
            if(value % i == 0){
                return true;
            }
        }
        return false;
    }

    public boolean isEven(int number){
        return number % 2 == 0;
    }
    public boolean isOdd(int number){
        return number % 2 != 0;
    }
    public boolean isPrime(int number){
        for(int i = 2; i < number; i++){
            if(number % i == 0){
                return true;
            }
        }
        return false;
    }

    public boolean isEven(MyInteger integer){
        return integer.value % 2 == 0;
    }
    public boolean isOdd(MyInteger integer){
        return integer.value % 2 != 0;
    }
    public boolean isPrime(MyInteger integer){
        for(int i = 2; i < integer.value; i++){
            if(integer.value % i == 0){
                return true;
            }
        }
        return false;
    }


}
