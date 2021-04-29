package com.example.onlineregistration;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Toast;

import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;

public class DisplayActivity extends AppCompatActivity {


    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_display);

        getSupportActionBar().hide();

        Gson gson = new Gson();


        StudentList sp = gson.fromJson(getIntent().getStringExtra("spObj"), StudentList.class);
        recyclerView = (RecyclerView) findViewById(R.id.studentRecyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        //Toast(sp.getStudentList().get(0).toString());

        StudentAdapter adapter = new StudentAdapter( DisplayActivity.this, sp.getStudentList() );
        recyclerView.setAdapter( adapter );
    }
    public void Toast(String msg){
        Toast toast = Toast.makeText(DisplayActivity.this, msg,
                Toast.LENGTH_SHORT);
        toast.show();
    }
}