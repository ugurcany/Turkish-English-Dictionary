package com.softw4re.turengdictionary;

import com.softw4re.turengdictionary.model.Translation;
import com.softw4re.turengdictionary.TurEngDictionary;

import java.util.List;

/**
 * Created by ugurc on 4.11.2016.
 */
public class TestApp {

    public static void main(String[] args){

        TurEngDictionary.getInstance().translateAsync("pay", new TranslationCallback() {
            @Override
            public void onSuccess(List<Translation> translationList) {

            }

            @Override
            public void onError(String message) {
                System.out.println(message);
            }
        });

    }

}
