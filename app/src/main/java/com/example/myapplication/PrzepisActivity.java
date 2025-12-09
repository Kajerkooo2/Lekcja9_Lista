package com.example.myapplication;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class PrzepisActivity extends AppCompatActivity {

    // PRZENIESIONE NA POZIOM KLASOWY — dzięki temu wywietlPrzepis może z nich korzystać
    private TextView textViewTytul;
    private TextView textViewSkladniki;
    private TextView textViewOpis;
    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_przepis);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        textViewTytul = findViewById(R.id.textViewTytul);
        textViewSkladniki = findViewById(R.id.textViewSkladniki);
        textViewOpis = findViewById(R.id.textViewOpis);
        imageView = findViewById(R.id.imageView);

        int idPrzepisuDoWyswietlenia = getIntent().getIntExtra("ID", 0);
        Przepis przepis = RepozytoriumPrzepisow.zwrocPrzepisoId(idPrzepisuDoWyswietlenia);

        wywietlPrzepis(przepis);
    }

    private void wywietlPrzepis(Przepis przepis){

        textViewTytul.setText(przepis.getNazwaPrzepisu());
        textViewSkladniki.setText(przepis.getSkladniki());
        textViewOpis.setText(przepis.getOpis());
        imageView.setImageResource(przepis.getIdObrazka());
    }
}