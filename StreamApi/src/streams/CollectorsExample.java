package streams;
import java.util.stream.Collectors;  
import java.util.List;  
import java.util.ArrayList;  
class Product{  
    int id;  
    String name;  
    float price;  
      
    public Product(int id, String name, float price) {  
        this.id = id;  
        this.name = name;  
        this.price = price;  
    }  
}  
public class CollectorsExample {  
    public static void main(String[] args) {  
        List<Product> productsList = new ArrayList<Product>();  
        //Adding Products  
        productsList.add(new Product(1,"HP Laptop",25000f));  
        productsList.add(new Product(2,"Dell Laptop",30000f));  
        productsList.add(new Product(3,"Lenevo Laptop",28000f));  
        productsList.add(new Product(4,"Sony Laptop",28000f));  
        productsList.add(new Product(5,"Apple Laptop",90000f));  
        for (Product i : productsList) {
        	 
            // Print all elements of ArrayList
            System.out.println(i.name);
        }
        productsList.forEach(p->System.out.println(p.id+","+p.name));
        List<Product> productPriceList2 =productsList.stream()  
                .filter(p -> p.price > 30000)// filtering data  
                .map(p->p.price)        // fetching price  
                .collect(Collectors.toCollection(Object)); // collecting as list  
System.out.println(productPriceList2);  
        List<Product> sumPrices =  productsList.stream()  
                            .collect(Collectors.toList());  // collecting as list  
        //System.out.println("Sum of prices: "+sumPrices);  
        Integer sumId =   
                productsList.stream().collect(Collectors.summingInt(x->x.id));  
        //System.out.println("Sum of id's: "+sumId);  
    }  
}  