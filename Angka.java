import java.util.Scanner;

public class Angka {
    public static void main(String[] args) {
        Scanner userinput = new Scanner(System.in);
        System.out.print("Masukkan Input: ");
        String input = userinput.nextLine();

       try {
           long number = Long.parseLong(input);

           System.out.print(number + " can be fitted in: \n");
           boolean Valid = false;

           if(number >= Byte.MIN_VALUE && number <= Byte.MAX_VALUE) {
            System.out.print("- byte\n");
            Valid = true;
           }
           if(number >= Integer.MIN_VALUE && number <= Integer.MAX_VALUE) {
            System.out.print("- int\n");
            Valid = true;
           }
           if(number >= Long.MIN_VALUE && number <= Long.MAX_VALUE) {
            System.out.print("- long\n");
            Valid = true;
           }
           if(number >= Short.MIN_VALUE && number <= Short.MAX_VALUE) {
            System.out.print("- short\n");
            Valid = true;
           }
           if(!Valid) {
            System.out.println("NULL");
           }
       } catch (NumberFormatException e) {
        System.out.println("Input is not valid!");
       }
       userinput.close();
    }
}