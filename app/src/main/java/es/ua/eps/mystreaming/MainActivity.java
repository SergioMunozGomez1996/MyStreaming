package es.ua.eps.mystreaming;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextInputEditText usuario = findViewById(R.id.usuario);
        final TextInputEditText password = findViewById(R.id.password);
        final TextInputEditText servidor = findViewById(R.id.servidor);
        final TextInputEditText puerto = findViewById(R.id.puerto);
        Button button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,StreamingActivity.class);
                intent.putExtra("usuario",usuario.getText().toString());
                intent.putExtra("password", password.getText().toString());
                intent.putExtra("servidor", servidor.getText().toString());
                intent.putExtra("puerto", puerto.getText().toString());
                startActivity(intent);
            }
        });

    }
}