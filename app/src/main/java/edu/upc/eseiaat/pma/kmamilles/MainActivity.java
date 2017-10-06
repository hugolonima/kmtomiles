package edu.upc.eseiaat.pma.kmamilles;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button_km = (Button) findViewById(R.id.btn_to_km);
        Button button_miles = (Button) findViewById(R.id.btn_to_miles);
        final EditText text_km = (EditText) findViewById(R.id.km_text);
        final EditText text_miles = (EditText) findViewById(R.id.miles_text);



        //Código para que los botones al ser pulsados hagan la conversión y se
        //actualice en las cajas de texto correspondientes
        button_km.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               String smilles = text_miles.getText().toString();
                float milles = Float.parseFloat(smilles);
                float km = milles * 1.609f;
                String skm = String.format("%f", km);
                text_km.setText(skm);
            }
        });
        button_miles.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String skm = text_km.getText().toString();
                float km = Float.parseFloat(skm);
                float miles = km / 1.609f;
                String smiles = String.format("%f", miles);
                text_miles.setText(smiles);
            }
        });
    }
}
