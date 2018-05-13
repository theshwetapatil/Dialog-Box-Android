// DialogBoxActivity.java : Defines the entry point for the android application.
// Android: Dialogue Box
// Author: Shweta Patil
// Copyright: Shweta Patil © 2018
package com.dialog;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

public class DialogBoxExampleActivity extends Activity implements android.view.View.OnClickListener {
	Button sd;
	Button tbd;
	Button lbd;
	String color[]={"Blue","Green","Red","Yellow","Black","White","Purple"};
	LinearLayout lout;
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        sd=(Button)findViewById(R.id.b1);
        sd.setOnClickListener(this);
        tbd=(Button)findViewById(R.id.b2);
        tbd.setOnClickListener(this);
        lbd=(Button)findViewById(R.id.b3);
        lbd.setOnClickListener(this);
        lout=(LinearLayout)findViewById(R.id.lout);
    
    }
    
	public void onClick(View v)
    {
    	AlertDialog.Builder ob;
    	
    	switch(v.getId())
    	{
        	case R.id.b1:	
        					ob=new AlertDialog.Builder(this);
			        		ob.setTitle("Simple Dialog Box");
			        		ob.setMessage("This is the example of Dialog Box");
			        		ob.setPositiveButton("OK", new DialogInterface.OnClickListener() {
								public void onClick(DialogInterface dialog, int which) {
									Toast.makeText(getApplicationContext(), "You have clicked on OK button", 7000).show();
								}
							});
			        		ob.show();
			        		break;
    		
    		case R.id.b2:
		            		ob=new AlertDialog.Builder(this);
		            		ob.setTitle("Two Button Dialog Box");
		            		ob.setMessage("This is the example of Two Button Dialog Box");
		            		ob.setPositiveButton("OK", new DialogInterface.OnClickListener() {
		    					public void onClick(DialogInterface dialog, int which) {
		    						Toast.makeText(getApplicationContext(), "You have clicked on OK button of Two Button Dialog Box", 7000).show();
		    					}
		            		
		    				});
		            		ob.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
		    					public void onClick(DialogInterface dialog, int which) {
		    						Toast.makeText(getApplicationContext(), "You have clicked on Cancel Button", 7000).show();	
		    					}
		    				});
		            		ob.show();
		            		break;
        		
        	case R.id.b3:
			        		ob=new AlertDialog.Builder(this);
			        		ob.setTitle("List Dialog Box");
			        		ob.setItems(color,new DialogInterface.OnClickListener() {
								public void onClick(DialogInterface dialog, int which) {
									Toast.makeText(getApplicationContext(), "You have selected"+color[which]+" color.", 7000).show();
									//to set background according to the color
									switch(which)
									{
										case 0:
										lout.setBackgroundColor(Color.BLUE);
										break;
										case 1:
											lout.setBackgroundColor(Color.GREEN);
											break;
										case 2:
											lout.setBackgroundColor(Color.RED);
											break;
										case 3:
											lout.setBackgroundColor(Color.YELLOW);
											break;
										case 4:
											lout.setBackgroundColor(Color.BLACK);
											break;
										case 5:
											lout.setBackgroundColor(Color.WHITE);
											break;
										case 6:
											lout.setBackgroundColor(Color.rgb(100,0,115));
											break;
									}	
								}
							});
			        		ob.setPositiveButton("OK", new DialogInterface.OnClickListener() {
								public void onClick(DialogInterface dialog, int which) {
									Toast.makeText(getApplicationContext(), "You have clicked on OK button of List Dialog Box", 7000).show();
								}
			        		});
			        		ob.show();
    	}	 	
    }
}
        