package com.example.gkthu;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class KinhAdapter extends BaseAdapter {
    private List<Kinh> listkinh;
    private Context context;
    private int Layout;

    public KinhAdapter( int layout, Context context,List<Kinh> listkinh) {
        this.listkinh = listkinh;
        this.context = context;
        Layout = layout;
    }


    @Override
    public int getCount() {
        if(listkinh.size() !=0&& !listkinh.isEmpty())
        {
            return listkinh.size();
        }
        return 0;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup parent) {
        if(listkinh.size() !=0&& !listkinh.isEmpty())
        {
            view= LayoutInflater.from(parent.getContext()).inflate(Layout,parent,false);
        }
        TextView txtten=(TextView)view.findViewById(R.id.txtten);
        TextView txtgia=(TextView) view.findViewById(R.id.txtgia);
        TextView txtkieu=(TextView) view.findViewById(R.id.txtkieu);
        ImageView imglogo=(ImageView) view.findViewById(R.id.imganh);

        final Kinh k=listkinh.get(i);
        txtten.setText(k.getTen());
        txtgia.setText(k.getGia());
        txtkieu.setText(k.getKieu());
        imglogo.setImageResource(k.getId());
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(context,Detail.class);
                intent.putExtra("kinh",k);
                context.startActivity(intent);
            }
        });

        return view;
    }
}
