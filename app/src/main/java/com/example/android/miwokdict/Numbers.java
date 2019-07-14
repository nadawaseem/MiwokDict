package com.example.android.miwokdict;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class Numbers extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        ArrayList<Word> Words = new ArrayList<>();
        Word w= new Word("one","lutti");
                Words.add(w);
        Words.add(new Word("two", "otiiko"));
        Words.add(new Word("three", "tolookosu"));
        Words.add(new Word("four", "oyyisa"));
        Words.add(new Word("five", "massokka"));
        Words.add(new Word("six", "temmokka"));
        Words.add(new Word("seven", "kenekaku"));
        Words.add(new Word("eight", "kawinta"));
        Words.add(new Word("nine", "wo’e"));
        Words.add(new Word("ten", "na’aacha"));





        WordAdapter itemsAdapter = new WordAdapter (this, Words);

        ListView listView =  findViewById(R.id.list);

        listView.setAdapter(itemsAdapter);






    }
}
