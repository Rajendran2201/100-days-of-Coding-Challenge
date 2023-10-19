public class CheckOddEven{

    int value;
    
    public CheckOddEven() {
        super();
    }

    CheckOddEven(int value){
        super();
        this.value = value;  
    }

    boolean OddOrEven(int value){
        if(value % 2==0){
            return true;
        }else{
            return false;
        }
    }

}