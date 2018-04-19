package br.usjt.deswebmob.paises.model.service;

import java.io.IOException;

import br.usjt.deswebmob.paises.model.dao.PaisDAO;
import br.usjt.deswebmob.paises.model.dao.PaisDAOFactory;
import br.usjt.deswebmob.paises.model.entity.Pais;
import br.usjt.deswebmob.paises.model.entity.Regiao;

/**
 * Created by andrey on 17/04/18.
 */

public class PaisService {
    PaisDAO dao;

    public PaisService(boolean onLine){
        dao = PaisDAOFactory.getPaisDAO(onLine);
    }
    public Pais[] buscarPaises(Regiao regiao) throws IOException{
        return dao.buscarPaises(regiao);
    }
}
