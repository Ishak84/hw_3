package com.geeks.hw_3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<String> ufcNameList = new ArrayList<>();

    private RecyclerView ufcRv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findId();
        findAdapter();
        loadData();
    }

    private void loadData() {
        ufcNameList.add(" UFC P4P");
        ufcNameList.add("лучшие бойцы вне зависимости от весовой категории");
        ufcNameList.add("#1 ISLAM MAKHACHEV");
        ufcNameList.add("#2 JON JONES");
        ufcNameList.add("#3 ALEXANDER VOLKANOVCKI");
        ufcNameList.add("#4 LEON EDWARDS");
        ufcNameList.add("#5 ALEX PEREIRA");
        ufcNameList.add("#6 CHARLES OLIVEIRA");
        ufcNameList.add("#7 SEAN O MALLEY");
        ufcNameList.add("#8 DRICUS DU PLESSIS");
        ufcNameList.add("#9 ALEXANDRE PANTOJA");
        ufcNameList.add("#10 ISRAEL ADESANYA");
        ufcNameList.add("#11 SEAN STRICKLAND");
        ufcNameList.add("#12 TOM ASPINALL");
        ufcNameList.add("#13 ALJAMAIN STERLING");
        ufcNameList.add("#14 MAX HOLOWAY");
        ufcNameList.add("#15 KAMARU USMAN");
        ufcNameList.add("IRJI PROCHAZKA");
    }

    private void findAdapter() {
        UfcAdapter adapter = new UfcAdapter(ufcNameList);
        ufcRv.setAdapter(adapter);
    }

    private void findId() {
        ufcRv = findViewById(R.id.ufc_rv);
    }
}