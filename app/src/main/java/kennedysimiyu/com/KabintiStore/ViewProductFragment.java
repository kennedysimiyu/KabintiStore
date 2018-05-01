package kennedysimiyu.com.KabintiStore;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import kennedysimiyu.com.KabintiStore.databinding.FragmentViewProductBinding;
import kennedysimiyu.com.KabintiStore.models.Product;
import kennedysimiyu.com.KabintiStore.util.Products;


/**
 * Created by User on 2/6/2018.
 */

public class ViewProductFragment extends Fragment{

    private static final String TAG = "ViewProductFragment";

    // Data binding
    FragmentViewProductBinding mBinding;

    //vars
    private Product mProduct;
// onCreate method retrieving an incoming product from the bundle
    @Override
    public void onCreate(@Nullable Bundle savedInstanceSate){
        super.onCreate(savedInstanceSate);
        Bundle bundle = this.getArguments();
        if(bundle != null) {
            mProduct = bundle.getParcelable("intent_product");
        }
    }
    
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        mBinding = FragmentViewProductBinding.inflate(inflater);

        ProductViewModel productView = new ProductViewModel();
        productView.setProduct(mProduct);
        productView.setQuantity(1);
        mBinding.setProductView(productView);

        return mBinding.getRoot();
    }

}















