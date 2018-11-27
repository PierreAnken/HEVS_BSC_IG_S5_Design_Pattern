package TemplateMethodAndComposite_1.leaf;

import TemplateMethodAndComposite_1.component.Component;
import java.util.ArrayList;

public class Leaf extends Component {

    private String name;

    public Leaf(String n) {
        name = n;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Leaf " + name;
    }

    @Override
    public ArrayList<Component> getChildren() {
        return new ArrayList<Component>();
    }
}
