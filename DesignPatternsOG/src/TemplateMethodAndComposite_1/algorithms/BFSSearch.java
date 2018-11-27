package TemplateMethodAndComposite_1.algorithms;

import TemplateMethodAndComposite_1.component.Component;

import java.util.ArrayList;

public class BFSSearch extends TraversalAlgoritm {
	
	//Overrided method (q = q+s).
	protected void addSuccessors(ArrayList<Component> q, ArrayList<Component> s)
	{
            q.addAll(s);
	}		
}
