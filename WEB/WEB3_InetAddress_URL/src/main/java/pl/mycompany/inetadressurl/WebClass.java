package pl.mycompany.inetadressurl;

import java.net.InetAddress;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Arrays;

public class WebClass {
    public static void main(String[] args) throws UnknownHostException, MalformedURLException {

        System.out.println("--------------- InetAddress ----------------");

        InetAddress address = InetAddress.getLocalHost();
        System.out.println("Read local host IP: " + address);

        address = InetAddress.getByName("onet.pl");
        System.out.println("Read IP address of onet.pl by name: " + address);

        InetAddress googleAddresses[] = InetAddress.getAllByName("google.com");

        System.out.println("Read all google.com IPs numbers:");

        for (int i = 0; i < googleAddresses.length; i++) {
            System.out.println(googleAddresses[i]);
        }

        InetAddress amazonAddresses[] = InetAddress.getAllByName("amazon.com");
        ArrayList<InetAddress> amazonList = new ArrayList<>(Arrays.asList(amazonAddresses));

        System.out.println("Read all amazon.com IPs numbers:");
        for (InetAddress ia : amazonList) {
            System.out.println(ia);
        }


        System.out.println("-------------------- URL --------------------");

        URL url = new URL("https://sportowefakty.wp.pl/pilka-nozna/823886/gole-lewandowskiego-daly-bayernowi-monachium-puchar-niemiec");

        System.out.println("Protocol: " + url.getProtocol());
        System.out.println("Computer: " + url.getHost());
        System.out.println("Port: " + url.getPort());
        System.out.println("File: " + url.getFile());
        System.out.println("Full address: " + url.toExternalForm());





    }
}
