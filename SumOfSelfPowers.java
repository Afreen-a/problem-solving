import java.util.*;
import java.lang.Math;
import java.math.BigInteger;  
public class SumOfSelfPowers {

    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        BigInteger sum =BigInteger.valueOf(0);
        for(int i=1;i<=n;i++)
        {
            sum=sum.add(BigInteger.valueOf(i).pow(i));
        }
         BigInteger value = new BigInteger("10000000000");   
         sum = sum.mod(value);
         System.out.println(sum);
        
    }
}
