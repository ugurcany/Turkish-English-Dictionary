package com.softw4re.turengdictionary;

import java.util.List;

/**
 * Created by ugurc on 4.11.2016.
 */
public interface TranslationCallback {

    void onSuccess(List<TranslationResult> translationResults);

    void onError(String message);

}
