package dev.lucasliet.activityintentfilter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void enviarMensagem(View view) {
        EditText mensagemEditText = findViewById(R.id.mensagemEditText);
        String mensagem = mensagemEditText.getEditableText().toString();

        Intent enviarMensageIntent = new Intent();
        enviarMensageIntent.setAction(Intent.ACTION_SEND);
        enviarMensageIntent.setType("text/plain");
        enviarMensageIntent.putExtra(Intent.EXTRA_TEXT, mensagem);
        enviarMensageIntent = Intent.createChooser(enviarMensageIntent, null);

        startActivity(enviarMensageIntent);
    }
}