import java.util.*;

class switchExample
{
public static void main(String arg[])
{
int mySwitch;
System.out.println("Choose one of options (1 to 3) :");
Scanner myScanner=new Scanner(System.in);
mySwitch =myScanner.nextInt();

switch(mySwitch)
{
case  1:
System.out.println("This is the number one");
break;
case  2:
System.out.println("This is the number two");
break;
case  3:
System.out.println("This is the number three");
break;
}
}
}
