//import models.Product;
import methods.BusquedaBinaria;
import methods.MetodosOrdenamiento;
import models.Person;

public class App {
    public static void main(String[] args) throws Exception {

        Person[] persons = {
            new Person("Pablo", 4),
            new Person("Maria", 5),
            new Person("Juan", 18),
            new Person("David", 60),
            new Person("Mateo", 25),
            new Person("Diego", 12),
            new Person("Ana", 8),
            new Person("Alicia", 9),
            new Person("Jaime", 40),
        };

        // Arreglo sin ordenar de las edades
        // Bucle: imprime cada elemento del arreclo edades
        // despues el if imprime un "|" despues de cada elemento, el -1 para que no imprima despues del ultimo
        System.out.println("\nArreglo sin ordenar: ");
        for( int i = 0; i < persons.length; i++){
            System.out.print(persons[i].getEdad());
            if(i < persons.length -1){
                System.out.print(" | ");
            }
        }



        //imprimir indicacion 
        System.out.println();
        System.out.println("\n----> BUSCAR LA PERSONA CON LA EDAD DE 18 AÑOS ");


        
        //Mostrar arreglo ya ordenado
        System.out.println("\nArreglo ordenado: ");
        // Instancio el objeto de la clase BusquedaBinaria
        MetodosOrdenamiento printArreglo = new MetodosOrdenamiento();
        // Llamo al metodo sortByAge y lo uso para ordenar el arreglo
        printArreglo.sortByAge(persons);
        // Imptimo el arreglo separado  por "|"
        for( int i = 0; i < persons.length; i++){
            System.out.print(persons[i].getEdad());
            if(i < persons.length -1){
                System.out.print(" | ");
            }
        }



        // imprimir mediante la busqueda binaria
        BusquedaBinaria bBinaria = new BusquedaBinaria();
        int respuesta = bBinaria.findByAge(persons, 18);
        if (respuesta >= 0) {
            System.out.println( "\nLa persona con la edad 18 es " + persons[respuesta].getNombre() + "\n");
        } else{
            System.out.println("\nNo se encontro\n");
        }
        

        // Product[] products = {
        //     new Product("Laptop", 20),
        //     new Product("Smartphone", 25),
        //     new Product("Tablet", 10),
        //     new Product("Monitor", 5),
        //     new Product("Keyboard", 15),
        // };
        // BusquedaBinaria bBinaria = new BusquedaBinaria();
        // bBinaria.sortByName(products);
        // for(Product product : products){
        //     System.out.println(product);
        // }
        
        // int res = bBinaria.findByName(products, "Laptop");
        // if (res>= 0) {
        //     System.out.println( "entre en pos = " + res);
        // } else{
        //     System.out.println("no se encontro");
        // }

    }
}
