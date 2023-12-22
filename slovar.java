import java.util.Scanner;
public class slovar{
public static void main(String[] arg){
Scanner s=new Scanner(System.in);
System.out.println("Welcome to the dictionary!");
String a=s.nextLine();


switch (a) {
case "Hello":
System.out.println("Privet");
break;

case "Bye":
System.out.println("Poka");
break;

default:
System.out.println("Ne bilo naydeno v slovare");
}


}


}