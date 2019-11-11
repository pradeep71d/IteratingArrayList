package com.example.demo13;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("hjbjh");
        arrayList.add("uiojoj");
        arrayList.add("dhgjgj");
        arrayList.add("fgjhkhk");
        arrayList.add("efuguh");
        for (String s1 : arrayList) {
            System.out.println(s1);
        }

    }
}
