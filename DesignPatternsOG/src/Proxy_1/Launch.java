package Proxy_1;

import Proxy_1.client.User;
import Proxy_1.proxy.ProxyNavigation;
import Proxy_1.subject.Navigation;

import java.io.IOException;
import java.net.URISyntaxException;

public class Launch {

	public static void main(String[] args) throws IOException, URISyntaxException {

		String url1 = "https://intranet.hevs.ch";
		String url2 = "https://www.nzz.ch/";
		
		User admin = new User(true);
		User student = new User(false);
		
		Navigation proxyNavigation = new ProxyNavigation();
		
		proxyNavigation.navigate(admin, url1);
		proxyNavigation.navigate(student, url1);

		proxyNavigation.navigate(admin, url2);
		proxyNavigation.navigate(student, url2);
	}

}
