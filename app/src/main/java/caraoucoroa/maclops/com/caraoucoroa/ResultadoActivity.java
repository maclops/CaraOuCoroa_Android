package caraoucoroa.maclops.com.caraoucoroa;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class ResultadoActivity extends AppCompatActivity {

    private Button buttonVoltar;
    private ImageView imageResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);

        buttonVoltar = findViewById(R.id.buttonVoltar);
        imageResultado = findViewById(R.id.imageResultado);

        // recuperando dados
        Bundle dados = getIntent().getExtras();
        int numero = dados.getInt("numero");

        if (numero==0) {
            imageResultado.setImageResource(R.drawable.moeda_cara);
            Toast.makeText(this,"Caiu cara", Toast.LENGTH_SHORT).show();
        } else {
            imageResultado.setImageResource(R.drawable.moeda_coroa);
            Toast.makeText(this, "Caiu coroa", Toast.LENGTH_SHORT).show();
        }
        // evento de voltar para mainActivity ao clicar no botão
        buttonVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

    }
}
