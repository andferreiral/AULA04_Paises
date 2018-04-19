package br.usjt.deswebmob.paises.model.dao;

import br.usjt.deswebmob.paises.Contexto;

/**
 * Created by andrey on 17/04/18.
 */

public class PaisDAOFactory {

    public static PaisDAO getPaisDAO(boolean onLine){
        if (onLine) {
            return new PaisDAORest();
        } else {
            return new PaisDAODb(Contexto.getValue());
        }
    }
}
