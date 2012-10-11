package com.yocanto;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class YoCantoActivity extends Activity {

	protected ArrayAdapter<String> mAdapterQue;
	protected ArrayAdapter<String> mAdapterQuien;
	
	String cantos[] = {
			"Bendita eres tú María", 
			"Benedictus",
			"Zaqueo",
			"Eres Hermoso"
	};
    String cantores[] = {
    		"Fulano",
    		"Mengano",
    		"Perensejo",
    		"Kiko Argüello"
    };
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yo_canto);
        
        
        Spinner spEntradaQue = (Spinner) findViewById(R.id.spinner1);
        Spinner spEntradaQuien = (Spinner) findViewById(R.id.spinner2);
        Spinner spGloriaQue = (Spinner) findViewById(R.id.spinner3);
        Spinner spGloriaQuien = (Spinner) findViewById(R.id.spinner4);
        
        
        this.mAdapterQue = new ArrayAdapter<String>(this, 
        		android.R.layout.simple_spinner_dropdown_item, cantos);
        
        spEntradaQue.setAdapter(mAdapterQue);
        spEntradaQue.setOnItemSelectedListener(spEntradaQueListener);
        
        this.mAdapterQuien = new ArrayAdapter<String>(this, 
        		android.R.layout.simple_spinner_dropdown_item, cantores);
        
        spEntradaQuien.setAdapter(mAdapterQuien);
        
        
    }
    
    OnItemSelectedListener spEntradaQueListener = new OnItemSelectedListener() {

		public void onItemSelected(AdapterView<?> arg0, View arg1, int arg2,
				long arg3) {
			// TODO Auto-generated method stub
			
		}

		public void onNothingSelected(AdapterView<?> arg0) {
			// TODO Auto-generated method stub
			
		}
	}; {
    	
	};

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_yo_canto, menu);
        return true;
    }

    
}
