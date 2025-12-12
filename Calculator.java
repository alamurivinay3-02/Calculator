import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Enter the operator to perform the operation");
        int solution = sc.nextInt();

        switch(solution)
        {
            case 1:
                System.out.println("Solution: "+(a+b));
                break;

            case 2:
                System.out.println("Solution: "+(a-b));
                break;
            case 3:
                System.out.println("Solution: "+(a*b));
                break;
            case 4:
                if(b==0)
                {
                    System.out.println("cannot be divided...");
                    break;
                }
                else
                {
                    System.out.println("Solution: "+(a/b));

                }
                break;

            case 5:
                System.out.println("default");
        }
        
    }
}
