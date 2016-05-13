package carousel.test.myapplication;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by nenad on 5/13/2016.
 */
public class TestViewHolder extends RecyclerView.ViewHolder {

    Button cItem1, cItem2;
    ImageView imageView;

    TestViewHolder(View view) {
        super(view);
        cItem1 = (Button) view.findViewById(R.id.c_item_1);
        imageView = (ImageView) view.findViewById(R.id.imageView);


    }
}