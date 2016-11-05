package com.softw4re.turengdictionary;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;

/**
 * Created by ugurc on 4.11.2016.
 */
public class TurEngDictionary {

    private final String BASE_URL = "http://ws.tureng.com/TurengSearchServiceV4.svc/";

    private final String CODE = "46E59BAC-E593-4F4F-A4DB-960857086F9C";

    private static TurEngDictionary instance;

    private Service service;

    private TurEngDictionary(){
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        service = retrofit.create(Service.class);
    }

    public static TurEngDictionary getInstance(){
        if(instance == null){
            instance = new TurEngDictionary();
        }
        return instance;
    }


    public void translateAsync(String term, TranslationCallback translationCallback){

        service.search(new RequestBody(term, md5(term))).enqueue(new Callback<ResponseBody>() {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {

                if(response.isSuccessful()){
                    ResponseBody responseBody = response.body();

                    ArrayList<Translation> translations = new ArrayList<>();

                    for(ResponseBody.Result result : responseBody.result.results){
                        String term = result.term;

                        int arrowIndex = result.categoryEn.indexOf("->");
                        String fromLang = result.categoryEn.substring(arrowIndex-2, arrowIndex);
                        String toLang = result.categoryEn.substring(arrowIndex+2, arrowIndex+4);

                        String partOfSpeechEN = result.typeEn;
                        String partOfSpeechTR = result.typeTr;

                        Translation translation = new Translation(term, fromLang, toLang, partOfSpeechEN, partOfSpeechTR);
                        translations.add(translation);
                    }

                    translationCallback.onSuccess(translations);
                }
                else{
                    translationCallback.onError("Service error!");
                }
            }
            @Override
            public void onFailure(Call<ResponseBody> call, Throwable throwable) {
                translationCallback.onError(throwable.getMessage());
            }
        });

    }


    private String md5(String term){
        String str = term + CODE;
        try {
            MessageDigest md5 = MessageDigest.getInstance("MD5");
            md5.update(StandardCharsets.UTF_8.encode(str));

            return String.format("%032x", new BigInteger(1, md5.digest()));
        }catch (Exception ex){
            return "";
        }
    }

}
