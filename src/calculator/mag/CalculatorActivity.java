package calculator.mag;

import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnKeyListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class CalculatorActivity extends Activity {
    /** Called when the activity is first created. */
	
	 int temp = 0;
     int temp1 = 0;
     int result = 0;
     int operator = 0;

	@Override
    
        public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
         //final String exp = "";
        // final double memNum = 0;
         
        // final boolean readyToClear = false;
        // final boolean hasChanged = false;
        final EditText tf = (EditText) findViewById(R.id.tf);        
        final Button btn1 = (Button) findViewById(R.id.button1);
        final Button btn2 = (Button) findViewById(R.id.button2);
        final Button btn3 = (Button) findViewById(R.id.button3);
        final Button btn4 = (Button) findViewById(R.id.button4);
        final Button btn5 = (Button) findViewById(R.id.button5);
        final Button btn6 = (Button) findViewById(R.id.button6);
        final Button btn7 = (Button) findViewById(R.id.button7);
        final Button btn8 = (Button) findViewById(R.id.button8);
        final Button btn9 = (Button) findViewById(R.id.button9);
        final Button btn0 = (Button) findViewById(R.id.button0);
        final Button plus = (Button) findViewById(R.id.plus);
        final Button minus = (Button) findViewById(R.id.minus);
        final Button mul = (Button) findViewById(R.id.mul);
        final Button div = (Button) findViewById(R.id.div);
        final Button equals = (Button) findViewById(R.id.equal);
        final Button cl = (Button) findViewById(R.id.buttonc);
       
        
        equals.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
            	
            }
        });
        
        btn1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
            	tf.append("1");
            }
        });
        
        btn2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
            	tf.append("2");  
            }
        });
        
        btn3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
            	tf.append("3");   
            }
        });
        
        btn4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
            	tf.append("4");   
            }
        });
        
        btn5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
            	tf.append("5");     
            }
        });
        
        btn6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
            	tf.append("6");     
            }
        });
        
        btn7.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
            	tf.append("7");   
            }
        });
        
        btn8.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
            	tf.append("8");
            }
        });
        
        btn9.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
            	tf.append("9");     
            }
        });
        
        btn0.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
            	tf.append("0");     
            }
        });
        
        plus.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
            	//tf.append("+");
            	temp = Integer.parseInt(tf.getText().toString());
           	 	operator = 1;
           	 	tf.setText("");
            }
        });
        
        minus.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
            	temp = Integer.parseInt(tf.getText().toString());
            	operator = 2;
            	tf.setText("");
            }
        });
        
        mul.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
            	temp = Integer.parseInt(tf.getText().toString());
            	operator = 3;
            	tf.setText("");   
            }
        });
        
        div.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
            	temp = Integer.parseInt(tf.getText().toString());
            	operator = 4;
            	tf.setText("");
            }
        });
        
        cl.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
            	
            	tf.setText("");
            }
        });
        
        equals.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View v) {
				 
              	 temp1 = Integer.parseInt(tf.getText().toString());
              	 
              	switch (operator) {
              	
              	case 1:
              		result = temp + temp1;
              		break;
              		
              	case 2:
              		result = temp - temp1;
              		break;
              		
              	case 3:
              		result = temp * temp1;
              		break;
              		
              	case 4:
              		result = temp / temp1;
              		break;
              		
              	
              	}
              	 //result = temp + temp1;
              	 tf.setText(String.valueOf(result));
              	//Toast.makeText(getApplicationContext(), temp1, Toast.LENGTH_SHORT).show();
				
			}
		});
        
        
        
        
        tf.setOnKeyListener(new OnKeyListener() {
            public boolean onKey(View v, int keyCode, KeyEvent e) {
                // If the event is a key-down event on the "enter" button
                if ((e.getAction() == KeyEvent.ACTION_DOWN)) {
                  // Perform action on key press
                	 keyCode = e.getKeyCode();
                	 //tf.append("["+Integer.toString(keyCode)+"]");
                	 
                	 Object temp1;
					switch (keyCode) {
                     case KeyEvent.KEYCODE_0:
                      handleNumber(0);
                      break;

                     case KeyEvent.KEYCODE_1:
                      handleNumber(1);
                      break;

                     case KeyEvent.KEYCODE_2:
                      handleNumber(2);
                      break;

                     case KeyEvent.KEYCODE_3:
                      handleNumber(3);
                      break;

                     case KeyEvent.KEYCODE_4:
                      handleNumber(4);
                      break;

                     case KeyEvent.KEYCODE_5:
                      handleNumber(5);
                      break;

                     case KeyEvent.KEYCODE_6:
                      handleNumber(6);
                      break;

                     case KeyEvent.KEYCODE_7:
                      handleNumber(7);
                      break;

                     case KeyEvent.KEYCODE_8:
                      handleNumber(8);
                      break;

                     case KeyEvent.KEYCODE_9:
                      handleNumber(9);
                      break;

                     case 43:
                      
                      break;

                     case KeyEvent.KEYCODE_MINUS:
                      tf.append("-");
                      break;
                      
                     case KeyEvent.KEYCODE_PLUS:
                    	 temp = Integer.parseInt(tf.getText().toString());
                    	 int operator = 1;
                    	 tf.setText("0");
                    	 break;
                    	 
                     case KeyEvent.KEYCODE_C:
                      tf.setText(0);
                      break;

                     case KeyEvent.KEYCODE_SLASH:
                      tf.append("/");
                      break;
                      
                     case KeyEvent.KEYCODE_EQUALS:
                         //tf.setText(2+7);
                       	 temp1 = Integer.parseInt("5");
                       	 //int result = temp+temp1;
                       	 //tf.setText(result);
                         break;
                         
                     case KeyEvent.KEYCODE_DPAD_DOWN:
                	 }
                                          
                  return true;
                }
                return false;
            }



			public void handleNumber(int i) {
				
				//Toast.makeText(CalculatorActivity.this, i, Toast.LENGTH_SHORT).show();
				String num = new Integer(i).toString();
				tf.append(num);
			}
        });
        
        
    }

	

	
 
        
}