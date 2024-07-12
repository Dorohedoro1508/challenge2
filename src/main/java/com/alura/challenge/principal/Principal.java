package com.alura.challenge.principal;

import com.alura.challenge.service.ConsumoAPI;

import java.util.Scanner;

public class Principal {
    private Scanner teclado = new Scanner(System.in);
    private ConsumoAPI consumoAPI = new ConsumoAPI();
    private final String URL_BASE = "https://gutendex.com/books";

    public void muestraElMenu(){
        var opcion = -1;
        while (opcion != 0){
            var menu = """
                    Bienvenido!!!
                    Elige una opción
                    1 - Buscar libros por titulo
                    2 - Lista de libros registrados
                    3 - Lista de Autores registrados
                    4 - Lista de Autores vivos en un determinado año 
                    5 - Lista de libros por idioma 
                    0 - Salir
                    """;
            System.out.println(menu);
            opcion = teclado.nextInt();
            teclado.nextLine();

            switch (opcion){
                case 1:
                    break;
            }
        }
    }
}
