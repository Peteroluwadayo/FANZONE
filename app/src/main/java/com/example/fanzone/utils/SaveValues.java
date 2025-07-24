package com.example.fanzone.utils;

import android.content.Context;
import android.content.SharedPreferences;

//import live.cluster.work.R;
import com.example.fanzone.R;


public class SaveValues {

    private static Context myContext;

    public SaveValues(Context myContext) {

        this.myContext = myContext;
    }

//    public boolean sharedPreferenceExist(String prefKey){
//        SharedPreferences mySharedPreference = myContext.getSharedPreferences(myContext.getString(R.string.myPref), Context.MODE_PRIVATE);
//        if(!mySharedPreference.contains(prefKey)){
//            return true;
//        }
//        else{
//            return false;
//        }
//    }

    public void clearPrefValue(String prefKey) {
        SharedPreferences mySharedPreference = myContext.getSharedPreferences(myContext.getString(R.string.myPref), Context.MODE_PRIVATE);
        SharedPreferences.Editor myEditor = mySharedPreference.edit();
        myEditor.remove(prefKey);
        myEditor.apply();
    }

    public void saveStringPrefValue(String prefKey, String value) {
        SharedPreferences mySharedPreferences = myContext.getSharedPreferences(myContext.getString(R.string.myPref), Context.MODE_PRIVATE);
        SharedPreferences.Editor myEditor = mySharedPreferences.edit();
        myEditor.putString(prefKey, value);
        myEditor.apply();
    }

    public  void saveIntPrefValue(String prefKey, int value) {
        SharedPreferences mySharedPreference = myContext.getSharedPreferences(myContext.getString(R.string.myPref), Context.MODE_PRIVATE);
        SharedPreferences.Editor myEditor = mySharedPreference.edit();
        myEditor.putInt(prefKey, value);
        myEditor.apply();
    }

    public  void saveBooleanPrefValue(String prefKey, boolean value) {
        SharedPreferences mySharedPreference = myContext.getSharedPreferences(myContext.getString(R.string.myPref), Context.MODE_PRIVATE);
        SharedPreferences.Editor myEditor = mySharedPreference.edit();
        myEditor.putBoolean(prefKey, value);
        myEditor.apply();
    }

    public  String getStringPrefValue(String prefKey) {
        SharedPreferences mySharedPreference = myContext.getSharedPreferences(myContext.getString(R.string.myPref), Context.MODE_PRIVATE);
       return  mySharedPreference.getString(prefKey, null);

    }

    public int getIntPrefValue(String prefKey) {
        SharedPreferences mySharedPreference = myContext.getSharedPreferences(myContext.getString(R.string.myPref), Context.MODE_PRIVATE);
       return mySharedPreference.getInt(prefKey,0);

    }

    public boolean getBooleanPrefValue(String prefKey) {
        SharedPreferences mySharedPreference = myContext.getSharedPreferences(myContext.getString(R.string.myPref), Context.MODE_PRIVATE);
        return mySharedPreference.getBoolean(prefKey,false);

    }

}
