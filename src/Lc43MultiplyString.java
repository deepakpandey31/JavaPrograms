import java.util.Scanner;

//LC 43: multiplying 2 strings

public class Lc43MultiplyString
{
        void main()
        {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter 2 numbers in string");
            String num1=sc.nextLine(),num2=sc.nextLine();
            long a=0,b=0;
            if(num1.equals("0")|| num2.equals("0"))
                num2="0";
            for(int i=0; i<(num1.length()>num2.length()?num1.length():num2.length()); i++) {
                if (i < num1.length())
                    a = a * 10 + (long) num1.charAt(i) - 48;
                if (i < num2.length())
                    b = b * 10 + (long) num2.charAt(i) - 48;
            }
            a*=b;
            b=num1.length();
            num1="";
            for(int i=0; i<b+num2.length()&&a!=0; i++)
            {
                num1=(char)((a%10)+48)+num1;
                a/=10;
            }
            if(num2.equals("0"))
                num1="0";
            System.out.println(num1);
        }
}

