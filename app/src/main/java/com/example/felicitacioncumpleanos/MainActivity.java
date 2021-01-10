package com.example.felicitacioncumpleanos;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Typeface;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // clase para cambiar la fuenete
        Typeface mifuente = Typeface.createFromAsset(getAssets(), "Beauty and the Beast Sample.ttf");
        /**
         * como la referencia que queremos guardar es de tipo text view para la fuente
         * creamos -> una referencia de tipo textview
         */
        TextView text = (TextView) findViewById(R.id.textView);
        // pasamos la fuente que habíamos creado antes
        text.setTypeface(mifuente);
        //utilizamos el media player para el reproductor de musica
        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.happybirthday);
        //inicializamos el el reproductor
        mediaPlayer.start();
    }
}