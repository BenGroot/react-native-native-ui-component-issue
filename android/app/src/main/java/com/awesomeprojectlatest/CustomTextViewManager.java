package com.awesomeproject;

import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.annotations.ReactProp;

import android.widget.TextView;

import androidx.annotation.NonNull;

public class CustomTextViewManager extends SimpleViewManager<TextView> {

    @NonNull
    @Override
    protected TextView createViewInstance(@NonNull ThemedReactContext reactContext) {
        return new TextView(reactContext);
    }

    @NonNull
    @Override
    public String getName() {
        return "CustomTextView";
    }

    @ReactProp(name = "text")
    public void setText(TextView view, String text) {
        view.setText(text);
    }
}
