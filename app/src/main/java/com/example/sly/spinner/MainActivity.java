package com.example.sly.spinner;

import android.app.Activity;

import android.content.Context;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;




//public class MainActivity extends Activity implements AdapterView.OnItemSelectedListener

public class MainActivity extends Activity implements AdapterView.OnItemSelectedListener {

    Button btnSubmit;
    Spinner spinner;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnSubmit =  findViewById(R.id.btnSubmit);
        spinner = findViewById(R.id.spinner);
        btnSubmit.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

               // validateEditTexts();

                if(1 <= spinner.getSelectedItemPosition()){

                    //perform when user select spinner item

                    Context context = getApplicationContext();
                    CharSequence text = "Hello toast!";
                    int duration = Toast.LENGTH_SHORT;

                    Toast toast = Toast.makeText(context, text, duration);
                    toast.show();
                }else{

                    //put Dialog for alert please select spinner item

                    Context context = getApplicationContext();
                    CharSequence text = "Failed!";
                    int duration = Toast.LENGTH_SHORT;

                    Toast toast = Toast.makeText(context, text, duration);
                    toast.show();

                }




            }
        });

        // Spinner element
        Spinner spinner =findViewById(R.id.spinner);
        Spinner spinner2 =findViewById(R.id.spinner2);

        // Spinner click listener
        spinner.setOnItemSelectedListener(this);

        // Spinner Drop down elements
        List<String> categories = new ArrayList<String>();
        categories.add("Automobile");
        categories.add("Business Services");
        categories.add("Computers");
        categories.add("Education");
        categories.add("Personal");
        categories.add("Travel");

        // Creating adapter for spinner
        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, categories);

        // Drop down layout style - list view with radio button
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        // attaching data adapter to spinner
        spinner.setAdapter(dataAdapter);



        //spinner two

        // Spinner element
       // Spinner spinner2 =findViewById(R.id.spinner2);

        // Spinner click listener
        spinner2.setOnItemSelectedListener(this);

        // Spinner Drop down elements
        List<String> king = new ArrayList<String>();
        king.add("rooney");
        king.add("van");
        king.add("toti");
        king.add("Education");
        king.add("Personal");
        king.add("Travel");

        // Creating adapter for spinner
        ArrayAdapter<String> kingAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, king);

        // Drop down layout style - list view with radio button
        kingAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        // attaching data adapter to spinner
        spinner2.setAdapter(kingAdapter);
;


    }

    Boolean temp = false;
    Boolean check = false;

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        // On selecting a spinner item

        /*
        String item = parent.getItemAtPosition(position).toString();

        // Showing selected spinner item
        Toast.makeText(parent.getContext(), "Selected: " + item, Toast.LENGTH_LONG).show();

        */
        if(temp){
            check = false;
        }
       temp = true;

    }

    public void onNothingSelected(AdapterView<?> arg0) {
        // TODO Auto-generated method stub

        check = false;
    }

    // function to validate edittexts
/*
    private boolean validateEditTexts() {
        boolean valid = true;
     /*

        if (newSpinnerItemText.getText().toString().trim().equals("")) {
            newSpinnerItemText.requestFocus(); //to show message
            newSpinnerItemText.setError("Please enter something");  // icon only
            valid = false;
        }
        */


        // Similarly check all your EditTexts here and set the value of valid

       // return valid;


    }




