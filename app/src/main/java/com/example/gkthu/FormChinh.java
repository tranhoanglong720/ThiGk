package com.example.gkthu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class FormChinh extends AppCompatActivity {
    List<Kinh> listkinh;
    ListView lvwkinh;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_chinh);

        listkinh=new ArrayList<>();
        lvwkinh=(ListView) findViewById(R.id.listitem);
        listkinh.add(new Kinh(R.drawable.niceglass2_removebg_preview_1, "Platis Optical", "15", "for man"));
        listkinh.add(new Kinh(R.drawable.g_rm_1, "Non-Platis", "19", "for man"));
        listkinh.add(new Kinh(R.drawable.niceglass4_removebg_preview_1, "Optical fiber", "10", "for man"));
        listkinh.add(new Kinh(R.drawable.niceglass6_removebg_preview_1, "Platis Optical", "15", "for man"));
        listkinh.add(new Kinh(R.drawable.niceglass2_removebg_preview_1, "Platis Optical", "15", "for man"));

        KinhAdapter adapter=new KinhAdapter(R.layout.itemlist,FormChinh.this,listkinh);
        lvwkinh.setAdapter(adapter);
    }
}