package com.example.user.amir;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class Main2Activity extends AppCompatActivity implements AdapterView.OnItemClickListener{

    ListView Lvbooks;

    ArrayAdapter<String>ArrayAdapter;

    ArrayList<String> arrayList=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        Lvbooks = findViewById(R.id.Lvbooks);
        arrayList.add("Science fiction");
        arrayList.add("Drama");
        arrayList.add("Action and Adventure");
        arrayList.add("Mystery");
        arrayList.add("Romance");


        ArrayAdapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,arrayList);
        Lvbooks.setAdapter(ArrayAdapter);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

        String selectedItem= arrayList.get(position);
        Intent i=new Intent(this,Main2Activity.class);
        if(selectedItem.equals("Science fiction")) {
            i.putExtra("categories", "Science fiction");
        }
            if(selectedItem.equals("Drama")) {
                i.putExtra("categories", "Drama");
            }
        if(selectedItem.equals("Action and Adventure ")) {
            i.putExtra("categories", "Action and Adventure");
        }
        if(selectedItem.equals("Mystery ")) {
            i.putExtra("categories", "Mystery");
        }
        if(selectedItem.equals("Romance ")) {
            i.putExtra("categories", "Romance");
        }

        }
    }

