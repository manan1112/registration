package com.example.registration;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{
    Button b1;
    @Override
    //hfvewkjfhklr
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1=(Button)findViewById(R.id.button);
        b1.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View view)
            {
                Toast.makeText(getApplicationContext(), " Registered Successfully ",Toast.LENGTH_LONG).show();
            }
        });
    }
}