import java.util.Scanner;
public class JavaExample
{
    public static void main(String[]args)
    {
        int num;
        System.out.print("Enter an Integer number: ");


        Scanner scanner = new Scanner(System.in);
        num = scanner.nextInt();

        // If number is divisible by 2 then it's an even number
        //else it is an odd number
        if ( num % 2 == 0 )
            System.out.println(num+" is an even number.");
        else
            System.out.println(num+" is an odd number.");
    }
}



//                    או אפשר גם ככה:
//        import java.util.Scanner;
//        public class JavaExample {
//
//            public static void main(String[] args) {
//
//                Scanner scanner = new Scanner(System.in);
//
//                System.out.print("Enter an Integer number: ");
//                int num = scanner.nextInt();
//
//                //checking if else using ternary operator
//                //ternary operator syntax: condition ? expression1 : expression2
//                // if condition is true, expression1 executes else expression2
//                String evenOrOdd = (num % 2 == 0) ? "even number" : "odd number";
//
//                System.out.println(num + " is an " + evenOrOdd);

//}}