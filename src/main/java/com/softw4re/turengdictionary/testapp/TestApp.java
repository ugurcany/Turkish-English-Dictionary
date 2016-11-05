package com.softw4re.turengdictionary.testapp;

import com.softw4re.turengdictionary.TranslationCallback;
import com.softw4re.turengdictionary.TurEngDictionary;
import com.softw4re.turengdictionary.Translation;

import java.util.List;

/**
 * Created by ugurc on 4.11.2016.
 */
public class TestApp {

    public static void main(String[] args) {

        String term = "pay";

        TurEngDictionary.getInstance().translateAsync(term, new TranslationCallback() {
            @Override
            public void onSuccess(List<Translation> translations) {
                for (Translation translation : translations) {
                    System.out.println(translation);
                }
            }

            @Override
            public void onError(String message) {
                System.out.println(message);
            }
        });

    }

}
