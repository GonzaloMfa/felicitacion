package com.example.felicitacioncumpleanos;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Typeface;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
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
        /**
         * Seteamos las animaciones a los componentes de nuestra app
         */
        Animation animacion = AnimationUtils.loadAnimation(this, R.anim.animacion);
        // accedemos a las cajas de texto
        TextView titulo = (TextView)findViewById(R.id.titulo);
        TextView text2 = (TextView)findViewById(R.id.textView2);
        titulo.startAnimation(animacion);

        Animation slideUp = AnimationUtils.loadAnimation(this, R.anim.slideup);
        // iniciamos las animaciones con las cajas de texto
        text.startAnimation(slideUp);
        text2.startAnimation(slideUp);

        //utilizamos el media player para el reproductor de musica
        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.happybirthday);
        //inicializamos el el reproductor
        mediaPlayer.start();
    }
}
