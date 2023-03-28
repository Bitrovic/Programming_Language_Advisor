package com.example.programminglanguageadvisor;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toolbar;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    private ProgrammingLanguageExpert expert = new ProgrammingLanguageExpert();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ConstraintLayout myLayout = (ConstraintLayout) findViewById(R.id.my_constraint_layout);
        myLayout.setBackgroundColor(Color.parseColor("#E1F5FE"));

        Spinner mySpinner = (Spinner)findViewById(R.id.computing_platforms);
        //mySpinner.setBackgroundColor(Color.parseColor("#0D47A1"));
    }

    public void onClickFindBeer(View view){
        TextView programmingLanguages = (TextView) findViewById(R.id.platforms);
        Spinner platforms = (Spinner) findViewById(R.id.computing_platforms);
        String platformType = String.valueOf(platforms.getSelectedItem());

        List<String> programmingLanguageList = expert.getProgrammingLanguages(platformType);
        StringBuilder programmingLanguageFormatted = new StringBuilder();

        programmingLanguageFormatted.append("Recommended languages:\n");
        for(String language : programmingLanguageList){
            programmingLanguageFormatted.append(language).append("\n");
        }
        programmingLanguages.setText(programmingLanguageFormatted);
    }
}