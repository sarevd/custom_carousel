package carousel.test.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import com.azoft.carousellayoutmanager.CarouselLayoutManager;
import com.azoft.carousellayoutmanager.CarouselZoomPostLayoutListener;
import com.azoft.carousellayoutmanager.CenterScrollListener;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_carousel_preview);
        // create layout manager with needed params: vertical, cycle
        final CarouselLayoutManager layoutManager = new CarouselLayoutManager(CarouselLayoutManager.VERTICAL, true);
        // enable zoom effect. this line can be customized
        layoutManager.setPostLayoutListener(new CarouselZoomPostLayoutListener());
        RecyclerView list = (RecyclerView) findViewById(R.id.list);
        list.setLayoutManager(layoutManager);
        // we expect only fixed sized item for now
        list.setHasFixedSize(true);
        // sample adapter with random data
        final TestAdapter adapter = new TestAdapter();
        list.setAdapter(adapter);
        // enable center post scrolling
        list.addOnScrollListener(new CenterScrollListener());

        is

        layoutManager.addOnItemSelectionListener(new CarouselLayoutManager.OnCenterItemSelectionListener() {

            private Toast mToast;

            @Override
            public void onCenterItemChanged(final int adapterPosition) {
                if (null != mToast) {
                    mToast.cancel();
                }
                // uncomment lines bellow to show center item in toast.
                // but be aware that showing toast can be long operation, so scrolling may freeze
/*
                mToast = Toast.makeText(MainActivity.this, String.valueOf(adapterPosition), Toast.LENGTH_LONG);
                mToast.show();
*/
            }
        });
    }
}
