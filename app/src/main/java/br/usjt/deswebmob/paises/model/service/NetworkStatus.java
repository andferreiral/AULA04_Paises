package br.usjt.deswebmob.paises.model.service;

import android.content.Context;
import android.net.ConnectivityManager;
/**
 * Created by andrey on 17/04/18.
 */

public class NetworkStatus {

    public static boolean isConnected(Context context){
        ConnectivityManager connectivityManager = (ConnectivityManager)
                context.getSystemService(Context.CONNECTIVITY_SERVICE);
        return connectivityManager.getActiveNetworkInfo() != null &&
                connectivityManager.getActiveNetworkInfo().isConnected();
    }
}
