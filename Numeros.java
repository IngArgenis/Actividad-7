import java.util.Scanner;

public class Numeros {
     
    //Módulo para mostrar numeros del 1 al 100 divisibles entre 2 y 3
    public void mostrarNumerosDivisibles() {
        System.out.println("Números del 1 al 100 divisibles entre 2 y 3:");
        //Usamos un ciclo for para recorrer los números del 1 al 100
        for (int i = 1; i <= 100; i++) {
            //Usamos el operador % para obtener el residuo de la division
            //Si el residuo es 0, significa que el número es divisible entre 2 y 3
            if (i % 2 == 0 && i % 3 == 0) {
                System.out.print(i + ",");
            }
    }
}

// Módulo para validar que el número sea mayor o igual a cero
    public void validarNumero() {
        Scanner teclado = new Scanner(System.in);
        int numero;

        System.out.println("\n--- Validación con Do-While ---");
        // El do-while ejecuta el código al menos una vez antes de preguntar
        do {
            System.out.print("Ingresa un número (mayor o igual a cero): ");
            numero = teclado.nextInt();
            
            // Un pequeño if para avisarle al usuario que se equivocó
            if (numero < 0) {
                System.out.println("Error: El número es negativo. Intenta de nuevo.");
            }
        } while (numero < 0); // Si es negativo, el ciclo se repite y vuelve a preguntar

        System.out.println("El numero " + numero + " es mayor o igual a cero.");
        teclado.close();
    }

    // Método principal
    public static void main(String[] args) {
        
        //Mostrar los números del 1 al 100 con ciclo WHILE
        System.out.println("--- Ciclo WHILE del 1 al 100 ---");
        int contador = 1;
        while (contador <= 100) {
            System.out.println(contador);
            contador++; 
        }

        //Mostrar los números del 1 al 100 con ciclo FOR
        System.out.println("\n--- Ciclo FOR del 1 al 100 ---");
        for (int i = 1; i <= 100; i++) {
            System.out.println(i);
        }

        // Creamos el objeto de nuestra propia clase para llamar a los módulos
        Numeros misNumeros = new Numeros();
        
        // Ejecutamos los módulos que creamos 
        misNumeros.mostrarNumerosDivisibles();
        misNumeros.validarNumero();
    }
}
