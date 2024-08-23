package factory;

import factory.components.Button.Button;
import factory.components.Dropdown.Dropdown;
import factory.components.Menu.Menu;

public interface UIComponentFactory {
    Button createButton();
    Menu createMenu();
    Dropdown createDropdown();
}
