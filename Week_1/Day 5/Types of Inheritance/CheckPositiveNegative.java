public class CheckPositiveNegative extends CheckOddEven {
    boolean oddEven;

    CheckPositiveNegative(int value){
        super();                                //super() must be the first statement in a constructor 
        oddEven = OddOrEven(value);
        if(value < 0){
            if(oddEven){
                System.out.println("It is a Negative Even NUmber");
            }else{
                System.out.println("It is a Negative Odd Number");
            }
        }else{
            if(oddEven){
                System.out.println("It is a Positive Even NUmber");
            }else{
                System.out.println("It is a Positive Odd Number");
            }
        }
    }


}