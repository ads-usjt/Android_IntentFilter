package dev.lucasliet.activityintentfilter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

public class TrataMensagemActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trata_mensagem);
        Intent origemIntent = getIntent();
        String mensagem = origemIntent.getStringExtra(Intent.EXTRA_TEXT);
        Toast.makeText(this, mensagem, Toast.LENGTH_SHORT).show();
    }
}