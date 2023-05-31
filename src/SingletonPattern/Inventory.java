package SingletonPattern;

import java.util.ArrayList;
import java.util.List;

public final class Inventory {

  private static Inventory inventory;

  private List<Product>productList;

  private Inventory(){
      productList=new ArrayList<>();
  }
  public List<Product> getProductList(){
      return productList;
  }
  public static Inventory getInventory(){

      if(inventory==null){
          inventory=new Inventory();
      }
      return inventory;
  }
  public void add(Product product){
      productList.add(product);
  }
  public void remove(Product product){
      productList.remove(product);
  }
  public void print(){
      productList.forEach(System.out::println);
  }

}
