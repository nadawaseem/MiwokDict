package com.example.android.miwokdict;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class Numbers extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        ArrayList<String> englishWords = new ArrayList<>();
        englishWords.add(0,"one");
        englishWords.add(1,"two");
        englishWords.add(2,"three");
        englishWords.add(3,"four");
        englishWords.add(4,"five");
        englishWords.add(5,"six");
        englishWords.add(6,"seven");
        englishWords.add(7,"eight");
        englishWords.add(8,"nine");
        englishWords.add(9,"ten");






        ArrayAdapter<String> itemsAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, englishWords);

        ListView listView =  findViewById(R.id.list);

        listView.setAdapter(itemsAdapter);






    }
}
