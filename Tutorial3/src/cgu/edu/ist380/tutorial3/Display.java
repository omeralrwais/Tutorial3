package cgu.edu.ist380.tutorial3;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.widget.TextView;

public class Display extends Activity{
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.display); {
      	
        	Intent i = getIntent();
            Bundle b = i.getExtras();
            String ageText = b.getString("Age");
         
            TextView title = (TextView) findViewById(R.id.age);
            title.setText("my age is: " + ageText);  
       
        }
    }
    

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}


}
