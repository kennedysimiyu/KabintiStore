package kennedysimiyu.com.KabintiStore;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

import kennedysimiyu.com.KabintiStore.models.Product;

/**
 * bundle all the applications view variables for the product together.
 */

public class ProductViewModel extends BaseObservable {

    private Product product;

    @Bindable
    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
        notifyPropertyChanged(BR.product);
    }
}
