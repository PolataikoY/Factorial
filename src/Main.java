import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = scanner.nextInt();
        int firstStep = 1;
        do{
            if(calculateFactorial(firstStep) > num){
                firstStep = 0;
                break;
            }
            firstStep ++;
        }
        while(calculateFactorial(firstStep) != num);
        if(firstStep > 0){
            System.out.println(firstStep);
        } else {
            System.out.println("Wrong number");
        }
    }
    static int calculateFactorial(int n){
        int result = 1;
        for (int i = 1; i <=n; i ++){
            result = result*i;
        }
        return result;
    }
}
