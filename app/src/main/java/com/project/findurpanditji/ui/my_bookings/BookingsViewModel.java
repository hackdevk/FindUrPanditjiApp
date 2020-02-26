package com.project.findurpanditji.ui.my_bookings;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class BookingsViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public BookingsViewModel() {
        mText = new MutableLiveData<>();
//        mText.setValue("This is home fragment");
//        mText.setValue("");
    }

    public LiveData<String> getText() {
        return mText;
    }
}