package by.itstep.julja8806.model.logic;

import by.itstep.julja8806.model.entity.Basket;
import by.itstep.julja8806.model.entity.Container;
import by.itstep.julja8806.model.entity.Product;
import org.junit.Test;
import static org.junit.Assert.*;


public class ShopAssistanceTest {

 @Test
    public  void testEmptyContainer() {
     Container container = new Basket();
     double expected = 0;

     double actual = ShopAssistance.CalculateTotalPrice(container);
     assertEquals(expected, actual, 0.001);

 }

         @Test
         public void testNull(){
             Container container = null;
             double expected = -1;
             double actual = ShopAssistance.CalculateTotalPrice(container);

        }
        @Test
    public void testContainerHasOneProduct(){
     Container container = new Basket();
     Product product = new Product(10.5);
     container.add(product);
     double expected = product.getPrise();

     double actual = ShopAssistance.CalculateTotalPrice(container);

    }
    @Test
    public void testCalculateTotalPrice(){
        Container container = new Basket();
        container.add( new Product(10.5));
        container.add( new Product(20.11));
        container.add( new Product(30.3));

        double expected = 60.19;

        double actual = ShopAssistance.CalculateTotalPrice(container);

    }



}
