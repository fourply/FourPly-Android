package me.fourply.fourply;

import android.app.Activity;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.nirhart.parallaxscroll.views.ParallaxScrollView;

import butterknife.ButterKnife;
import butterknife.InjectView;


public class BathroomDetailActivity extends Activity {

    @InjectView(R.id.header_image_view)
    ImageView mHeaderImageView;
    @InjectView(R.id.bathroom_name)
    TextView mBathroomName;
    @InjectView(R.id.textView)
    TextView mTextView;
    @InjectView(R.id.textView2)
    TextView mTextView2;
    @InjectView(R.id.star_1)
    ImageView mStar1;
    @InjectView(R.id.star_2)
    ImageView mStar2;
    @InjectView(R.id.star_3)
    ImageView mStar3;
    @InjectView(R.id.star_4)
    ImageView mStar4;
    @InjectView(R.id.star_5)
    ImageView mStar5;
    @InjectView(R.id.scroll_view_child_layout)
    LinearLayout mScrollViewChildLayout;
    @InjectView(R.id.scroll_view_linear_layout)
    LinearLayout mScrollViewLinearLayout;
    @InjectView(R.id.scroll_view)
    ParallaxScrollView mScrollView;

    Drawable star;
    Drawable halfStar;
    Drawable emptyStar;

    PorterDuffColorFilter pinkFilter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bathroom_detail);
        ButterKnife.inject(this);

        star = getResources().getDrawable(R.drawable.ic_star_white_48dp);
        halfStar = getResources().getDrawable(R.drawable.ic_star_half_white_48dp);
        emptyStar = getResources().getDrawable(R.drawable.ic_star_outline_white_48dp);
        pinkFilter = new PorterDuffColorFilter(getResources().getColor(R.color.primary), PorterDuff.Mode.MULTIPLY);

        star.setColorFilter(pinkFilter);
        halfStar.setColorFilter(pinkFilter);
        emptyStar.setColorFilter(pinkFilter);

        setRating(3.67f);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_bathroom_detail, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void setRating(float rating) {
        if (rating > 4.75f) {
            mStar5.setImageDrawable(star);
            mStar4.setImageDrawable(star);
            mStar3.setImageDrawable(star);
            mStar2.setImageDrawable(star);
            mStar1.setImageDrawable(star);
        }
        else if (rating > 4.25f) {
            mStar5.setImageDrawable(halfStar);
            mStar4.setImageDrawable(star);
            mStar3.setImageDrawable(star);
            mStar2.setImageDrawable(star);
            mStar1.setImageDrawable(star);
        } else if (rating > 3.75f) {
            mStar5.setImageDrawable(emptyStar);
            mStar4.setImageDrawable(star);
            mStar3.setImageDrawable(star);
            mStar2.setImageDrawable(star);
            mStar1.setImageDrawable(star);
        } else if (rating > 3.25f) {
            mStar5.setImageDrawable(emptyStar);
            mStar4.setImageDrawable(halfStar);
            mStar3.setImageDrawable(star);
            mStar2.setImageDrawable(star);
            mStar1.setImageDrawable(star);
        } else if (rating > 2.75f) {
            mStar5.setImageDrawable(emptyStar);
            mStar4.setImageDrawable(emptyStar);
            mStar3.setImageDrawable(star);
            mStar2.setImageDrawable(star);
            mStar1.setImageDrawable(star);
        } else if (rating > 2.25f) {
            mStar5.setImageDrawable(emptyStar);
            mStar4.setImageDrawable(emptyStar);
            mStar3.setImageDrawable(halfStar);
            mStar2.setImageDrawable(star);
            mStar1.setImageDrawable(star);
        } else if (rating > 1.75f) {
            mStar5.setImageDrawable(emptyStar);
            mStar4.setImageDrawable(emptyStar);
            mStar3.setImageDrawable(emptyStar);
            mStar2.setImageDrawable(star);
            mStar1.setImageDrawable(star);
        } else if (rating > 1.25f) {
            mStar5.setImageDrawable(emptyStar);
            mStar4.setImageDrawable(emptyStar);
            mStar3.setImageDrawable(emptyStar);
            mStar2.setImageDrawable(halfStar);
            mStar1.setImageDrawable(star);
        } else if (rating > 0.75f) {
            mStar5.setImageDrawable(emptyStar);
            mStar4.setImageDrawable(emptyStar);
            mStar3.setImageDrawable(emptyStar);
            mStar2.setImageDrawable(emptyStar);
            mStar1.setImageDrawable(star);
        } else if (rating > 0.25f) {
            mStar5.setImageDrawable(emptyStar);
            mStar4.setImageDrawable(emptyStar);
            mStar3.setImageDrawable(emptyStar);
            mStar2.setImageDrawable(emptyStar);
            mStar1.setImageDrawable(halfStar);
        } else {
            mStar5.setImageDrawable(emptyStar);
            mStar4.setImageDrawable(emptyStar);
            mStar3.setImageDrawable(emptyStar);
            mStar2.setImageDrawable(emptyStar);
            mStar1.setImageDrawable(emptyStar);
        }
    }
}
