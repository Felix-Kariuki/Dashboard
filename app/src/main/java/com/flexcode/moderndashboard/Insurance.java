package com.flexcode.moderndashboard;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Insurance extends AppCompatActivity {
    Button btnRegister,btnSubmit;
    EditText EtSearch;
    View layoutHealth,layoutMotor,layoutHouse;
    Dialog myDialog;
    TextView tvClose;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_insurance);

        /*btnRegister = findViewById(R.id.btnRegister);
        btnSubmit = findViewById(R.id.btnSubmit);
        EtSearch = findViewById(R.id.EtSearch);
        layoutHealth = findViewById(R.id.layoutHealth);
        layoutMotor = findViewById(R.id.layoutMotor);
        layoutHouse = findViewById(R.id.layoutHouse);

        myDialog = new Dialog(this);*/
    }
    /*public void Showpopup(View V) {
        myDialog.setContentView(R.layout.insuranceregisterpopup);
        tvClose = myDialog.findViewById(R.id.tvClose);
        btnSubmit = myDialog.findViewById(R.id.btnSubmit);

        tvClose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myDialog.dismiss();
            }
        });
        myDialog.show();
    }*/
}