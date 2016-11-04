package com.softw4re.turengdictionary;

import com.softw4re.turengdictionary.model.Translation;
import retrofit2.Retrofit;

import java.util.ArrayList;

/**
 * Created by ugurc on 4.11.2016.
 */
public class TurEngDictionary {

    private final String BASE_URL = "https://service.github.com/";

    private static TurEngDictionary instance;

    private Service service;

    private TurEngDictionary(){
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .build();

        service = retrofit.create(Service.class);
    }

    public static TurEngDictionary getInstance(){
        if(instance == null){
            instance = new TurEngDictionary();
        }
        return instance;
    }


    public void translateAsync(String word, TranslationCallback translationCallback){
        ArrayList<Translation> translations = new ArrayList<>();

        translationCallback.onError("TEST");
    }

}
