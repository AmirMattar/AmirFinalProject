package com.example.user.amir;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class List extends AppCompatActivity implements AdapterView.OnItemClickListener{

    ListView Lvbooks;

    ArrayAdapter<String>ArrayAdapter;

    ArrayList<String> arrayList=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_main);


        Lvbooks = findViewById(R.id.Lvbooks);
        arrayList.add("Science fiction");
        arrayList.add("Drama");
        arrayList.add("Action and Adventure");
        arrayList.add("Mystery");
        arrayList.add("Romance");


        ArrayAdapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,arrayList);
        Lvbooks.setAdapter(ArrayAdapter);
        Lvbooks.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

        String selectedItem= arrayList.get(position);
        Intent i=new Intent(this,MainPage.class);
        if(position==0) {
            i.putExtra("categories", "Science fiction");
        }
        if(position==1) {
            i.putExtra("categories", "Drama");
        }
        if(position==2) {
            i.putExtra("categories", "Action and Adventure");
        }
        if(position==3) {
            i.putExtra("categories", "Mystery");
        }
        if(position==4) {
            i.putExtra("categories", "Romance");
        }
        startActivity(i);
        }
    }
