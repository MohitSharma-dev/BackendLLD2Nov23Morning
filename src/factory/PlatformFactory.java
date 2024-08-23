package factory;

// Simple factory
public class PlatformFactory {
    static Platform createPlatformByName(String platformName){
        if(platformName.equals("Android")) {
            return new Android();
        } else if (platformName.equals("IOS")) {
            return new IOS();
        }
        return null;
    }
}
