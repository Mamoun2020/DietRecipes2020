package com.example.dietrecipes2020;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class Wasafat extends AppCompatActivity {

    private AdapterWassafat adapter;
    private RecyclerView recyclerView ;
    private ArrayList<Item> myList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wasafat);

        recyclerView = findViewById(R.id.wasafat_recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(getBaseContext()));

        adapter = new AdapterWassafat(getMyitem(),getBaseContext());
        recyclerView.setAdapter(adapter);

    }

    private ArrayList<Item> getMyitem() {
        ArrayList<Item> list = new ArrayList<>();
        Item tips = new Item();
        tips.setText("وصفة التمر ");
        list.add(tips);

        tips = new Item();
        tips.setText("وصفة اللبن ");
        list.add(tips);

        tips = new Item();
        tips.setText("وصفة الشاي الاخضر ");
        list.add(tips);

        tips = new Item();
        tips.setText("وصفة السكر ");
        list.add(tips);

        tips = new Item();
        tips.setText("وصفة اللبن ");
        list.add(tips);

        tips = new Item();
        tips.setText("وصفة اللبن ");
        list.add(tips);

        tips = new Item();
        tips.setText("وصفة اللبن ");
        list.add(tips);

        tips = new Item();
        tips.setText("وصفة اللبن ");
        list.add(tips);

        tips = new Item();
        tips.setText("وصفة اللبن ");
        list.add(tips);

        tips = new Item();
        tips.setText("وصفة اللبن ");
        list.add(tips);


        return list;
    }

}