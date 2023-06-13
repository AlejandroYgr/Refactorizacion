package Cuenta;

import Cuenta.CCuenta;

public class Main {

    public static void main(String[] args) {
       operativa_Cuenta(14);
    }
    public static void operativa_Cuenta(float cantidad){
        CCuenta Cuenta1;
        double saldoActual;

        Cuenta1 = new CCuenta("Antonio López","1000-2365-85-1230456789",2500,0);
        saldoActual = Cuenta1.estado();
        System.out.println("El saldo actual es"+ saldoActual );

        try {
            Cuenta1.retirar(cantidad);
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
        try {
            System.out.println("Ingreso en cuenta");
            Cuenta1.ingresar(cantidad);
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
    }
}
