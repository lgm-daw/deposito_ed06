package cuentas; //1-Click derecho-Refractor-Move-Create Package-"cuentas"
public class Main {

    public static void main(String[] args) {
        operativa_cuenta(2500); //3-Refractor- Extract Method -y se introduce el método "operativa_cuenta"
    }

	/**
	 * @param cantidad
	 */
	private static void operativa_cuenta(float cantidad) { //5-Refractor-Change Method Signature-'float'-'cantidad'
		CCuenta cuenta1; //2-Refractor-Rename-cambiar nombre de variable "miCuenta" a "cuenta1"
         double saldoActual;

        cuenta1 = new CCuenta("Antonio López","1000-2365-85-1230456789",cantidad,0);
        saldoActual = cuenta1.estado();
        System.out.println("El saldo actual es"+ saldoActual );

        try {
            cuenta1.retirar(2300);
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
        try {
            System.out.println("Ingreso en cuenta");
            cuenta1.ingresar(695);
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
	}
}

/*Apartado GIT : Window- Perspective-Open Perspective-Other-Git:
 * Create a new local Git repository 
 * */



