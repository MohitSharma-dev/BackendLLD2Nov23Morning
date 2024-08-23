package factory;

import factory.components.Button.Button;
import factory.components.Button.IOSButton;
import factory.components.Dropdown.Dropdown;
import factory.components.Dropdown.IOSDropdown;
import factory.components.Menu.IOSMenu;
import factory.components.Menu.Menu;

public class IOSUIComponentFactory implements UIComponentFactory {
    @Override
    public Dropdown createDropdown() {
        return new IOSDropdown();
    }

    @Override
    public Button createButton() {
        return new IOSButton();
    }

    @Override
    public Menu createMenu() {
        return new IOSMenu();
    }
}
