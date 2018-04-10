package kennedysimiyu.com.KabintiStore.util;

import java.math.BigDecimal;
import java.util.HashMap;

import kennedysimiyu.com.KabintiStore.models.Product;


/**
 * Thisclass returns our prices which are made easy to be retrieved by using a HashMap which allows as to retrieve them with a key
 */

public class Prices {

    private static final HashMap<String, BigDecimal> PRICES;
    static
    {
        PRICES = new HashMap<String, BigDecimal>();
        Products products = new Products();
        for(Product product : products.PRODUCTS){
            PRICES.put(String.valueOf(product.getSerial_number()), product.getPrice());
        }
    }



    public static HashMap<String, BigDecimal> getPrices(){
        return  PRICES;
    }
}
