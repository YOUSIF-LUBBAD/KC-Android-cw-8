package com.example.cw7;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<item> items= new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        item s1 = new item("cheese",11,R.drawable.cheese);
        item s2 = new item("cheese",11,R.drawable.chocolate);
        item s3 = new item("cheese",11,R.drawable.coffee);
        item s4 = new item("cheese",11,R.drawable.donut);
        item s5 = new item("cheese",11,R.drawable.fries);
        item s6 = new item("cheese",11,R.drawable.honey);

        items.add(s1);
        items.add(s2);
        items.add(s3);
        items.add(s4);
        items.add(s5);
        items.add(s6);

        ListView ListView = findViewById(R.id.Listview);

        itemAdapter i = new itemAdapter(this,0,items);

        ListView.setAdapter(i);


    }
}