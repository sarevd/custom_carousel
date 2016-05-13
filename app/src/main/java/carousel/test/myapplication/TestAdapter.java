package carousel.test.myapplication;

import android.graphics.Color;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.Random;

/**
 * Created by nenad on 5/13/2016.
 */
public class TestAdapter extends RecyclerView.Adapter<TestViewHolder> {

    @SuppressWarnings("UnsecureRandomNumberGeneration")
    private final Random mRandom = new Random();
    private final int[] mColors;
    public static final boolean answer = true;

    TestAdapter() {
        mColors = new int[getItemCount()];
        for (int i = 0; i < getItemCount(); ++i) {
            //noinspection MagicNumber
            mColors[i] = Color.argb(255, mRandom.nextInt(256), mRandom.nextInt(256), mRandom.nextInt(256));
        }
    }

    @Override
    public TestViewHolder onCreateViewHolder(final ViewGroup parent, final int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_view, parent, false);
        return new TestViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(final TestViewHolder holder, final int position) {
        holder.cItem1.setText(String.valueOf(position));
        holder.cItem1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(answer){
                holder.cItem1.setBackgroundResource(R.color.colorAccent);
            }else{
                //netocen odgovor
                }
            }
        });
     //   holder.cItem2.setText(String.valueOf(position));
        holder.imageView.setBackgroundResource(R.mipmap.ic_launcher);
        holder.itemView.setBackgroundColor(mColors[position]);
    }

    @Override
    public int getItemCount() {
        return 10;
    }
}
