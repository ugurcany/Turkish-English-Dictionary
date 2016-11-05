package com.softw4re.turengdictionary;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by ugurc on 5.11.2016.
 */
class ResponseBody {

    @SerializedName("IsSuccessful")
    boolean isSuccessful;

    @SerializedName("Term")
    String term;

    @SerializedName("MobileResult")
    MobileResult result;

    @SerializedName("Suggestions")
    List<String> suggestions;


    class MobileResult{

        @SerializedName("IsFound")
        int isFound;

        @SerializedName("IsTRToEN")
        int isTr2En;

        @SerializedName("Results")
        List<Result> results;

    }

    class Result{

        @SerializedName("CategoryEN")
        String categoryEn;

        @SerializedName("CategoryTR")
        String categoryTr;

        @SerializedName("Term")
        String term;

        @SerializedName("TypeEN")
        String typeEn;

        @SerializedName("TypeTR")
        String typeTr;

    }

}
