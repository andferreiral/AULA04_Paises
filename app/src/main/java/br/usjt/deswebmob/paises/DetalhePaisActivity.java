package br.usjt.deswebmob.paises;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

/**
 * Created by andrey on 14/03/18.
 */
public class DetalhePaisActivity extends Activity {
    TextView txtPais;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalhe_pais);
        txtPais = findViewById(R.id.txtPais);
        Intent intent = getIntent();

        Pais pais = (Pais) intent.getSerializableExtra(ListaPaisesActivity.PAIS);
        txtPais.setText(pais.toString());
    }
}
