package Proxy_1.proxy;

import Proxy_1.subject.Navigation;
import Proxy_1.client.User;
import Proxy_1.real_subject.RealNavigation;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.swing.JOptionPane;

public class ProxyNavigation implements Navigation {

	private RealNavigation realNavigation;
	private List<String>listOfRestrictedURL = new ArrayList<String>(Arrays.asList("https://intranet.hevs.ch", 
																				  "https://intranet.technopole.ch/"));
	
	@Override
	public void navigate(User user, String url) throws IOException, URISyntaxException {
		boolean access = controleURL(url);
		
		if(access || user.isAdmin())
		{
			this.realNavigation = new RealNavigation();
			realNavigation.navigate(user, url);
		}
		else
		{
			JOptionPane.showMessageDialog(null, "You do not have access to " + url 
												+ " , please contact the computer science service.");
		}
	}
	private boolean controleURL(String url) {
		return !listOfRestrictedURL.contains(url);
	}

}

