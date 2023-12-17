public class squareRootByNewtonMethod {
  public static void main(String[] args) {
    int n = 9;
    System.out.println("The square root pf the given number is " + sqrt(n));
  }

  private static double sqrt(int n) {
    double x = n , root;
    while(true){
      root = 0.5 * (x + (n/x));
      if(Math.abs(root-x) < 1){
        break;
      }
      x = root;
    }
    return root;
  }
}
