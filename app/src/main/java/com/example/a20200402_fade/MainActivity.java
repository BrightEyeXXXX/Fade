package com.example.a20200402_fade;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.view.animation.AlphaAnimation;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        Toolbar toolbar = findViewById(R.id.toolbar);
//        setSupportActionBar(toolbar);

        imageView = findViewById(R.id.carlos);

        Button buttonFadeOut = findViewById(R.id.button_fadeout);
        buttonFadeOut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fadeoutXml();
            }

            //           @Override
            public void onCLick(View view) {
                fadeoutXml();
            }
        });

        Button buttonFadeIn = findViewById(R.id.button_fadein);
        buttonFadeIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fadeinXml();
            }

            //            @Override
            public void onCLick(View view) {
                fadeinXml();
            }
        });
    }

        private void fadeoutXml(){
            AlphaAnimation alphaFadeout=new AlphaAnimation(1.0f,0.0f);
            alphaFadeout.setDuration(3000);
            alphaFadeout.setFillAfter(true);
            imageView.startAnimation(alphaFadeout);
        }
        private void fadeinXml(){
            AlphaAnimation alphaFadeout=new AlphaAnimation(0.0f,0.0f);
            alphaFadeout.setDuration(3000);
            alphaFadeout.setFillAfter(true);
            imageView.startAnimation(alphaFadeout);
        }
/*
        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }
*/
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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
}
