package br.usjt.deswebmob.paises;

import android.content.Context;

/**
 * Created by andrey on 17/04/18.
 */

public class Contexto {
    private static Context contexto;

    public static Context getValue(){
        return contexto;
    }

    public static void setValue(Context c){
        contexto = c;
    }
}
