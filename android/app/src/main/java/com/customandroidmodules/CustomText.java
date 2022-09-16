package com.customandroidmodules;

import androidx.annotation.NonNull;

import android.app.Activity;
import android.graphics.Color;
import android.util.Log;
import android.widget.TextView;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.views.text.ReactTextView;

public class CustomText extends SimpleViewManager<ReactTextView> {
    private ReactTextView textView;
    private Activity activity;

    ReactApplicationContext reactContext;

    public CustomText(ReactApplicationContext context) {
        reactContext = context;
    }

    @NonNull
    @Override
    public String getName() {
        return "CustomTextExample";
    }

    @NonNull
    @Override
    protected ReactTextView createViewInstance(@NonNull ThemedReactContext reactContext) {
        Log.d("reactContext", String.valueOf(reactContext));
        textView = new ReactTextView(reactContext);
        return textView;
    }

    @ReactProp(name = "context")
    public void setTextProp(ReactTextView reactTextView, String context) {
        reactTextView.setText(context);
    }

    @ReactProp(name = "color")
    public void setColorText(ReactTextView reactTextView, String color) {
        reactTextView.setTextColor(Color.parseColor(color));
    }
}