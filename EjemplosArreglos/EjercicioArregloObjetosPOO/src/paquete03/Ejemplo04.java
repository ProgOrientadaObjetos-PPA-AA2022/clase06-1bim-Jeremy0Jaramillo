/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete03;

import paquete01.Calificacion;

public class Ejemplo04 {
    public static void main(String[] args) {
        // crear un arreglo de objetos de tipo Calificacion
        Calificacion [] calificaciones = new Calificacion[5];
        double suma = 0;
        
        Calificacion c = new Calificacion(10, "Computación");
        Calificacion c2 = new Calificacion(3.8, "Electrónica");
        Calificacion c3 = new Calificacion(9, "Hola");
        Calificacion c4 = new Calificacion(9.5, "Mate");
        Calificacion c5 = new Calificacion(7.75, "Lengua");
        
        calificaciones[0] = c;
        calificaciones[1] = c2;
        calificaciones[2] = c3;
        calificaciones[3] = c4;
        calificaciones[4] = c5;
        
        for (int i = 0; i < calificaciones.length; i++) {
            Calificacion objetoCalificacion = calificaciones[i];
            suma = suma + objetoCalificacion.obtenerNota();
        }
        suma = suma/calificaciones.length;
        System.out.printf("Promedio = %.2f\n", suma);
    }
}
