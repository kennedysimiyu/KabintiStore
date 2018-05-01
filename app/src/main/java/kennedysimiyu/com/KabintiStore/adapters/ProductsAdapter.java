package kennedysimiyu.com.KabintiStore.adapters;

import android.content.Context;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import kennedysimiyu.com.KabintiStore.BR;
import kennedysimiyu.com.KabintiStore.IMainActivity;
import kennedysimiyu.com.KabintiStore.R;
import kennedysimiyu.com.KabintiStore.databinding.ProductItemBinding;
import kennedysimiyu.com.KabintiStore.models.Product;

/**
 * Created by kensi on 09/04/2018.
 */

public class ProductsAdapter extends  RecyclerView.Adapter<ProductsAdapter.BindingHolder>{
    private static final String TAG = "ProductsAdapter";

    private List<Product> mProducts = new ArrayList<>();
    private Context mContext;

    public ProductsAdapter(Context context, List<Product> products) {
        mProducts = products;
        mContext = context;
    }

    public void refreshList(List<Product> products){
        mProducts.clear();
        mProducts.addAll(products);
        notifyDataSetChanged();
    }

    @Override
    public BindingHolder onCreateViewHolder(ViewGroup parent, int viewType) {
//        ViewDataBinding binding = DataBindingUtil.inflate(
//                LayoutInflater.from(mContext), R.layout.product_item, parent, false);
        ProductItemBinding binding = DataBindingUtil.inflate(
                LayoutInflater.from(mContext), R.layout.product_item, parent, false);

        return new BindingHolder(binding.getRoot());
    }

    // adding the IMainactivity interface to the view
    @Override
    public void onBindViewHolder(BindingHolder holder, int position) {
        Product product = mProducts.get(position);
        holder.binding.setProduct(product);
        holder.binding.setIMainActivity((IMainActivity) mContext);
//        holder.binding.setVariable(BR.product, product);

        holder.binding.executePendingBindings();
    }

    @Override
    public int getItemCount() {
        return mProducts.size();
    }


    // view holder/ binding holder
    public class BindingHolder extends RecyclerView.ViewHolder{

        //        ViewDataBinding binding;
        ProductItemBinding binding;

        public BindingHolder(View itemView) {
            super(itemView);
            binding = DataBindingUtil.bind(itemView);
        }
    }



}
