public class CuentaBancaria {
    // Atributos
    String titular;
    int saldo = 0;

    // Metodos 

    public void nombre(String nombre){
        this.titular = nombre;
    }
    public void depositar(int cantidad){
        saldo += cantidad; // Aqui saldo va guardar lo que se va depositar en cantidad
    }

    public void retirar(int cantidad){
      saldo -= cantidad; // Aqui se va restar lo que hay en cantidad total de nuestra cuenta
    }

    public void mostrarSaldo(){ // Aqui este metodo muestra nuestro saldo final 
        System.out.println("La cuenta de " + titular + " Mi saldo final es de: "+saldo);
    }
}
