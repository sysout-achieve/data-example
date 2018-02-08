package com.example.msi.dbsproject;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        final TextView text = (TextView) findViewById(R.id.text_id);
        final TextView size_id = (TextView) findViewById(R.id.size_id);

        final EditText input = (EditText) findViewById(R.id.input);
        EditText input2 = (EditText) findViewById(R.id.input2);
        EditText input3 = (EditText) findViewById(R.id.input3);

        Button btn = (Button) findViewById(R.id.btn);
        Button btn2 = (Button) findViewById(R.id.btn2);

        SharedPreferences name = getSharedPreferences("name" , MODE_PRIVATE);
        SharedPreferences.Editor editor = name.edit();
        SharedPreferences size = getSharedPreferences("size", MODE_PRIVATE);
        SharedPreferences.Editor editsize = size.edit();
        String test;
        ArrayList<String> Al = new ArrayList<>();




        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText input2 = (EditText) findViewById(R.id.input2);
                EditText input3 = (EditText) findViewById(R.id.input3);

                SharedPreferences gd = getSharedPreferences(input.getText().toString(), MODE_PRIVATE); //input이름으로 SharedPreferences 생성
                SharedPreferences.Editor edit_gd = gd.edit();


                edit_gd.putString("1", input2.getText().toString() );
                edit_gd.putString("2", input3.getText().toString());
                edit_gd.commit();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences gd = getSharedPreferences(input.getText().toString(), MODE_PRIVATE);
                text.setText(gd.getString("1",""));
                size_id.setText(gd.getString("2",""));
            }
        });







//        String txt = input.getText().toString();
//        editor.putString("long", "padding");
//        editsize.putString("long", "라지");
//
//        editor.commit();
//        editsize.commit();
//
//
//        btn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                EditText input = (EditText) findViewById(R.id.input);
//                String txt = input.getText().toString();
//                TextView text = (TextView) findViewById(R.id.text_id);
//                TextView size_id = (TextView) findViewById(R.id.size_id);
//                SharedPreferences name = getSharedPreferences("name" , MODE_PRIVATE);
//                SharedPreferences size = getSharedPreferences("size", MODE_PRIVATE);
//                text.setText(name.getString(txt,"윽"));
//                size_id.setText(size.getString(txt,"아니냐?"));
//            }
//        });
//

    }

}
