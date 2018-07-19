
#import "RNHaptics.h"

@implementation RNHaptics

- (dispatch_queue_t)methodQueue
{
    return dispatch_get_main_queue();
}
RCT_EXPORT_MODULE()


RCT_EXPORT_METHOD(tada)
{
    int a = 2;
    // no-op
}

@end
  
