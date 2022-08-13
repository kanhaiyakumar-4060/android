package com.example.storedata;

import androidx.appcompat.app.AppCompatActivity;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity{

    Bitmap bg;
    ImageView img;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        img=findViewById(R.id.imageview1);
        bg=Bitmap.createBitmap(720, 1280, Bitmap.Config.RGB_565);
        img = findViewById(R.id.imageview1);
        img.setImageBitmap(bg);
        Canvas canvas = new Canvas(bg);
        Paint paint = new Paint();
        Paint paint1= new Paint();
        Paint paint2= new Paint();
        paint.setColor(Color.GREEN);
        paint1.setColor(Color.WHITE);
        paint2.setColor(Color.BLUE);
        paint.setTextSize(50);

        canvas.drawText("Rectangle", 420, 150, paint);
        canvas.drawRect(50, 200, 650, 700, paint1);

        canvas.drawText("Circle", 120, 150, paint);
        canvas.drawCircle(200, 350, 150, paint);

        canvas.drawText("Square", 120, 800, paint);
        canvas.drawRect(50, 850, 350, 1150, paint2);

        canvas.drawText("line", 480, 800, paint);
        canvas.drawLine(500, 850, 500, 1150,paint2);
    }
}