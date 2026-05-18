import models.Product;

public class BusquedaBinaria {

    public void sortByName(Product[] products){
        for( int i = 0; i < products.length; i++){
            boolean swap = false;
            for(int j = 0; j < products.length -1 -i; j++){
                if(products[j].getNombre().compareTo(products[j + 1].getNombre())> 0){
                    Product aux = products[j];
                    products[j] = products[j+1];
                    products[j+1] = aux;
                    swap = true;
                }
            }
            if(!swap){
                break;
            }
        }
    }

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
}
