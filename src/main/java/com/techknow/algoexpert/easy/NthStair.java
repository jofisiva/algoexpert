import java.util.Scanner;
class NthStair
{
    public static void main(String[] args)
    {
        Scanner scanner =  new Scanner(System.in);

           System.out.println(NthStair.nSairCase(Integer.valueOf(scanner.nextLine()).intValue())    );
        //Read n value from keyboard
    }
    public static int nSairCase(int n) {
        if(n==2) return 2;
        if(n==1) return 1;

        if(n==0) return 0;

        return nSairCase(n-1) + nSairCase(n-2);
    }
}
