package methods;
import models.Person;
import models.Product;

public class MetodosOrdenamiento {
    
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

    public void sortByAge(Person[] person){
        for( int i = 0; i < person.length; i++){
            boolean swap = false;
            for(int j = 0; j < person.length -1 -i; j++){
                if(person[j].getEdad() > person[j + 1].getEdad()){
                    Person aux = person[j];
                    person[j] = person[j+1];
                    person[j+1] = aux;
                    swap = true;
                }
            }
            if(!swap){
                break;
            }
        }
    }
}
