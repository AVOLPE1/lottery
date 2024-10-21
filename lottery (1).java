import java.util.Scanner;
public class lottery
{
public static void main (String[] args) {
Scanner in = new Scanner (System.in);

System.out.print("please input your 1st number (1-9)");
int user1 = in.nextInt();
System.out.print("please input your 1st number (1-9)");
int user2 = in.nextInt();
System.out.print("please input your 1st number (1-9)");
int user3 = in.nextInt();


int a = (int)(Math.random() * 10);
int b = (int)(Math.random() * 10);
int c = (int)(Math.random() * 10);

if (user1 != a && user2 != b && user3 != c)
System.out.print("congrats, you lose! 🤡");
else if (user1 == a || user2 == b || user3 == c) {
    if (user1 !=a || user2 !=b || user3 != c)
    System.out.print("you won 10$");
    else
    System.out.print("you wone 20$");
}










    }
}