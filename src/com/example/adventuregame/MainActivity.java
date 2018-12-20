package com.example.adventuregame;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.MenuItem;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends Activity implements OnClickListener{
	Engine engine;
	TextView anzeige;
	Button b;
	EditText text2;
	

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        anzeige =(TextView) this.findViewById(R.id.textView1);
        anzeige.setText("Ein schönes Programm");
        
        text2=(EditText) this.findViewById(R.id.editText1);
        text2.setText("Juchuuuuu");
        engine = new Engine();
        
        b=(Button)this.findViewById(R.id.button1);
        b.setOnClickListener(this);
        
        
    }

    @Override
    public void onClick(View v){
    	anzeige.setText(engine.groB(text2.getText().toString()));
    	
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
