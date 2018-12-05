package com.ajayexample.gridview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<Grid> numbers = new ArrayList<Grid>();
        numbers.add(new Grid("1"));
        numbers.add(new Grid("2"));
        numbers.add(new Grid("3"));
        numbers.add(new Grid("4"));
        numbers.add(new Grid("5"));
        numbers.add(new Grid("6"));
        numbers.add(new Grid("7"));
        numbers.add(new Grid("8"));
        numbers.add(new Grid("9"));
        numbers.add(new Grid("10"));
        numbers.add(new Grid("11"));
        numbers.add(new Grid("12"));
        numbers.add(new Grid("13"));
        numbers.add(new Grid("14"));
        numbers.add(new Grid("15"));
        numbers.add(new Grid("16"));
        numbers.add(new Grid("17"));
        numbers.add(new Grid("18"));
        numbers.add(new Grid("19"));
        numbers.add(new Grid("20"));



        GridAdapter adapter = new GridAdapter(this,numbers);

        GridView gridview = (GridView) findViewById(R.id.grid);
        gridview.setAdapter(adapter);
    }
}
