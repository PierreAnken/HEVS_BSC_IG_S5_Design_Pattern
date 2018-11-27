package TemplateMethodAndComposite_1.algorithms;

import TemplateMethodAndComposite_1.component.Component;

import java.util.ArrayList;

public class DFSSearch extends TraversalAlgoritm {

    //Overrided method (q = s+q).
    protected void addSuccessors(ArrayList<Component> q, ArrayList<Component> s) {
        q.addAll(0, s);
    }
}
