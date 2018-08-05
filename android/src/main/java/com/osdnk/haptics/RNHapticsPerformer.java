
package com.osdnk.haptics;

import android.os.Build;
import android.os.VibrationEffect;
import android.os.Vibrator;

/*package*/ class RNHapticsPerformer {
  private final Vibrator mVibrator;

  private static final long[] notificationSuccessIntervals =  {0, 35, 65, 21};
  private static final int[] notificationSuccessAmplitudes =  {0, 250, 0, 180};

  private static final long[] notificationErrorIntervals =  {0, 30, 40, 30, 50, 80};
  private static final int[] notificationErrorAmplitudes =  {255, 255, 255, 255, 255, 255};

  private static final long[] notificationWarningIntervals =  {0, 27, 45, 50};
  private static final int[] notificationWarningAmplitudes =  {0, 120, 0, 250};

  private static final long[] impactMediumIntervals =  {0, 43};
  private static final int[] impactMediumAmplitudes =  {0, 180};

  private static final long[] impactHeavyIntervals =  {0, 60};
  private static final long[] impactHeavyOldIntervals =  {0, 61};
  private static final int[] impactHeavyAmplitudes =  {0, 255};

  private static final long[] impactLightIntervals =  {0, 50};
  private static final long[] impactLightOldIntervals =  {0, 20};
  private static final int[] impactLightAmplitudes =  {0, 110};

  private static final long[] selectionIntervals =  {0, 100};
  private static final long[] selectionOldIntervals =  {0, 70};
  private static final int[] selectionAmplitudes =  {0, 100};

  private void perform(long [] intervals, int [] amplitudes, long [] oldIntervals) {
    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
      mVibrator.vibrate(VibrationEffect.createWaveform(intervals, amplitudes, -1));
    } else {
      mVibrator.vibrate(oldIntervals, -1);
    }
  }

  private void perform(long [] intervals, int [] amplitudes) {
    perform(intervals, amplitudes, intervals);
  }


  /*package*/ RNHapticsPerformer(Vibrator vibrator) {
    mVibrator = vibrator;
  }

  /*package*/ void notificationSuccess() {
    perform(notificationSuccessIntervals, notificationSuccessAmplitudes);
  }

  /*package*/ void notificationWarning() {
    perform(notificationWarningIntervals, notificationWarningAmplitudes);
  }

  /*package*/ void notificationError() {
    perform(notificationErrorIntervals, notificationErrorAmplitudes);
  }

  /*package*/ void impactMedium() {
    perform(impactMediumIntervals, impactMediumAmplitudes);
  }

  /*package*/ void impactHeavy() {
    perform(impactHeavyIntervals, impactHeavyAmplitudes, impactHeavyOldIntervals);
  }

  /*package*/ void impactLight() {
    perform(impactLightIntervals, impactLightAmplitudes, impactLightOldIntervals);
  }

  /*package*/ void selection() {
    perform(selectionIntervals, selectionAmplitudes, selectionOldIntervals);
  }

}