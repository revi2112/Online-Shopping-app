package com.example.app_design;


import androidx.appcompat.app.AppCompatActivity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    GridView gv;
    String name[]={"TURMERIC","PAPAYA","COCONUT","SPINACH","FISH","TOMATO","CARROT","NUTMEG"};
    String desp[]={"HERB","FRUIT","FIBROUS FRUIT","GREEN LEAVES","SEA FOOD","VEGETABLE","VEGETABLE","SEED"};
    String price[]={"350/KG","200/KG","100/KG","250/KG","300/KG","40/KG","80/KG","120/KG"};
    String off[]={"5% off","18% off","11% off","3% off","28% off","3% off","5% off","9%off"};
    int picture[]={R.drawable.tumeric,R.drawable.papaya,R.drawable.coconut,R.drawable.spinach1,R.drawable.fish,R.drawable.tomato,R.drawable.carrot,R.drawable.nutmeg};
    @Override protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        gv = findViewById(R.id.grid);
        gv.setAdapter(new myAdapter(this));
    }
    private class myAdapter extends BaseAdapter {
        Context mycontext;
        public myAdapter(SecondActivity mainActivity) {
            mycontext=mainActivity;
        }
        @Override
        public int getCount() {
            return name.length;
        }
        @Override
        public Object getItem(int position) {
            return null;
        }
        @Override
        public long getItemId(int position) {
            return 0;
        }
        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            View view =
                    LayoutInflater.from(mycontext).inflate(R.layout.layout,parent,false); TextView t1=view.findViewById(R.id.textView);
            TextView t2=view.findViewById(R.id.textView2);
            TextView t3 = view.findViewById(R.id.textView5);
            ImageView iv = view.findViewById(R.id.imageView);
            Button b = view.findViewById(R.id.button);
            t1.setText(name[position]);
            t2.setText(desp[position]);
            t3.setText(price[position]);
            iv.setImageResource(picture[position]);
            b.setText("Details");
            b.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i = new Intent(getApplicationContext(),MainActivity2.class);
                    i.putExtra("name",name[position]);
                    i.putExtra("desc",desp[position]);
                    i.putExtra("price",price[position]);
                    i.putExtra("picture",picture[position]);
                    i.putExtra("off",off[position]);
                    i.putExtra("pos",position );
                    startActivity(i);
                }
            });
            return view;
        }
    }
}
