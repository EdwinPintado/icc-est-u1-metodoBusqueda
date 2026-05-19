package methods;
import models.Product;
import models.Person;

public class BusquedaBinaria {

    public int findByName(Product[] products, String nombre){
        // definamos alto y bajo
        int bajo = 0;
        int alto = products.length -1; 

        while(bajo <= alto) {
            // definamos el punto medio
            int c = (bajo + alto) /2; 
            // comparamos con la clave
            if(products [c].getNombre().equals(nombre)){
                return c; 
            }
            // Si voy a la izq o a la derecha
            int comparacion = products[c].getNombre().compareTo(nombre); 
            if (comparacion < 0)
                bajo = c +1;
             else 
                alto = c -1;
        }
        return -1; // n o encontrado
    }


    public int findByAge(Person[] person, int edad){
        // definamos alto y bajo
        int bajo = 0;
        int alto = person.length -1; 

        while(bajo <= alto) {
            // definamos el punto medio
            int c = (bajo + alto) /2; 

            // imprimir los valores
            String printArr = "\nbajo= " + bajo + "    alto= " + alto + "    centro= " + c +  "    valorCentro= " + person[c].getEdad();
            System.out.print(printArr);

            // comparamos con la clave
            if(person[c].getEdad() == edad){
                // ver si ya encontro el valor 
                System.out.print("    ---> ENCONTRADO\n");
                return c;
            }
            // ver a que direccion va a elejir en programa
            // Si voy a la izq o a la derecha
            if (person[c].getEdad() < edad){
                bajo = c +1;
                System.out.print("    ---> DERECHA\n");

                // Para que imprima el arreglo cuando el valor que buscamos esta en la derecha 
                System.out.print("\n");
                for( int i = bajo ; i < person.length; i++){
                    System.out.print(person[i].getEdad());
                    if(i < person.length -1)
                        System.out.print(" | ");
                }

            }else{
                alto = c -1;
                System.out.print("    ---> IZQUIERDA\n");
                // Para que imprima el arreglo cuando el valor que buscamos esta en la izquierda
                System.out.print("\n");
                for( int i = bajo ; i <= alto; i++){
                    System.out.print(person[i].getEdad());
                    if(i <= alto)
                        System.out.print(" | ");
                }

            }
        }
        return -1; // n o encontrado
    }
}
