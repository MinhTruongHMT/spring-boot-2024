//package com.example.demo.congig;
//
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.boot.context.event.ApplicationReadyEvent;
//import org.springframework.context.event.EventListener;
//import org.springframework.stereotype.Component;
//
//import java.awt.*;
//import java.net.URI;
//
//@Component
//public class SwaggerOpenConfig {
//    @Value("${server.port}")
//    private int serverPort;
//
//    @EventListener(ApplicationReadyEvent.class)
//    public void openSwagger() {
//        try {
//            String url = "http://localhost:" + serverPort + "/swagger-ui.html";
//            if (Desktop.isDesktopSupported()) {
//                Desktop.getDesktop().browse(new URI(url));
//            } else {
//                Runtime runtime = Runtime.getRuntime();
//                runtime.exec("rundll32 url.dll,FileProtocolHandler " + url);
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//}
