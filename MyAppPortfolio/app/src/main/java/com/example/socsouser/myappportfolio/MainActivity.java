package com.example.socsouser.myappportfolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.widget.Button;
import android.widget.TextView;
import android.view.View;
import android.content.Context;
import android.widget.Toast;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // POPULAR VIDEO button click event
        Button pop_video_button = (Button)findViewById(R.id.pop_video_button);
        pop_video_button.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick(View v)
                    {
                        View view = findViewById(R.id.pop_video_button);
                        int x = view.getLeft();
                        int y = view.getTop();
                        int h = view.getHeight();
                        Context context = getApplicationContext();
                        CharSequence text = "Popular Videos!";
                        int duration = Toast.LENGTH_SHORT;
                        Toast toast = Toast.makeText(context, text, duration);
                        toast.setGravity(Gravity.TOP|Gravity.CENTER, 0,y+100);
                        TextView v1 = (TextView) toast.getView().findViewById(android.R.id.message);
                        v1.setGravity(Gravity.TOP|Gravity.CENTER);
                        toast.show();

                    }

                }

        );

        //STOCK HAWK CLICK EVENT
        Button stock_hawk_button = (Button)findViewById(R.id.stock_hawk_button);
        stock_hawk_button.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick(View v)
                    {
                        View view = findViewById(R.id.stock_hawk_button);
                        int x = view.getLeft();
                        int y = view.getTop();
                        int h = view.getHeight();
                        Context context = getApplicationContext();
                        CharSequence text = "Stock Hawk!";
                        int duration = Toast.LENGTH_SHORT;
                        Toast toast = Toast.makeText(context, text, duration);
                        toast.setGravity(Gravity.TOP|Gravity.CENTER, 0,y+100);
                        TextView v1 = (TextView) toast.getView().findViewById(android.R.id.message);
                        v1.setGravity(Gravity.TOP|Gravity.CENTER);
                        toast.show();

                    }

                }

        );

        //BUILD IT BIGGER CLICK EVENT
        Button build_it_bigger_button = (Button)findViewById(R.id.build_it_bigger_button);
        build_it_bigger_button.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick(View v)
                    {
                        View view = findViewById(R.id.build_it_bigger_button);
                        int x = view.getLeft();
                        int y = view.getTop();
                        int h = view.getHeight();
                        Context context = getApplicationContext();
                        CharSequence text = "Build it Bigger!";
                        int duration = Toast.LENGTH_SHORT;
                        Toast toast = Toast.makeText(context, text, duration);
                        toast.setGravity(Gravity.TOP|Gravity.CENTER, 0,y+100);
                        TextView v1 = (TextView) toast.getView().findViewById(android.R.id.message);
                        v1.setGravity(Gravity.TOP|Gravity.CENTER);
                        toast.show();

                    }

                }

        );

        //MAKE YOUR APP MATERIAL CLICK EVENT
        Button make_your_app_button = (Button)findViewById(R.id.make_your_app_button);
        make_your_app_button.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick(View v)
                    {
                        View view = findViewById(R.id.make_your_app_button);
                        int x = view.getLeft();
                        int y = view.getTop();
                        int h = view.getHeight();
                        Context context = getApplicationContext();
                        CharSequence text = "Make your APP Material!";
                        int duration = Toast.LENGTH_SHORT;
                        Toast toast = Toast.makeText(context, text, duration);
                        toast.setGravity(Gravity.TOP|Gravity.CENTER, 0,y+100);
                        TextView v1 = (TextView) toast.getView().findViewById(android.R.id.message);
                        v1.setGravity(Gravity.TOP|Gravity.CENTER);
                        toast.show();

                    }

                }

        );

        //GO UBIQUITOS CLICK EVENT
        Button go_ubiquitous_button = (Button)findViewById(R.id.go_ubiquitous_button);
        go_ubiquitous_button.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick(View v)
                    {
                        View view = findViewById(R.id.go_ubiquitous_button);
                        int x = view.getLeft();
                        int y = view.getTop();
                        int h = view.getHeight();
                        Context context = getApplicationContext();
                        CharSequence text = "GO UBIQUITOUS!";
                        int duration = Toast.LENGTH_SHORT;
                        Toast toast = Toast.makeText(context, text, duration);
                        toast.setGravity(Gravity.TOP|Gravity.CENTER, 0,y+100);
                        TextView v1 = (TextView) toast.getView().findViewById(android.R.id.message);
                        v1.setGravity(Gravity.TOP|Gravity.CENTER);
                        toast.show();

                    }

                }

        );

        //CAPSTONE: MY OWN APP
        Button capstone_button = (Button)findViewById(R.id.capstone_button);
        capstone_button.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick(View v)
                    {
                        View view = findViewById(R.id.capstone_button);
                        int x = view.getLeft();
                        int y = view.getTop();
                        int h = view.getHeight();
                        Context context = getApplicationContext();
                        CharSequence text = "This button will launch my capstone project!";
                        int duration = Toast.LENGTH_SHORT;
                        Toast toast = Toast.makeText(context, text, Toast.LENGTH_SHORT);
                        toast.setGravity(Gravity.TOP|Gravity.CENTER, 0,y+100);
                        TextView v1 = (TextView) toast.getView().findViewById(android.R.id.message);
                        v1.setGravity(Gravity.CENTER);
                        toast.show();

                    }

                }

        );


    }

}
