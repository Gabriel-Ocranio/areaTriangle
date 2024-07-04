import java.util.Scanner;
import java.util.Locale;
import entities.Triangle;

public class App {
    public static void main(String[] args) throws Exception {
      
        Scanner sc = new Scanner(System.in);
        
        Triangle x, y;
        x = new Triangle();
        y = new Triangle();

        System.out.println("Entre os dados do triangulo X: ");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();

        System.out.println("Entre os dados do triangulo Y: ");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();
        
        double areaX = x.area();
        double areaY = y.area();
       
        System.out.printf("Área triangulo X: %.2f%n" , areaX);
        System.out.printf("Área triangulo Y: %.2f%n" , areaY);
        
        if(areaX > areaY){
            System.out.println("A maior área pertence é: X");
        } 
        else{
            System.err.println("A maior área é: Y");
        }
    
    }
}
