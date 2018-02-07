package com.example.msi.dbsproject;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        TextView text = (TextView) findViewById(R.id.text_id);
        TextView size_id = (TextView) findViewById(R.id.size_id);
        EditText input = (EditText) findViewById(R.id.input);
        Button btn = (Button) findViewById(R.id.btn);

        SharedPreferences name = getSharedPreferences("name" , MODE_PRIVATE);
        SharedPreferences.Editor editor = name.edit();
        SharedPreferences size = getSharedPreferences("size", MODE_PRIVATE);
        SharedPreferences.Editor editsize = size.edit();



        String txt = input.getText().toString();
        editor.putString("long", "padding");
        editsize.putString("long", "라지");

        editor.commit();
        editsize.commit();


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText input = (EditText) findViewById(R.id.input);
                String txt = input.getText().toString();
                TextView text = (TextView) findViewById(R.id.text_id);
                TextView size_id = (TextView) findViewById(R.id.size_id);
                SharedPreferences name = getSharedPreferences("name" , MODE_PRIVATE);
                SharedPreferences size = getSharedPreferences("size", MODE_PRIVATE);
                text.setText(name.getString(txt,"윽"));
                size_id.setText(size.getString(txt,"아니냐?"));
            }
        });


    }

}
