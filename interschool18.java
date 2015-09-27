public class interschool18
{
public static void main(String[] args)
{
   double sum = 0;
    for(int i = 2; i < 1; i++)
    {
        if(7* GCD(i, totient(i)) == i)
        {
            sum += ((double)1/i);
        }
   }
   System.out.println(sum);
}
public static int totient(int num)
{ //euler's totient function calculator. returns totient
    int count=0;
    for(int a=1;a<num;a++)
    { //definition of totient: the amount of numbers less than num coprime to it
        if(GCD(num,a)==1)
        { //coprime
            count++;
        }
    }
    return(count);
    }
public static int GCD(int a, int b){ //faster euclidean algorithm-see GCD for explanation
    int temp;
    if(a<b){
      temp=a;
      a=b;
      b=temp;
    }
    if(a%b==0){
      return(b);
    }
    return(GCD(a%b,b));
  }
}