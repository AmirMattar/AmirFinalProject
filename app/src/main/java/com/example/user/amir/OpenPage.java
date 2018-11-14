package com.example.user.amir;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class OpenPage extends AppCompatActivity{

    ListView lvSubCategory;
    ArrayAdapter arrayAdapter;
    ArrayList<String> arrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_open_page);

        lvSubCategory =findViewById(R.id.lvSubCategory);
        arrayList=new ArrayList<>();
        arrayList.add("AA");
        arrayList.add("AB");
        fillSubCategoriesList();
        Toast.makeText(this,  getIntent().getStringExtra("categories"), Toast.LENGTH_LONG).show();
        arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, arrayList);
        lvSubCategory.setBackgroundColor(Color.BLACK);

     //   lvSubCategory.setOnItemClickListener(this);

    }
    public void fillSubCategoriesList(){
        arrayList.add("AA");
        arrayList.add("AB");
        String category = getIntent().getStringExtra("categories");
        if(category.equals("Science fiction")){
            arrayList.add("AA");
            arrayList.add("AB");
        }else if(category.equals("Action and Adventure")){
            arrayList.add("AA");
            arrayList.add("AB");
        }

    }
/*
    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Intent i=new Intent(this,DetailedBookActivity.class);
        i.putExtra("book", arrayList.get(position).toString());
        startActivity(i);
    }*/
}
