package com.company.structural.proxy;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by albertopalomarrobledo on 4/8/19.
 */
public class ProxyInternet implements Internet {

    private Internet internet = new AccessToInternet();
    private static List<String> bannedUrl;

    static {
        bannedUrl = new ArrayList<>();
        bannedUrl.add("twitter.com");
        bannedUrl.add("facebook.com");
        bannedUrl.add("google.com");
    }

    @Override
    public void connectTo(String url) throws Exception {
        if(bannedUrl.contains(url)){
            throw new Exception("URL bloqueada - Acceso Denegado - Consulta con tu administrador");
        }
        internet.connectTo(url);
    }
}
