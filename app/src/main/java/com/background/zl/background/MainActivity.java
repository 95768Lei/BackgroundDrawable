package com.background.zl.background;

import android.graphics.Color;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatDelegate;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.background.zl.backgroundlibrary.BackgroundDrawable;

public class MainActivity extends AppCompatActivity {

    static {
        AppCompatDelegate.setCompatVectorFromResourcesEnabled(true);
    }

    private RelativeLayout view;
    private TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        view = (RelativeLayout) findViewById(R.id.bga);
        text = (TextView) findViewById(R.id.text_banana);
        text.setTypeface(Typeface.DEFAULT_BOLD);

        BackgroundDrawable drawable = BackgroundDrawable.builder()
                .left(70)
                .right(50)
                .topColor(Color.parseColor("#FCD62D"))
                .bottomColor(Color.parseColor("#76C4EB"))
                .build();

        view.setBackground(drawable);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.left:
                BackgroundDrawable drawable1 = BackgroundDrawable.builder()
                        .left(70)
                        .right(50)
                        .topColor(Color.parseColor("#FCD62D"))
                        .bottomColor(Color.parseColor("#76C4EB"))
                        .build();

                view.setBackground(drawable1);
                break;

            case R.id.right:
                BackgroundDrawable drawable2 = BackgroundDrawable.builder()
                        .left(50)
                        .right(70)
                        .topColor(Color.parseColor("#FCD62D"))
                        .bottomColor(Color.parseColor("#76C4EB"))
                        .build();

                view.setBackground(drawable2);
                break;
        }
        return true;
    }
}
