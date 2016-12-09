package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colors);

        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("red", "weṭeṭṭi"));
        words.add(new Word("green", "chokokki"));
        words.add(new Word("brown", "ṭakaakki"));
        words.add(new Word("gray", "ṭopoppi"));
        words.add(new Word("black", "kululli"));
        words.add(new Word("white", "kelelli"));
        words.add(new Word("dusty yellow", "ṭopiisә"));
        words.add(new Word("mustard yellow", "chiwiiṭә"));

        // Create an {@link WordAdapter}, whose data source is a list of
        // {@link Word}s. The adapter knows how to create list item views for each item
        // in the list.
        WordAdapter wordAdapter = new WordAdapter(this, words);

        // Get a reference to the ListView, and attach the adapter to the listView.
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(wordAdapter);
    }
}
