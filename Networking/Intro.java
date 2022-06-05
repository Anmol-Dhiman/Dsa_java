package Networking;

import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;

public class Intro {

    // java.net. is the seperate package which contains different classes whcih help
    // in making the API requet making hte network calls any all the other things
    // related to the network
 
 
    // here the address things are related to the computer networking 
 
    public static void main(String[] args) {

        String url = "www.youtube.com";
        try {
            InetAddress address = Inet4Address.getByName(url);
            System.out.println(address.getHostAddress());
            System.out.println(Arrays.toString(address.getAddress()));

        } catch (UnknownHostException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
}
