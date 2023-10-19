public class MultiplyData {
    int a,b,c;
    MultiplyData(int a, int b,int c){
       this.a = a;
       this.b = b;
       this.c = c;
       displayData();
    }
    void displayData(){
         System.out.println("The product of the values are "+(a*b*c));
    }
}
