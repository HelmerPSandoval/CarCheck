package com.example.proyectocarcheck;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Environment;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.proyectocarcheck.ui.login.LoginActivity;

import java.io.File;


public class MainActivity extends AppCompatActivity {

    private ImageView iv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        iv1 = (ImageView) findViewById(R.id.iv1);
        iv1.setImageResource(R.drawable.ic__885);
    }


    public void inicioSesion(View view)
    {
        Intent in = new Intent(this, LoginActivity.class);
        startActivity(in);
    }


}