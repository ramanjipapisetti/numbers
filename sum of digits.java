import java.util.*;
class SumOfDigits 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int n =sc.nextInt();
        int sum = 0;

        // Loop to find the sum of digits
        while (n>0) 
        {
            int r= n% 10;
            n=n/10;
            sum=sum+r; 
        }

        System.out.println("Sum of digits: " + sum); 
    }
}