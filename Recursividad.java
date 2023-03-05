import java.util.Scanner;


public class Recursividad {
    
    public static void main(String[] args) {
        
        int base, exponente;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Ingrese la base: ");
        base = scan.nextInt();
        System.out.print("Ingrese el exponente: ");
        exponente = scan.nextInt();
        System.out.println("El resultado de la potencia es: "+Potencia(base, exponente));
    }
    
    
    public static int Potencia(int bas, int exp){
            if (exp==1) return bas;
            else if(exp==0) return 1;
            else return bas * Potencia(bas, exp-1);
    }
}
