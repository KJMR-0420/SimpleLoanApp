package com.example.mtlabe_remolaciokurt;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputLayout;

import org.w3c.dom.Text;

public class MainActivity extends MainLoan {
EditText nameE;
EditText ageE;
EditText addressE;
TextInputLayout nameL,ageL,addressL;
Button proceed;
String st;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setLogo(R.mipmap.ic_launcher);
        getSupportActionBar().setDisplayUseLogoEnabled(true);
    initialize();

    proceed.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {

        con();

        }
    });
    }

public void initialize(){
        nameL=(TextInputLayout)findViewById(R.id.namelayout);
        ageL=(TextInputLayout)findViewById(R.id.agelayout);
        addressL=(TextInputLayout)findViewById(R.id.addresslayout);
        nameE=(EditText)findViewById(R.id.namesub);
        ageE=(EditText)findViewById(R.id.agesub);
        addressE=(EditText)findViewById(R.id.addresssub);
        proceed=(Button)findViewById(R.id.btnproceed);
}
public void con(){
        boolean isvalid = true;
    if (nameE.length()==0) {
            nameL.setError("Fill Up this Filled");
            isvalid = false;
        }
        else{
            nameL.setErrorEnabled(false);
        }

    if (ageE.length()==0 ) {
        ageL.setError("Fill Up this Filled ");
        isvalid = false;
    }

    else{
        ageL.setErrorEnabled(false);
    }
    if (addressE.length()==0) {
        addressL.setError("Fill Up this Filled");
        isvalid = false;
    }
    else{
        addressL.setErrorEnabled(false);
    }

        if(isvalid){
            Intent i =new Intent(MainActivity.this,MainLoan.class);
        st=ageE.getText().toString();
            i.putExtra("value",st);
            startActivity(i);
            finish();
        }
}
public void Agevalidity(){
        int age= Integer.parseInt(ageE.getText().toString());
        if (age<=17 && age>=66) {
            ageE.setError("Your age is not allowed");
        }
        else{
            Toast.makeText(this, "Information Validated", Toast.LENGTH_SHORT).show();
        }
}

}