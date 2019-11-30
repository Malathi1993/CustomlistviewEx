package com.example.customlistviewex;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    CustomAdapter customAdapter;
    String[] fruits = {"apple","grape","mango","banana"};
    int[] images = {R.drawable.apple,R.drawable.grapes,R.drawable.mangooo,R.drawable.banana};
    String[] taste={"sweet","sour","sweet","sweet"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView =(ListView)findViewById(R.id.listView);
        customAdapter = new CustomAdapter(MainActivity.this,fruits,images,taste );
        listView.setAdapter(customAdapter);


    }
}
