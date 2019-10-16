package avd.itics.tesoem.edu.p4diego;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class RecibeParametrosActivity extends AppCompatActivity {

    TextView vnombre;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recibe_parametros);

        vnombre = (TextView) findViewById(R.id.lblnombre);

        Bundle parametros = getIntent().getExtras();

        vnombre.setText("Bienvenido Perro " + parametros.getString("nombre"));
    }
}
