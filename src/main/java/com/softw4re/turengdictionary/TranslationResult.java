package com.softw4re.turengdictionary;

/**
 * Created by ugurc on 4.11.2016.
 */
public class TranslationResult {

    public String translation;
    public String fromLang;
    public String toLang;
    public String partOfSpeechEN;
    public String partOfSpeechTR;
    public String categoryEN;
    public String categoryTR;

    public TranslationResult(String translation,
                             String fromLang, String toLang,
                             String partOfSpeechEN, String partOfSpeechTR,
                             String categoryEN, String categoryTR){
        this.translation = translation;
        this.fromLang = fromLang;
        this.toLang = toLang;
        this.partOfSpeechEN = partOfSpeechEN;
        this.partOfSpeechTR = partOfSpeechTR;
        this.categoryEN = categoryEN;
        this.categoryTR = categoryTR;
    }

    @Override
    public String toString() {
        return "fromLang: " + fromLang + ", " +
                "toLang: " + toLang + ", " +
                "categoryEN: " + categoryEN + ", " +
                "categoryTR: " + categoryTR + ", " +
                "partOfSpeechEN: " + partOfSpeechEN + ", " +
                "partOfSpeechTR: " + partOfSpeechTR + ", " +
                "translation: " + translation;
    }

}
