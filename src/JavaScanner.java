import java.util.Scanner;

public class JavaScanner {
public static void main(String []args) {

Scanner input = new Scanner(System.in);

    System.out.print( "What is your name ?" );
    String name = input.nextLine();
     System.out.print( "What is your age ?" );
    Integer age = input.nextInt();
     System.out.print( "What is your phone number?" );
   float phone = input.nextFloat();

     System.out.print( "Thank you " + name + ",I know you are " + age + ",And you number is"+ phone );






}

}
