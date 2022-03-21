package com.example.gkthu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Detail extends AppCompatActivity {

    private TextView txtten,txtgia,txtkieu;
    private ImageView imglo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        Intent intent=getIntent();
        Kinh k=(Kinh) intent.getSerializableExtra("kinh");

        txtten=(TextView) findViewById(R.id.txtten2);
        txtkieu=(TextView) findViewById(R.id.txtkieu2);
        txtgia=(TextView) findViewById(R.id.txtgia2);
        imglo=(ImageView)findViewById(R.id.imganh2);

        txtten.setText(k.getTen());
        txtgia.setText(k.getGia());
        txtkieu.setText(k.getKieu());
        imglo.setImageResource(k.getId());

    }
}