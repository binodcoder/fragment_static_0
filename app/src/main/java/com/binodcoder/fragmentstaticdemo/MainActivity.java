package com.binodcoder.fragmentstaticdemo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import com.binodcoder.fragmentstaticdemo.Fragmetns.Fragment1;
import com.binodcoder.fragmentstaticdemo.Fragmetns.Fragment2;

public class MainActivity extends AppCompatActivity {
    Button first, second;
    LinearLayout layout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        first=(Button)findViewById(R.id.btn_first);
        second=(Button)findViewById(R.id.btn_second);
        layout=(LinearLayout)findViewById(R.id.linear_layout1);


        first.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment1 fragment1=new Fragment1();
                FragmentTransaction fragmentTransaction=getSupportFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.linear_layout1, fragment1);
                fragmentTransaction.commit();

            }
        });

        second.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment2 fragment2=new Fragment2();
                FragmentTransaction fragmentTransaction=getSupportFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.linear_layout1, fragment2);
                fragmentTransaction.commit();

            }
        });
    }
}