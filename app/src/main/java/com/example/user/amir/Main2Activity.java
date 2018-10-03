package com.example.user.amir;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class Main2Activity extends AppCompatActivity implements AdapterView.OnItemClickListener{

ListView Lvcountries;

ArrayAdapter<String>arrayAdapter;

    ArrayList<String> arrayList=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        Lvcountries = findViewById(R.id.Lvcountries);
        arrayList.add("Germany");
        arrayList.add("France");
        arrayList.add("Antwan");

    arrayAdapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,arrayList);
    Lvcountries.setAdapter(arrayAdapter);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
       String selectedItem= arrayList.get(position);
if(selectedItem.equals("Germany")){

}
    }
}
