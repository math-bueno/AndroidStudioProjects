package br.usjt.desvwebmob.meuprimeiroappccp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class DisplayMessageActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);
        Intent intent = getIntent();
        String mensagem= intent.getStringExtra(MainActivity.MENSAGEM);

    }
}
