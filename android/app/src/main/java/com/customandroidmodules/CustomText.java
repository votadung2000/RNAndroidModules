package com.customandroidmodules;

import androidx.annotation.NonNull;

import android.app.Activity;
import android.util.Log;
import android.widget.TextView;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;

public class CustomText extends ReactContextBaseJavaModule {

    private TextView textView;
    private Activity activity;
    private static ReactApplicationContext reactContext;

    CustomText(ReactApplicationContext context) {
        super(context);
        reactContext = context;
    }

    @ReactMethod
    public void setInfoText(String name, String color){
//        activity.setContentView(R.layout.custom_text_modules);
//        activity.setContentView(R.layout.custom_text_modules);
        Log.d("setInfoText.name", name);
        Log.d("setInfoText.color", color);
        textView = (TextView)textView.findViewById(R.id.textCustom);
//        textView.setText(name);
//        textView.setTextColor(Integer.parseInt(color));
    }

    @NonNull
    @Override
    public String getName() {
        return "CustomTextExample";
    }
}