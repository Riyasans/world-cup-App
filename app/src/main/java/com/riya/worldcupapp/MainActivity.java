package com.riya.worldcupapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    private  static  CustomAdapter adapter;
    ArrayList<CountryModel> datamodels;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listview);
        // Data source
       datamodels = new ArrayList<>();
       datamodels.add(new CountryModel("India","10",R.drawable.india));
        datamodels.add(new CountryModel("Germany","5",R.drawable.germany));

        datamodels.add(new CountryModel("France","6",R.drawable.france));
        datamodels.add(new CountryModel("Spain","9",R.drawable.spain));

        datamodels.add(new CountryModel("Germany","2",R.drawable.suadi));


        //adapter
       adapter = new CustomAdapter(datamodels,getApplicationContext());
       listView.setAdapter(adapter);

       //handling Clickevents on listview

        listView.setOnItemClickListener(new  AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(MainActivity.this, "Country" +adapter.getItem(i).getCountry_name()+"\n" +
                        "World Cups wins:" + adapter.getItem(i).getCup_win_count(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}