package com.example.axess.hellolester;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Log.i("Lester", "Button clicked");
                ((TextView) findViewById(R.id.textView3)).setTextColor(
                        getResources().getColor(R.color.colorPrimaryDark));
            }
        });
    }
}
