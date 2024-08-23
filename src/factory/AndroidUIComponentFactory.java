package factory;

import factory.components.Button.AndroidButton;
import factory.components.Button.Button;
import factory.components.Dropdown.AndriodDropdown;
import factory.components.Dropdown.Dropdown;
import factory.components.Menu.AndroidMenu;
import factory.components.Menu.Menu;

public class AndroidUIComponentFactory implements UIComponentFactory {
    @Override
    public Menu createMenu() {
        return new AndroidMenu();
    }

    @Override
    public Button createButton() {
        return new AndroidButton();
    }

    @Override
    public Dropdown createDropdown() {
        return new AndriodDropdown();
    }
}
