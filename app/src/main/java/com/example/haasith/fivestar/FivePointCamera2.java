package com.example.haasith.fivestar;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.net.Uri;
import android.os.Environment;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FivePointCamera2 extends AppCompatActivity {

    public File imagesFolder = new File(Environment.getExternalStorageDirectory(), "MyImages");
    Button topleft;
    Button topleft2;
    Button topright;
    Button topright2;
    Button bottomleft;
    Button bottomleft2;
    Button bottomright;
    Button bottomright2;
    Button center;

    public void picturegrid(View view) {
        Intent startNewActivity = new Intent(this, PictureGrid.class);
        startActivity(startNewActivity);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //File imagesFolder = new File(Environment.getExternalStorageDirectory(), "MyImages");
        imagesFolder.mkdirs();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_five_point_camera2);
        topleft = (Button) findViewById(R.id.topleft);
        topleft2 = (Button) findViewById(R.id.topleft2);
        topright = (Button) findViewById(R.id.topright);
        topright2 = (Button) findViewById(R.id.topright2);
        bottomleft = (Button) findViewById(R.id.bottomleft);
        bottomleft2 = (Button) findViewById(R.id.bottomleft2);
        bottomright = (Button) findViewById(R.id.bottomright);
        bottomright2 = (Button) findViewById(R.id.bottomright2);
        center = (Button) findViewById(R.id.center);
        topleft.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              Intent imageIntent = new Intent(android.provider.MediaStore.ACTION_IMAGE_CAPTURE);

                File image = new File(imagesFolder, "topleft.png"); 
                Uri uriSavedImage = Uri.fromFile(image);
                imageIntent.putExtra(MediaStore.EXTRA_OUTPUT, uriSavedImage);
                startActivityForResult(imageIntent, 0);
                
                topleft.setBackgroundColor(0xff00ff00);
                topleft2.setBackgroundColor(0xff00ff00);
            }
        });
        topleft2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              Intent imageIntent = new Intent(android.provider.MediaStore.ACTION_IMAGE_CAPTURE);
                File image = new File(imagesFolder, "topleft.png");
                Uri uriSavedImage = Uri.fromFile(image);
                imageIntent.putExtra(MediaStore.EXTRA_OUTPUT, uriSavedImage);
                startActivityForResult(imageIntent, 0);
                
                topleft.setBackgroundColor(0xff00ff00);
                topleft2.setBackgroundColor(0xff00ff00);
            }
        });
        topright.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              Intent imageIntent = new Intent(android.provider.MediaStore.ACTION_IMAGE_CAPTURE);
                File image = new File(imagesFolder, "topright.png");
                Uri uriSavedImage = Uri.fromFile(image);
                imageIntent.putExtra(MediaStore.EXTRA_OUTPUT, uriSavedImage);
                startActivityForResult(imageIntent, 0);
                
                topright.setBackgroundColor(0xff00ff00);
                topright2.setBackgroundColor(0xff00ff00);
            }
        });
        topright2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              Intent imageIntent = new Intent(android.provider.MediaStore.ACTION_IMAGE_CAPTURE);   File image = new File(imagesFolder, "topright.png"); Uri uriSavedImage = Uri.fromFile(image);  imageIntent.putExtra(MediaStore.EXTRA_OUTPUT, uriSavedImage); startActivityForResult(imageIntent, 0);
                
                topright.setBackgroundColor(0xff00ff00);
                topright2.setBackgroundColor(0xff00ff00);
            }
        });
        bottomleft.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              Intent imageIntent = new Intent(android.provider.MediaStore.ACTION_IMAGE_CAPTURE);   File image = new File(imagesFolder, "bottomleft.png"); Uri uriSavedImage = Uri.fromFile(image);  imageIntent.putExtra(MediaStore.EXTRA_OUTPUT, uriSavedImage); startActivityForResult(imageIntent, 0);
                
                bottomleft.setBackgroundColor(0xff00ff00);
                bottomleft2.setBackgroundColor(0xff00ff00);
            }
        });
        bottomleft2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              Intent imageIntent = new Intent(android.provider.MediaStore.ACTION_IMAGE_CAPTURE);   File image = new File(imagesFolder, "bottomleft.png"); Uri uriSavedImage = Uri.fromFile(image);  imageIntent.putExtra(MediaStore.EXTRA_OUTPUT, uriSavedImage); startActivityForResult(imageIntent, 0);
                
                bottomleft.setBackgroundColor(0xff00ff00);
                bottomleft2.setBackgroundColor(0xff00ff00);
            }
        });
        bottomright.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              Intent imageIntent = new Intent(android.provider.MediaStore.ACTION_IMAGE_CAPTURE);
                File image = new File(imagesFolder, "bottomright.png");
                Uri uriSavedImage = Uri.fromFile(image);
                imageIntent.putExtra(MediaStore.EXTRA_OUTPUT, uriSavedImage);
                startActivityForResult(imageIntent, 0);
                
                bottomright.setBackgroundColor(0xff00ff00);
                bottomright2.setBackgroundColor(0xff00ff00);

            }
        });
        bottomright2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              Intent imageIntent = new Intent(android.provider.MediaStore.ACTION_IMAGE_CAPTURE);  File image = new File(imagesFolder, "bottomright.png"); Uri uriSavedImage = Uri.fromFile(image);  imageIntent.putExtra(MediaStore.EXTRA_OUTPUT, uriSavedImage); startActivityForResult(imageIntent, 0);
                
                bottomright.setBackgroundColor(0xff00ff00);
                bottomright2.setBackgroundColor(0xff00ff00);
            }
        });
        center.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              Intent imageIntent = new Intent(android.provider.MediaStore.ACTION_IMAGE_CAPTURE);   File image = new File(imagesFolder, "center.png"); Uri uriSavedImage = Uri.fromFile(image);  imageIntent.putExtra(MediaStore.EXTRA_OUTPUT, uriSavedImage); startActivityForResult(imageIntent, 0);
                
                center.setBackgroundColor(0xff00ff00);

            }
        });
    }
    

}