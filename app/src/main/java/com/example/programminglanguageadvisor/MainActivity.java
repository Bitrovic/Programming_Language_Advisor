package com.example.programminglanguageadvisor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    private ProgrammingLanguageExpert expert = new ProgrammingLanguageExpert();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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