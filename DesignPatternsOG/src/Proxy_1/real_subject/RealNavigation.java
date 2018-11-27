package Proxy_1.real_subject;

import Proxy_1.subject.Navigation;
import Proxy_1.client.User;
import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class RealNavigation implements Navigation {

	@Override
	public void navigate(User user, String url) throws IOException, URISyntaxException {
		
		Desktop d = Desktop.getDesktop();
		
		d.browse(new URI(url));
	}

}
