package com.example.programminglanguageadvisor;

import android.util.Log;

import java.util.ArrayList;
import java.util.List;

public class ProgrammingLanguageExpert {
    List<String> getProgrammingLanguages(String platform){
        List<String> programmingLanguages = new ArrayList<>();

        Log.d("Prikaz", "Platforma je: " + platform);

        if(platform.equals("Desktop development")){
            programmingLanguages.add("Java");
            programmingLanguages.add("C#");
            programmingLanguages.add("Delphi");
        }
        else if(platform.equals("Mobile development")){
            programmingLanguages.add("Java");
            programmingLanguages.add("Kotlin");
            programmingLanguages.add("Flutter");
        }
        else{
            programmingLanguages.add("Java");
            programmingLanguages.add("PHP");
            programmingLanguages.add("C#");
        }
        return programmingLanguages;
    }
}
