package com.softw4re.turengdictionary.testapp;

import com.softw4re.turengdictionary.TranslationCallback;
import com.softw4re.turengdictionary.TurEngDictionary;
import com.softw4re.turengdictionary.TranslationResult;

import java.util.List;

/**
 * Created by ugurc on 4.11.2016.
 */
public class TestApp {

    public static void main(String[] args) {

        String term = "pay";

        TurEngDictionary.getInstance().translateAsync(term, new TranslationCallback() {
            @Override
            public void onSuccess(List<TranslationResult> translationResults) {
                for (TranslationResult translationResult : translationResults) {
                    System.out.println(translationResult);
                }
            }

            @Override
            public void onError(String message) {
                System.out.println(message);
            }
        });

    }

}
