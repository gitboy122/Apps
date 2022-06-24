package com.example.artsy;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<String> list = new ArrayList<String>();
    int count=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        MyAdapter adapter= new MyAdapter(list,this);
//        RecyclerView mRecyclerView = (RecyclerView) findViewById(R.id.recyclerView2);
//        MyAdapter mRecyclerAdapter = new MyAdapter(list,this);
//        final LinearLayoutManager layoutManager = new LinearLayoutManager(this);
//        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
//        mRecyclerView.setLayoutManager(layoutManager);
//        mRecyclerView.setAdapter(mRecyclerAdapter);
//
//        Button b1 = findViewById(R.id.button);
//        b1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                String s1 = " Text Count " + count;
//                count++;
//                list.add(s1);
//                adapter.notifyDataSetChanged();
//            }
//        });
    }


}