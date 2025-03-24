package com.example.aula08_frasedodia;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
    }

    public void  gerarFrase(View view){

       TextView exibirFrase = findViewById(R.id.idFraseGerada);

        String [] frase = {
                "Tenha um ótimo dia!",
                "Deus abençoe sua familia",
                "Tenha um otimo ano",
                "Feliz ano novo"
        };

        Random random = new Random();
        exibirFrase.setText(frase[random.nextInt(4)]);
    }
}