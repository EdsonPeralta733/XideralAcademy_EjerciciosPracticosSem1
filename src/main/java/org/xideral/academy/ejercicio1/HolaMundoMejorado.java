package org.xideral.academy.ejercicio1;

public class HolaMundoMejorado {
    public static void main(String[] args) {
        // TODO: Declarar variables
        String nombre = "Edson";
        int edad = 22;
        double altura = 1.84;
        boolean esActivo = true;

        // TODO: Concatenación con +
        String mensaje1 = "Me llamo " + nombre + ", tengo " + edad + " años, mido " + altura + "m y estoy " + (esActivo ? "activo" : "inactivo") + ".";
        System.out.println(mensaje1);

        // TODO: Usando String.format()
        String mensaje2 = String.format("Me llamo %s, tengo %d años, mido %.2f m y estoy %s.",nombre, edad, altura, esActivo ? "activo" : "inactivo");
        System.out.println(mensaje2);
    }
}
