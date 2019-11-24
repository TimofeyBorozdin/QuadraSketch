import java.util.Scanner;
import java.lang.Math;

public class QuadraSketch {
    public static void main(String[] args) {
        byte i = 0;
           
        Scanner Stop = new Scanner(System.in);
        String stopCheck = "stop";
        String nextCheck = "next";
        do{
            System.out.println();
            System.out.println("----EXERCISE: Hello!");
                
            Scanner abcIn = new Scanner(System.in);
            System.out.println("----EXERCISE: please enter 'a', 'b' and 'c'");
            double a = abcIn.nextDouble();
            double b = abcIn.nextDouble();
            double c = abcIn.nextDouble();
            
            System.out.println("----EXERCISE: a = " + a + ".");
            System.out.println("----EXERCISE: b = " + b + ".");
            System.out.println("----EXERCISE: c = " + c + ".");
            
            if(a > 0) {
                System.out.println("----EXERCISE: Since a > 0, we have a minimum.");
                discriminant(a, b, c);
            }
            else if(a < 0) {
                System.out.println("----EXERCISE: Since a < 0, we have a maximum.");
                discriminant(a, b, c);
            }
            else {
                System.out.println("----EXERCISE: This is not a quadratic function.");
            }
            
            System.out.println();
            System.out.println("----EXERCISE: The End.");
            
            if(i <= 2){
                System.out.println("-------------------------------------------------------------------------------------------------");
                System.out.println("-------------------------------------------------------------------------------------------------");
                System.out.println("Enter 'stop' if you want to stop or 'next' if you don't.");
                System.out.println("This exercise will run again automatically till you have no attempts left.");
                
                String choice = "";
                boolean m = choice.contains(stopCheck);
                boolean n = choice.contains(nextCheck);
                while((m == false)||(n == false)){
                    choice = Stop.nextLine();
                    if(choice.contains(stopCheck)){
                        System.out.println("I am stopped.");
                        break;
                    }
                    else if(choice.contains(nextCheck)){
                        System.out.println("Go next.");
                        break;
                    }
                    else{
                        System.out.println("Error. Please try again.");
                    }     
                }
                if(choice.contains(stopCheck)){
                        break;
                    }
            }
            i++;
                
            System.out.println("-------------------------------------------------------------------------------------------------");
            System.out.println("-------------------------------------------------------------------------------------------------");
                
            System.out.println("You have " + (20 - i) + " attempts left to this exercise.");
                
            System.out.println("-------------------------------------------------------------------------------------------------");
            System.out.println("-------------------------------------------------------------------------------------------------");
        }
        while (i < 20);
        
        System.out.println("Good bye! :)");
    }
    
    static void discriminant(double a, double b, double c) {
        double Yint = c;
        System.out.println("----EXERCISE: Y-intercept is equal to 'c' and is equal to " + c + ".");
                
        double D = Math.pow(b, 2) - 4 * a * c;
        System.out.println("----EXERCISE: The Discriminant is equal to " + D + ".");
        if(D > 0) {
            System.out.println("----EXERCISE: Since D > 0, we have real and distinct roots.");
            //---Roots
            roots(a, b, c, D);
            // --- TP
            tp(a, b, c);
        }
        else if (D == 0) {
            System.out.println("----EXERCISE: Since D = 0, we have real and repeated roots.");
            // --- Roots
            roots(a, b, c, D);
            // --- TP
            tp(a, b, c);
        }
        else if (D < 0) {
            System.out.println("----EXERCISE: Since D < 0, we have no real roots.");
            // --- TP
            tp(a, b, c);
        }
    }
    
    static void roots(double a, double b, double c, double D) {
        double X1 = (-b-Math.sqrt(D))/(2*a);
        X1 *= 100;
        X1 = Math.round(X1);
        X1 /= 100;
        double X2 = (-b+Math.sqrt(D))/(2*a);
        X2 *= 100;
        X2 = Math.round(X2);
        X2 /= 100;
        System.out.println("----EXERCISE: X1 is equal to " + X1 + ".");
        System.out.println("----EXERCISE: X2 is equal to " + X2 + ".");
    }
    
    static void tp(double a, double b, double c) {
        double TPx = -b/(2*a);
        TPx *= 100;
        TPx = Math.round(TPx);
        TPx /= 100;
        double TPy = a*Math.pow(TPx, 2)+b*TPx+c;
        TPy *= 100;
        TPy = Math.round(TPy);
        TPy /= 100;
        System.out.println("----EXERCISE: The coordinates of a turning point - TP(" + TPx + ", " + TPy + ").");
    }
}
