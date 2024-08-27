package EjercicioEvaluadorDeClases;

import java.util.Scanner;

public class Evaluador {
    public static void main(String[] args) {

        Scanner miScanner = new Scanner(System.in);
        System.out.println("Bienvenido al Evaluador de clases");
        System.out.println("Por favor ingresa la nota del 1 al 10 para la primera materia");
        Double materia1 = miScanner.nextDouble();
        System.out.println("Por favor ingresa la nota del 1 al 10 para la segunda materia");
        Double materia2 = miScanner.nextDouble();
        System.out.println("Por favor ingresa la nota del 1 al 10 para la tercera materia");
        Double materia3 = miScanner.nextDouble();

        Double promedioMaterias = (materia1 + materia2 + materia3)/3;


        if (Math.round(promedioMaterias) > 0 && Math.round(promedioMaterias) <= 3){
            System.out.println("No Aprobado. El promedio final es " + Math.round(promedioMaterias));
        } else if (Math.round(promedioMaterias) > 3 && Math.round(promedioMaterias) <= 5){
            System.out.println("Insuficiente. El promedio final es " + Math.round(promedioMaterias));
        } else if (Math.round(promedioMaterias) > 5 && Math.round(promedioMaterias) <= 8){
            System.out.println("Aceptable. El promedio final es " + Math.round(promedioMaterias));
        } else if (Math.round(promedioMaterias) > 8 && Math.round(promedioMaterias) <= 10){
            System.out.println("Excelente. El promedio final es " + Math.round(promedioMaterias));
        } else {
            System.out.println("Por favor, ingresa nuevamente para indicar notas válidas del 1 al 10.");
        }

    }
}


