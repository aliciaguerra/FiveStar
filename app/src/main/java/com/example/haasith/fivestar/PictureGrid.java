package com.example.haasith.fivestar;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class PictureGrid extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_picture_grid);
//        try {
//            String path = "/storage/emulated/0/MyImages/";
//            File f1 = new File(path + "topleft.png");
//            FileInputStream fis1 = new FileInputStream(f1);
//            Bitmap b1 = BitmapFactory.decodeStream(fis1);
//            fis1.close();
//            ImageView img1 = (ImageView)findViewById(R.id.tl);
//            img1.setImageBitmap(b1);
//
//            File f2 = new File(path + "bottomright.png");
//            FileInputStream fis2 = new FileInputStream(f2);
//            Bitmap b2 = BitmapFactory.decodeStream(fis2);
//            fis2.close();
//            ImageView img2=(ImageView)findViewById(R.id.br);
//            img2.setImageBitmap(b2);
//
//            File f3 = new File(path + "bottomleft.png");
//            FileInputStream fis3 = new FileInputStream(f3);
//            Bitmap b3 = BitmapFactory.decodeStream(fis3);
//            fis3.close();
//            ImageView img3 =(ImageView)findViewById(R.id.bl);
//            img3.setImageBitmap(b3);
//
//            File f4 = new File(path + "topright.png");
//            FileInputStream fis4 = new FileInputStream(f4);
//            Bitmap b4 = BitmapFactory.decodeStream(fis4);
//            fis4.close();
//            ImageView img4 =(ImageView)findViewById(R.id.tr);
//            img4.setImageBitmap(b4);
//
//            File f5 = new File(path + "center.png");
//            FileInputStream fis5 = new FileInputStream(f5);
//            Bitmap b5 = BitmapFactory.decodeStream(fis5);
//            fis5.close();
//            ImageView img5=(ImageView)findViewById(R.id.c);
//            img5.setImageBitmap(b5);
//
//        }
//        catch (FileNotFoundException e)
//        {
//            e.printStackTrace();
//        }
//        catch(IOException e) {
//            e.printStackTrace();
//        }
//
    }
}
