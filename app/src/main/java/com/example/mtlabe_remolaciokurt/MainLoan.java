package com.example.mtlabe_remolaciokurt;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.provider.MediaStore;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import com.google.android.material.textfield.TextInputLayout;

import org.w3c.dom.Text;

import java.security.cert.Extension;

public class MainLoan extends AppCompatActivity {
RadioButton rad1,rad2,rad3,rad4;
RadioButton radp1,radp2,radp3;
EditText age;
String st;
TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_loan);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setLogo(R.mipmap.ic_launcher);
        getSupportActionBar().setDisplayUseLogoEnabled(true);
        final RadioButton sal1 = (RadioButton) findViewById(R.id.sr1);
        final RadioButton sal2 = (RadioButton) findViewById(R.id.sr2);
        final RadioButton sal3 = (RadioButton) findViewById(R.id.sr3);
        final RadioButton sal4 = (RadioButton) findViewById(R.id.sr4);

        final RadioButton l1 = (RadioButton) findViewById(R.id.lp1);
        final RadioButton l2 = (RadioButton) findViewById(R.id.lp2);
        final RadioButton l3 = (RadioButton) findViewById(R.id.lp3);
        final TextView inttxt = (TextView) findViewById(R.id.loaninterest);
        final TextView lntxt = (TextView) findViewById(R.id.loantxt);
        final Button check = (Button) findViewById(R.id.btncheck);

        rad1 = (RadioButton) findViewById(R.id.sr1);
        rad2 = (RadioButton) findViewById(R.id.sr2);
        rad3 = (RadioButton) findViewById(R.id.sr3);
        rad4 = (RadioButton) findViewById(R.id.sr4);


        radp1 = (RadioButton) findViewById(R.id.lp1);
        radp2 = (RadioButton) findViewById(R.id.lp2);
        radp3 = (RadioButton) findViewById(R.id.lp3);
        tv= findViewById(R.id.tv);

    check.setOnClickListener(new View.OnClickListener() {

        @Override
        public void onClick(View v) {

st=getIntent().getExtras().getString("value");
tv.setText(st);
int ageinput = Integer.parseInt(tv.getText().toString());

            int salary=0;
            double ageallow=0;
            int salaryallow=0;
            double loanallow=0;
            double inter=0;
            if(rad1.isChecked()){

                salary=0;
                salaryallow=salary/5;
                ageallow = (ageinput / 10 - (ageinput % 10) / 10) - 1;
                loanallow=salaryallow*ageallow;
                lntxt.setText(""+loanallow);
            }
            if(rad2.isChecked()){
                salary=10000;
                salaryallow=salary/5;
                ageallow = (ageinput / 10 - (ageinput % 10) / 10) - 1;
                loanallow=salaryallow*ageallow;
                lntxt.setText(""+loanallow);
            }
            if(rad3.isChecked()){
                salary=25000;
                salaryallow=salary/5;
                ageallow = (ageinput / 10 - (ageinput % 10) / 10) - 1;
                loanallow=salaryallow*ageallow;
                lntxt.setText(""+loanallow);
            }
            if(rad4.isChecked()){
                salary=50000;
                salaryallow=salary/5;
                ageallow = (ageinput / 10 - (ageinput % 10) / 10) - 1;
                loanallow=salaryallow*ageallow;
                lntxt.setText(""+loanallow);
            }
            if(radp1.isChecked()){
                inter=loanallow*.08;
                inttxt.setText(""+inter);
            }
            if(radp2.isChecked()){
                inter=loanallow*.115;
                inttxt.setText(""+inter);
            }
            if(radp3.isChecked()){
                inter=loanallow*.15;
                inttxt.setText(""+inter);
            }
        }
    });
    }

    }


