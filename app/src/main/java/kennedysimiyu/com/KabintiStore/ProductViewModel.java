package kennedysimiyu.com.KabintiStore;

import android.databinding.BaseObservable;
import android.databinding.Bindable;
import android.support.annotation.Nullable;

import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.GlideException;
import com.bumptech.glide.request.RequestListener;
import com.bumptech.glide.request.target.Target;

import kennedysimiyu.com.KabintiStore.models.Product;

/**
 * bundle all the applications view variables for the product together.
 */

public class ProductViewModel extends BaseObservable {

    private Product product;
    private  int quantity;
    private boolean imageVisibility = false;

    @Bindable
    public Product getProduct() {
        return product;
    }

    @Bindable
    public int getQuantity() {
        return quantity;
    }

    @Bindable
    public boolean isImageVisibility() {
        return imageVisibility;
    }

    public void setProduct(Product product) {
        this.product = product;
        notifyPropertyChanged(BR.product);
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
        notifyPropertyChanged(BR.quantity);
    }

    public void setImageVisibility(boolean imageVisibility) {
        this.imageVisibility = imageVisibility;
        notifyPropertyChanged(BR.imageVisibility);
    }

    public RequestListener getCustomRequestListener(){
        return  new RequestListener() {
            @Override
            public boolean onLoadFailed(@Nullable GlideException e, Object model, Target target, boolean isFirstResource) {
                return false;
            }

            @Override
            public boolean onResourceReady(Object resource, Object model, Target target, DataSource dataSource, boolean isFirstResource) {
                setImageVisibility(true);
                return false;
            }
        };
    }
}
