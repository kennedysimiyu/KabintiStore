package kennedysimiyu.com.KabintiStore.databinding;

import android.content.Context;
import android.databinding.BindingAdapter;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestListener;
import com.bumptech.glide.request.RequestOptions;

import kennedysimiyu.com.KabintiStore.R;

/**
 * Created by kensi on 09/04/2018.
 */

public class GlildeBindingAdapters {

    // using glilde to set the image
    @BindingAdapter("imageUrl")
    public static void setImage(ImageView view, int imageUrl){
        Context context = view.getContext();

        RequestOptions options = new RequestOptions()
                .placeholder(R.drawable.ic_launcher_background)
                .error(R.drawable.ic_launcher_background);

        Glide.with(context)
                .setDefaultRequestOptions(options)
                .load(imageUrl)
                .into(view);


    }

    // using glilde to wait for images to load
    @BindingAdapter({"requestListener", "imageResource"})
    public static void bindRequestListener(ImageView view, RequestListener requestListener, int imageResource){

        Context context = view.getContext();

        RequestOptions options = new RequestOptions()
                .placeholder(R.drawable.ic_launcher_background)
                .error(R.drawable.ic_launcher_background);

        Glide.with(context)
                .setDefaultRequestOptions(options)
                .load(imageResource)
                .listener(requestListener)
                .into(view);


    }
}
