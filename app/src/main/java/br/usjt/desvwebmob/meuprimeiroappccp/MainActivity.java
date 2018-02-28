package br.usjt.desvwebmob.meuprimeiroappccp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {

    public static final String MENSAGEM =" br.usjt.desvwebmob.meuprimeiroappccp.mensagem";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sendMessage(View view) {

      EditText editText = findViewById(R.id.edit_text);
      String mensagem = editText.getText().toString();
      Intent intent = new Intent(this , DisplayMessageActivity.class);
      intent.putExtra(MENSAGEM , mensagem);
      startActivity(intent);
        TextView textView = new TextView(this);
        textView.setTextSize(40);
        textView.setText(mensagem);
        ViewGroup layout = (ViewGroup) findViewById(R.id.activity_display_message);
        layout.addView(textView);

    }
}
