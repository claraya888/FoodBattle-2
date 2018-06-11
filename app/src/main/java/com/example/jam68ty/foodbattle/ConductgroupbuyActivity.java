package com.example.jam68ty.foodbattle;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;
import android.content.Intent;

public class ConductgroupbuyActivity extends AppCompatActivity {
    private ImageButton button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_conductgroupbuy);

        //Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        //setSupportActionBar(toolbar);

        //button=(ImageButton) findViewById(R.id.button);
        //button.setOnClickListener(new View.OnClickListener() {
        ImageButton imageButton4 = (ImageButton)findViewById(R.id.imageButton4);
        ImageButton imageButton3 = (ImageButton)findViewById(R.id.imageButton3);
        ImageButton imageButton2 = (ImageButton)findViewById(R.id.imageButton2);
        ImageButton imageButton = (ImageButton)findViewById(R.id.imageButton);

        imageButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent();
                i.setClass(ConductgroupbuyActivity.this, AddImageActivity.class);
                startActivity(i);
            }
        });

        imageButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent();
                i.setClass(ConductgroupbuyActivity.this, AddImageActivity.class);
                startActivity(i);
            }
        });

        imageButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent();
                i.setClass(ConductgroupbuyActivity.this, AddImageActivity.class);
                startActivity(i);
            }
        });

        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent();
                i.setClass(ConductgroupbuyActivity.this, AddImageActivity.class);
                startActivity(i);
            }
        });

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        //if (fab != null)
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG);
                //.setAction("Action", null).show();
            }
        });
    }



}