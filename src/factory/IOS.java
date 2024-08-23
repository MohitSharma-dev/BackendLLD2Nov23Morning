package factory;

public class IOS extends Platform{
    @Override
    UIComponentFactory createUIComponentFactory() {
        return new IOSUIComponentFactory();
    }
}
