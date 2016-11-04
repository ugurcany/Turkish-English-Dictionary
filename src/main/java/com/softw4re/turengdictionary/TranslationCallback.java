package com.softw4re.turengdictionary;

import com.softw4re.turengdictionary.model.Translation;

import java.util.List;

/**
 * Created by ugurc on 4.11.2016.
 */
public interface TranslationCallback {

    void onSuccess(List<Translation> translationList);

    void onError(String message);

}
