package ec.edu.tecnologicoloja.ventanas;

import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btnAdivinar;
    EditText textColor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnAdivinar = (Button) findViewById(R.id.button);
        textColor = (EditText) findViewById(R.id.textColor);
    }
    public void clickbtn (View v){
        //Toast.makeText(getApplicationContext(),"Esto es una prueba",Toast.LENGTH_LONG).show();
        Intent intent = new Intent(MainActivity.this, MainActivity2.class);

        intent.putExtra("color", textColor.getText());

        startActivity(intent);
    }
}