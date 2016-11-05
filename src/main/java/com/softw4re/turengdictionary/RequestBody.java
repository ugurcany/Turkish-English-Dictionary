package com.softw4re.turengdictionary;

import com.google.gson.annotations.SerializedName;

/**
 * Created by ugurc on 5.11.2016.
 */
class RequestBody {

    @SerializedName("Term")
    String term;

    @SerializedName("Code")
    String code;

    RequestBody(String term, String code){
        this.term = term;
        this.code = code;
    }

}
