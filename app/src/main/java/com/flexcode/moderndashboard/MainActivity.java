package com.flexcode.moderndashboard;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    View layoutAccount,layoutWallet,layoutPay,layoutKopa,layoutInvest,layoutInsurance;
    EditText EtSearch;
    TextView tvUsername;
    Button btnDeposit;
    TextView tvClose;
    Dialog myDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*layoutPay = findViewById(R.id.layoutPay);
        layoutAccount = findViewById(R.id.layoutAccount);
        layoutWallet = findViewById(R.id.layoutWallet);
        layoutKopa = findViewById(R.id.layoutKopa);
        layoutInvest = findViewById(R.id.layoutInvest);
        layoutInsurance = findViewById(R.id.layoutInsurance);
        EtSearch = findViewById(R.id.EtSearch);
        tvUsername = findViewById(R.id.tvUsername);
        tvClose = findViewById(R.id.tvClose);

        myDialog = new Dialog(this);

        //intents for all the layouts
        layoutPay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent payIntent = new Intent(MainActivity.this,PayBills.class);
                startActivity(payIntent);
            }
        });
        layoutAccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent account = new Intent(MainActivity.this, MyAccount.class);
                startActivity(account);
            }
        });
        /*layoutWallet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent wallet = new Intent(MainActivity.this, Wallet.class);
                startActivity(wallet);
            }
        });*/
        /*layoutKopa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent kopa = new Intent(MainActivity.this, Kopa.class);
                startActivity(kopa);
            }
        });
        layoutInvest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sacco = new Intent(MainActivity.this, FlexSacco.class);
                startActivity(sacco);
            }
        });
        layoutInsurance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent insuranceIntent = new Intent(MainActivity.this,Insurance.class);
                startActivity(insuranceIntent);
            }
        });*/
    }

    /*public void Showpopup(View v) {
        myDialog.setContentView(R.layout.walletpopup);
        tvClose = myDialog.findViewById(R.id.tvClose);
        btnDeposit = myDialog.findViewById(R.id.btnDeposit);

        tvClose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myDialog.dismiss();
            }
        });
        myDialog.show();
    }*/
}