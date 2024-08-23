package factory;

import factory.components.Button.Button;

public abstract class Platform {
    public void setRefreshRate(){
        System.out.println("Refresh rate");
    }

    public void doSomething(){
        System.out.println("do something");
    }

    public static Platform createPlatform(String platformName){
       return PlatformFactory.createPlatformByName(platformName);
    }

//    public Button createButton(){
////        if(this is an instance of Android){
////            create androidButton
////        }
//    }

    abstract UIComponentFactory createUIComponentFactory();
}
