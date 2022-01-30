package com.example.jetpack;

import android.util.Log;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import java.util.Random;

public class MainActivityDataGenerator extends ViewModel {
    private final String TAG =this.getClass().getSimpleName();
    private MutableLiveData<String>  myRandomNumber;

    public MutableLiveData<String> getNumber(){
        Log.i(TAG,"GetNumber");
        if(myRandomNumber==null){
            myRandomNumber=new MutableLiveData<>();
            createNumber();
        }
        return myRandomNumber;
    }
    public void createNumber(){
        Log.i(TAG,"Create new Number");
        Random random=new Random();
        myRandomNumber.setValue("Number"+(random.nextInt(10-1)+1));
    }

    @Override
    protected void onCleared( ) {
        super.onCleared();

        Log.i(TAG,"On cleared");
    }
}
