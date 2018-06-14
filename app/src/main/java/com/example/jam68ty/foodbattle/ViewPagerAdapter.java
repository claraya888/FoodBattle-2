package com.example.jam68ty.foodbattle;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


public class ViewPagerAdapter extends PagerAdapter{

    private Context context;
    private LayoutInflater layoutInflater;
    private Integer [] menu_cake = {R.drawable.cake_1,R.drawable.cake_2,R.drawable.cake_3,R.drawable.cake_4,R.drawable.cake_5,R.drawable.cake_6,R.drawable.cake_7,R.drawable.cake_8,R.drawable.cake_9,R.drawable.cake_10};
    private Integer [] cake_info5 = {R.string.cake_info5_1,R.string.cake_info5_2,R.string.cake_info5_3,R.string.cake_info5_4,R.string.cake_info5_5,R.string.cake_info5_6,R.string.cake_info5_7,R.string.cake_info5_8,R.string.cake_info5_9,R.string.cake_info5_10};

    public ViewPagerAdapter(Context context) {
        this.context = context;
    }

    @Override
    public int getCount() {
        return menu_cake.length;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == object;
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {

        layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = layoutInflater.inflate(R.layout.show_picture_layout, null);
        ImageView imageView = (ImageView) view.findViewById(R.id.cake_info5_image);
        imageView.setImageResource(menu_cake[position]);

        layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view2 = layoutInflater.inflate(R.layout.show_picture_layout, null);
        TextView textView = (TextView) view.findViewById(R.id.cake_info5_text);
        textView.setText(cake_info5[position]);


        ViewPager vp = (ViewPager) container;
        vp.addView(view, 0);
        return view;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {

        ViewPager vp = (ViewPager) container;
        View view = (View) object;
        vp.removeView(view);
    }
}
