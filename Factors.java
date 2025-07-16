import java.util.*;
class Factorial 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a non-negative integer: ");
        int n=sc.nextInt();
        int c=0;
        for(int i=1; i<=n; i++)
        {
            if(n%i==0)
            {
                c++;
                if(c==1)
                {
                    System.out.println(i);
                }
                else
                {
                    System.out.println(" ,"+i);
                }
            }
        }
    } 
}