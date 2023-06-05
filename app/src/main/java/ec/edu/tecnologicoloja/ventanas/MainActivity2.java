package ec.edu.tecnologicoloja.ventanas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        String colorRec = getIntent().getStringExtra("color");
        Toast.makeText(getApplicationContext(),"color recibido"+colorRec, Toast.LENGTH_LONG).show();
    }
}