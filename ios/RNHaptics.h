#import <React/RCTBridgeModule.h>
#import <React/RCTConvert.h>
#import <UIKit/UIKit.h>

#if !TARGET_OS_TV
@interface RCTConvert (UINotificationFeedback)

+ (UINotificationFeedbackType)UINotificationFeedbackType:(id)json;

@end

@interface RCTConvert (UIImpactFeedback)

+ (UIImpactFeedbackStyle)UIImpactFeedbackStyle:(id)json;

@end

#endif



@interface RNHaptics : NSObject <RCTBridgeModule>

@end
  
