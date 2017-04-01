package com.dce.puja.myapp0;
import android.app.Activity;
import android.content.SharedPreferences;


/**
 * Created by Devendra on 4/1/2017.
 */

public class Citypreference {
    SharedPreferences prefs;

    public Citypreference(Activity activity){
        prefs = activity.getPreferences(Activity.MODE_PRIVATE);
    }

    // If the user has not chosen a city yet, return
    // Sydney as the default city
    String getCity(){
        return prefs.getString("city", "Sydney, AU");
    }

    void setCity(String city){
        prefs.edit().putString("city",city).commit();
    }
}
