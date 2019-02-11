package com.example.student.myapplication;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.common.api.GoogleApiClient;
import com.nostra13.universalimageloader.core.ImageLoader;
import com.nostra13.universalimageloader.core.ImageLoaderConfiguration;
import com.nostra13.universalimageloader.core.imageaware.ImageAware;

import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {

    Timer timer = new Timer(); // changed
    int i = 0;
    ImageView image;

    int Resimler[] = {R.drawable.indir1, R.drawable.indir2, R.drawable.indir3,R.drawable.indir4,R.drawable.indir5};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        image = (ImageView) findViewById(R.id.imgBackground);

        timer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {

                if (i < 4) {
                    runOnUiThread(new Runnable() {
                        @Override
                        public void run() {
                            image.setImageResource(Resimler[i]);
                            i++;
                        }
                    });
                } else {
                    i = 0;
                }


            }
        }, 0, 2000);
    }

}
