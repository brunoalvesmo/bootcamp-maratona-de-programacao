import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;


public class Main {
 
    public static void main(String[] args) throws IOException {
    	Locale.setDefault(Locale.US);
    	Scanner sc = new Scanner(System.in);
    	
    	double a = sc.nextDouble();
    	double b = sc.nextDouble();
    	double c = sc.nextDouble();
    	
    	if (a < b && a < c) {
    		System.out.println("Otavio");
    	}
    	else if (b < a && b < c) {
    		System.out.println("Bruno");
    	}
    	else if (c < a && c < b) {
    		System.out.println("Ian");
    	}
    	else {
    		System.out.println("Empate");
    	}
    	
 
    }
 
}