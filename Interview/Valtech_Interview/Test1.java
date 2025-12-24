import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Test1 {
 
/*Find all the products which belong to "Footwear" category and apply 15% discount on them. */
    public static void main(String[] args) {

            List<Product> productObj=new ArrayList<>();
            //Product(int product_id,double price,String category)
            productObj.add(new Product(1,100.00,"Footwear"));
            productObj.add(new Product(2,200.00,"Footwear"));
            productObj.add(new Product(3,500.00,"Electronics"));
            productObj.add(new Product(4,600.00,"Medicine"));


            /*List<Product>discountGet=productObj.stream().
            filter(p -> "Footwear".equalsIgnoreCase(p.getCategory()))
            .peek(p ->p.setPrice(p.getPrice() * 0.85))
            .collect(Collectors.toList());*/

           /* List<Product>dicProductmap=productObj.stream().
            filter(p -> "Footwear".equalsIgnoreCase(p.getCategory()))
            .map(p -> 
                new Product( p.getProduct_id(),p.getPrice()*0.85,p.getCategory()))
            .toList();*/
            //.peek(p ->p.setPrice(p.getPrice() * 0.85))
            //.collect(Collectors.toList());

            

            /*for (Product product : discountGet) {
                System.out.println(product.toProduct());
            }*/

            for (Product product : productObj) {
                if(product.getCategory().equalsIgnoreCase("Footwear"))
                {
                    product.setPrice(product.getPrice()*0.85);
                }
                System.out.println(product.toProduct());
            }

        
    }
}


