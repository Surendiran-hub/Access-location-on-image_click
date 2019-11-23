package com.example.image_click_test;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView imageView=findViewById(R.id.image);
    }

    public void locate(View view) {
        Intent locate=new Intent(MainActivity.this,location.class);
        startActivity(locate);

    }
}
