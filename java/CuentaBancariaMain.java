
import java.util.Scanner;

public class CuentaBancariaMain {
    
    public static void main(String[] args) {
        Scanner A = new Scanner(System.in);

        System.out.println("Create a new Account "); // Aqui creamos un usuario
         String titular = A.nextLine();
        

         System.out.println("¿Cuanto vas a depositar?"); // Cuanto desea depositar
         int deposito = A.nextInt();

         System.out.println("¿Cuanto vas a retirar?"); // Cuanto va retirar
         int retiro = A.nextInt();
         

         CuentaBancaria persona = new CuentaBancaria(); // Y este es el objeto de nuestra persona

            persona.nombre(titular);
            persona.depositar(deposito);
            persona.retirar(retiro); // y estos 3 son los metodos las acciones y los argumentos 
            persona.mostrarSaldo(); // muestra el resultado 


    }
}
