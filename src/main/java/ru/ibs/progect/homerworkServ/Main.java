package ru.ibs.progect.homerworkServ;


import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletHandler;
import org.eclipse.jetty.webapp.WebAppContext;
import ru.ibs.progect.homerworkServ.servlets.GreetingsServlet;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("Start main class");
        Server server = new Server(8099);

//        final String webAppPath = Main.class.getProtectionDomain().getCodeSource().getLocation().getPath();
//        WebAppContext webapp = new WebAppContext(webAppPath,"/");

        ServletHandler webapp = new ServletHandler();
        webapp.addServletWithMapping(GreetingsServlet.class,"/");
        server.setHandler(webapp);


        server.start();
        System.out.println("OK: server started");

    }
}