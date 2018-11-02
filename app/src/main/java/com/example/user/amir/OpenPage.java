package com.example.user.amir;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class OpenPage extends AppCompatActivity implements AdapterView.OnItemClickListener {

    ListView lvSubCategory;
    ArrayAdapter arrayAdapter;
    ArrayList<String> arrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_open_page);

        lvSubCategory =findViewById(R.id.lvSubCategory);
        fillSubCategoriesList();
        arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, arrayList);

    }
    public void fillSubCategoriesList(){
        String category = getIntent().getStringExtra("categories");
        if(category.equals("Science fiction")){
            arrayList.add("AA");
            arrayList.add("AB");
        }else if(category.equals("Action and Adventure")){

        }

    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Intent i=new Intent(this,DetailedBookActivity.class);
        i.putExtra("book", arrayList.get(position).toString());
        startActivity(i);
    }
}
