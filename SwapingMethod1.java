import java.util.Scanner;
class SwapingMethod1 {
    public static void main(String[] args){
    Scanner Y = new Scanner(System.in);
    int a,b;
    System.out.println("Enter Values:");
    a = Y.nextInt();
    b = Y.nextInt();
    System.out.println("Before Swapping:"+a+" "+b);
    a = a+b;
    b = a-b;
    a = a-b;
    System.out.println("After Swapping:"+a+" "+b);
    
    }  
}