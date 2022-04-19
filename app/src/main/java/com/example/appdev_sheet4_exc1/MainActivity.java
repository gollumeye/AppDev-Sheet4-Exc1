package com.example.appdev_sheet4_exc1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.app.Activity;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView = findViewById(R.id.listview);

        String[] dataArray = {"","Apfel", "Banane", "Erdbeere", "Himbeere", "Blaubeere", "Traube", "Ananas", "Johannisbeere", "Aprikose", "Pfirsich", "Aubergine", "Birne", "Granatapfel", "Pflaume", "Zitrone", "Orange", "Wassermelone", "Honigmelone", "Zuckermelone", "Mango", "Kirsche", "Limette", ""};

        ArrayAdapter<String> arrayAdapter =new ArrayAdapter<>(this, R.layout.activity_list_view, R.id.textView, dataArray);
        listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast toast = new Toast(getApplicationContext());
                String text = dataArray[position];
                toast.setText(text);
                toast.show();
            }
        });


    }
}