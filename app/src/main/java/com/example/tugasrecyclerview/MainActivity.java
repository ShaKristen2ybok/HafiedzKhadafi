package com.example.tugasrecyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView listchathistory;
    LinearLayoutManager linear;

    List<PolaItem> item;
    ChatAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listchathistory = (RecyclerView) findViewById(R.id.list_chat_history);

        linear = new LinearLayoutManager(this);
        listchathistory.setLayoutManager(linear);

        item = new ArrayList<>();
        item.add(new PolaItem(R.drawable.ic_1, "Hafiedz", "Kamu Siapa?"));
        item.add(new PolaItem(R.drawable.ic_2, "Khadafi", "Aku Siapa?"));
        item.add(new PolaItem(R.drawable.ic_3, "Dandy", "Dia Siapa?"));
        item.add(new PolaItem(R.drawable.ic_4, "Dani", "Siapa?"));
        item.add(new PolaItem(R.drawable.ic_5, "Doni", "Kamu?"));

        adapter = new ChatAdapter(this, item);

        listchathistory.setAdapter(adapter);
    }
}
