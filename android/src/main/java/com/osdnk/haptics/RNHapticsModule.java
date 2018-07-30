
package com.osdnk.haptics;

import android.content.Context;
import android.os.Vibrator;
import android.view.View;
import 	android.view.HapticFeedbackConstants;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
public class RNHapticsModule extends ReactContextBaseJavaModule {
 // private final Vibrator mVibrator =  (Vibrator) getCurrentActivity().getApplicationContext().getSystemService(Context.VIBRATOR_SERVICE);

  public RNHapticsModule(ReactApplicationContext reactContext) {
    super(reactContext);
  }

  @Override
  public String getName() {
    return "RNHaptics";
  }

  @ReactMethod
  public void notification(String type){
  }

  @ReactMethod
  public void selection(){

  }

  @ReactMethod
  public void impact(String type){

  }
}