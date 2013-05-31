package cgu.edu.ist380.tutorial3;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity {

	private EditText mNameText;
    private EditText mEmailText;
    private EditText mAgeText;
	
	
   /** Called when the activity is first created. */
   @Override
   public void onCreate(Bundle savedInstanceState) {
       super.onCreate(savedInstanceState);
       setContentView(R.layout.activity_main);
       
       
       mNameText = (EditText) findViewById(R.id.myname);
       mEmailText = (EditText) findViewById(R.id.myemail);
       mAgeText = (EditText) findViewById(R.id.myage);
       
       Button mainNext = (Button) findViewById(R.id.Agedisplay);
       
       mainNext.setOnClickListener(new OnClickListener() {
           public void onClick(View v) {
           	String name1 = mNameText.getText().toString();
           	String email1 = mEmailText.getText().toString();
           	String age1 = mAgeText.getText().toString();
          	
               Intent i = new Intent();
               i.setClassName("cgu.edu.ist380.tutorial3", "cgu.edu.ist380.tutorial3.Display");
               i.putExtra("Age", age1);
               i.putExtra("Email",email1);
               i.putExtra("Name", name1);
               
               startActivity(i);
               
            
           }
       });
       
           	
   }    


	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
