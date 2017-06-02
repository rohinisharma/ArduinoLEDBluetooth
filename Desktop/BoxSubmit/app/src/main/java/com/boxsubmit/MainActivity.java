package com.boxsubmit;

import android.app.*;
import android.os.*;
import android.view.*;
import android.widget.*;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends Activity {
    Button submit;
    EditText textbox;

    private ListView listView;
    List<String> strings;
    ArrayAdapter<String> arrayAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView) findViewById(R.id.listview);
        strings = new ArrayList<>();

        arrayAdapter = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,strings);
        listView.setAdapter(arrayAdapter);
        submit = (Button) findViewById(R.id.submitbutton);
        textbox = (EditText) findViewById(R.id.editText);
        submit.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

                strings.add(textbox.getText().toString());
                arrayAdapter.notifyDataSetChanged();
                textbox.setText("");





            }



        }





        );
    }
}
