package com.example.listview_sample_one;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.lang.reflect.Array;

public class MainActivity extends AppCompatActivity {
String[] stuname = {"xyz", "yxz", "abc","xyz", "yxz", "abc","xyz", "yxz", "abc","xyz", "yxz", "abc","xyz", "yxz", "abc","xyz", "yxz", "abc","xyz", "yxz", "abc","xyz", "yxz", "abc","xyz", "yxz", "abc","xyz", "yxz", "abc","xyz", "yxz", "abc","xyz", "yxz", "abc","xyz", "yxz", "abc","xyz", "yxz", "abc","xyz", "yxz", "abc","xyz", "yxz", "abc"};
ListView lv ;
    Integer[] num = {400,500,300,400,400,500,300,400,400,500,300,400,400,500,300,400,400,500,300,400};
    Character[] characters = {'n', 'a', 'z', 'm', 'a', 'a', 's', 'm', 'a'};




//character
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        lv = findViewById(R.id.lv1);
//        ArrayAdapter<String> adapter = new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_list_item_1,stuname);
//        lv.setAdapter(adapter);


//        lv = findViewById(R.id.lv2);
//        ArrayAdapter<Integer> adapter1 = new ArrayAdapter<Integer>(MainActivity.this, android.R.layout.simple_list_item_1,num);
//        lv.setAdapter(adapter1);
        lv = findViewById(R.id.lv1);
    ArrayAdapter<Character> adapter = new ArrayAdapter<>(MainActivity.this, android.R.layout.simple_list_item_1,characters);
    lv.setAdapter(adapter);


    }




}






