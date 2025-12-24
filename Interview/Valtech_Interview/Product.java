public class Product {
 
  private int product_id;
 
  private double price;
 
  private String category;

    //constructor
  public Product(int product_id,double price,String category){
    this.product_id=product_id;
    this.price=price;
    this.category=category;
  }

  //Getter
  public int getProduct_id(){
    return product_id;
  }

  public double getPrice(){
    return price;
  }

  public String getCategory(){
    return category;
  }

  //setter
  public void setPrice(double price){
    this.price=price;
  }

  public String toProduct(){
    return "Category: "+category+" Price: "+price+" Product_Id: "+product_id;
  }
}