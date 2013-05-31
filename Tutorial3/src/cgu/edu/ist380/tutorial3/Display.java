package cgu.edu.ist380.tutorial3;

import android.app.Activity;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
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
            
            Button mainNext = (Button) findViewById(R.id.back);
            
            mainNext.setOnClickListener(new OnClickListener() {
                public void onClick(View v) {
                
                    Intent i = new Intent();
                    i.setClassName("cgu.edu.ist380.tutorial3", "cgu.edu.ist380.tutorial3.MainActivity");
                    startActivity(i);
                    
             
                }
            });
            
                	
        }    

       
     
    }
    

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}


}
