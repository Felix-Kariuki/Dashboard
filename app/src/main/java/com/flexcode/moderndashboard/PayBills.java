package com.flexcode.moderndashboard;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;

public class PayBills extends AppCompatActivity {
    View layoutKplcPrepaid,layoutkplcPostpaid,layoutDstv,layoutZuku,layoutGoTv,layoutStartimes,layoutNetflix,layoutShowmax;
    ImageView IvMenu;
    EditText EtSearch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pay_bills);

        /*layoutKplcPrepaid = findViewById(R.id.layoutKplcPrepaid);
        layoutkplcPostpaid = findViewById(R.id.layoutkplcPostpaid);
        layoutDstv = findViewById(R.id.layoutDstv);
        layoutZuku = findViewById(R.id.layoutZuku);
        layoutGoTv = findViewById(R.id.layoutGoTv);
        layoutStartimes = findViewById(R.id.layoutStartimes);
        layoutNetflix = findViewById(R.id.layoutNetflix);
        layoutShowmax = findViewById(R.id.layoutShowmax);
        IvMenu = findViewById(R.id.IvMenu);
        EtSearch = findViewById(R.id.EtSearch);*/
    }
}