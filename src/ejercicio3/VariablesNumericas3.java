package ejercicio3;

public class VariablesNumericas3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x = 25;
        int y = 15;
        double n = 2.58;
        double m = 3.0;
        
        //Ejercicio 3: 
        
        System.out.println("El valor de X es: " + x);
        System.out.println("El valor de Y es: " + y);
        System.out.println("El valor de N es: " + n);
        System.out.println("El valor de M es: " + m);
        
        //Operaciones
        
        System.out.println("La suma de X e Y es: " + (x + y));
        System.out.println("La diferencia entre X e Y es: " + (x - y));
        
        System.out.println("El producto de X e Y es: " + (x * y));
        System.out.println("El cociente de X entre Y es: " + ((double) x / y)); //double ya que el resultado no es entero. 
        
        System.out.println("El resto de X%Y es: " + (x % y));
        System.out.println("La suma de N y M es: " + (n + m));
        
        System.out.println("La diferencia entre N y M es: " + (n - m));
        System.out.println("El producto de N y M es: " + (n * m));
        
        System.out.println("El cociente de N/M es: " + (n / m));
        System.out.println("El resto de N entre M es: " + (n % m));
        
        System.out.println("La suma de X y N es: " + (x + n));
        System.out.println("El cociente de Y/M es: " + ((double) y / m));    
        System.out.println("El resto de Y%M es: " + (y % m));
        
        System.out.println("El doble de X es: " + (2 * x));
        System.out.println("El doble de Y es: " + (2 * y));
        System.out.println("El doble de N es: " + (2 * n));
        System.out.println("El dble de M es: " + (2 * m));
        
        System.out.println("La suma de todas las variables es: " + (x + y + n + m));
        
        System.out.println("El producto de todas las variables es: " + (x * y * n * m));
       
        
		
	}

}
