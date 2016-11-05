package com.softw4re.turengdictionary;

/**
 * Created by ugurc on 4.11.2016.
 */
public class Translation {

    public String term;
    public String fromLang;
    public String toLang;
    public String partOfSpeechEN;
    public String partOfSpeechTR;

    public Translation(String term, String fromLang, String toLang, String partOfSpeechEN, String partOfSpeechTR){
        this.term = term;
        this.fromLang = fromLang;
        this.toLang = toLang;
        this.partOfSpeechEN = partOfSpeechEN;
        this.partOfSpeechTR = partOfSpeechTR;
    }

    @Override
    public String toString() {
        if(partOfSpeechEN == null || partOfSpeechTR == null){
            return fromLang + "->" + toLang + ": " + term;
        }
        return fromLang + "->" + toLang + ": " + "(" + partOfSpeechEN + ", " + partOfSpeechTR + ") " + term;
    }
}
