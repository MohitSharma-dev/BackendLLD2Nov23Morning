package factory;

public class Android extends Platform{
    @Override
    UIComponentFactory createUIComponentFactory() {
        return new AndroidUIComponentFactory();
    }
}
