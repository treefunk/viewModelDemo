package com.treefunk.viewmodeldemo.ui.main;

import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;

public class MainViewModel extends ViewModel {
    // TODO: Implement the ViewModel
    private static final Float usd_to_eu_rate = 0.74F;
//    private String dollarText = "";
//    private Float result = 0F;
    public MutableLiveData<String> dollarValue = new MutableLiveData<>();
    public MutableLiveData<Float> result = new MutableLiveData<>();

//    public void setAmount(String value){
//        this.dollarText = value;
//        result.setValue(Float.valueOf(dollarText) * MainViewModel.usd_to_eu_rate);
//    }
//
//    public MutableLiveData<Float> getResult(){
//        return this.result;
//    }

    public void convertValue(){
        if((dollarValue.getValue() != null) && (!dollarValue.getValue().equals(""))){
            result.setValue(Float.valueOf(dollarValue.getValue()) * usd_to_eu_rate);
        }else{
            result.setValue(0F);
        }
    }

}
