package Proxy_1.subject;

import Proxy_1.client.User;
import java.io.IOException;
import java.net.URISyntaxException;

public interface Navigation {
	void navigate(User user, String url) throws IOException, URISyntaxException;
}






