package br.itaca.sncrono3;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {
    ImageView iv;
    VideoView vv;
    static boolean troca = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        iv = findViewById(R.id.imageView);
        vv = findViewById(R.id.videoView);
    }
    public void onClickNaImagem(View v){
        if(troca) {
            iv.setImageResource(R.drawable.estudante);
            iv.setContentDescription("Uma imagem com o ícone de ESTUDANTE.");
        }else{
            iv.setImageResource(R.drawable.servidor);
            iv.setContentDescription("Uma imagem com o ícone de SERVIDOR.");
        }
        troca = !troca;
    }

    public void onClickReproduzir(View v){
        String path = "android.resource://" +
                getPackageName() +
                System.getProperty("file.separator") +
                R.raw.video;
        vv.setVideoURI(Uri.parse(path));
        vv.start();
    }
}