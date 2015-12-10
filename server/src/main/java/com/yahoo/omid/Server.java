package com.yahoo.omid;

/**
 * @author katkovi@
 */
public class Server {

    public static void main(String[] args) {
        Server server = new Server();

    }

    public void sendReq(){
        Client client = new SimpleClient();
        System.out.println("client.get() = " + client.get());
    }

}
