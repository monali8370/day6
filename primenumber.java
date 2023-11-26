//day6
// 3. Prime Number
// Just like the Perfect number, the Prime number is also a special type of number.
// When the number is divided greater than 1 and divided by 1 or itself is referred
// to as the Prime number. 0 and 1 are not counted as prime numbers.
// All the even numbers can be divided by 2, so 2 is the only even prime minister.

public class primenumber {
    public static void main(String[] args){
        int i,m=0,flag=0;
        int n=5;
        m=n/2;
        if(n==0 ||n==1)
        {
            System.out.println("it is not prime number");
        }
        else{
            for(i=2;i<=m;i++)
            {
                if(n%i==0){
                    System.out.println("it is not prime number");
                    flag=0;
                    break;
                }
            }
            if(flag==0)
            {
                System.out.println(n+"it is prime number");
            }
        }
    }
}
