package itxiang_85;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressDemo {
	public static void main(String[] args) throws UnknownHostException {
//		InetAddress address = InetAddress.getByName("DESKTOP-RCRJMI");

		InetAddress address = InetAddress.getByName("172.20.10.3");

		String hostName = address.getHostName();

		String ip = address.getHostAddress();

		System.out.println("主機名:" + hostName);
		System.out.println("ip地址:" + ip);
	}
}
