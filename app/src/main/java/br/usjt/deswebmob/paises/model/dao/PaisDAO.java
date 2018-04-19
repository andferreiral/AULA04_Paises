package br.usjt.deswebmob.paises.model.dao;

import java.io.IOException;

import br.usjt.deswebmob.paises.model.entity.Pais;
import br.usjt.deswebmob.paises.model.entity.Regiao;

/**
 * Created by andrey on 17/04/18.
 */

public interface PaisDAO {
    Pais[] buscarPaises(Regiao regiao) throws IOException;
}
