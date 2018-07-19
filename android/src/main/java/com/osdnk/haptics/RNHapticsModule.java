
package com.osdnk.haptics;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
public class RNHapticsModule extends ReactContextBaseJavaModule {

  private final ReactApplicationContext reactContext;

  public RNHapticsModule(ReactApplicationContext reactContext) {
    super(reactContext);
    this.reactContext = reactContext;
  }

  @Override
  public String getName() {
    return "RNHaptics";
  }

  @ReactMethod
  public void tada(){
    //no-op
  }
}