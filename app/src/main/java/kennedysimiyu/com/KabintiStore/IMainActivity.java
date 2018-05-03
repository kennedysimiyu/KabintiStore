package kennedysimiyu.com.KabintiStore;

import kennedysimiyu.com.KabintiStore.models.Product;

/**
 * inflate View product fragment so as to navigate to the product details when you click the product.
 */

public interface IMainActivity {

    void inflateViewProductFragment(Product product);

    void showQuantityDialog();

    void setQuantity(int quantity);
}
