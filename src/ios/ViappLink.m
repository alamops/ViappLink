#import "ViappLink.h"

@implementation ViappLink

- (void) execute:(CDVInvokedUrlCommand*)command   {
    [[UIApplication sharedApplication] openURL:[NSURL
                                                    URLWithString:@"http://itunes.apple.com/br/app/id563925834"]];
}

@end
