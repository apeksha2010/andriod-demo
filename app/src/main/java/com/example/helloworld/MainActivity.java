package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    TextView greeting;
    Button click;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        greeting=(TextView)findViewById(R.id.tvGreeting);
        click=(Button)findViewById(R.id.btnclick);
        click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                greeting.setVisibility(view.VISIBLE);

            }
        });

    }
}