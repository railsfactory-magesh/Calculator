package calculator.mag;

import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnKeyListener;
import android.widget.Button;
import android.widget.EditText;

public class CalculatorActivity extends Activity {
    /** Called when the activity is first created. */



	@Override
    
        public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        // final double num = 0;
        // final double memNum = 0;
        // final int operator = 1;
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
        
		
        
        equals.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
       
            }
        });
        
        btn1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
           
            }
        });
        
        btn2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
               
            }
        });
        
        btn3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                
            }
        });
        
        btn4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                
            }
        });
        
        btn5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                
            }
        });
        
        btn6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                
            }
        });
        
        btn7.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                
            }
        });
        
        btn8.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                
            }
        });
        
        btn9.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                
            }
        });
        
        btn0.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                
            }
        });
        
        plus.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                
            }
        });
        
        minus.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                
            }
        });
        
        mul.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                
            }
        });
        
        div.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                
            }
        });
        
        
        
        tf.setOnKeyListener(new OnKeyListener() {
            public boolean onKey(View v, int keyCode, KeyEvent e) {
                // If the event is a key-down event on the "enter" button
                if ((e.getAction() == KeyEvent.ACTION_DOWN)) {
                  // Perform action on key press
                	 keyCode = e.getKeyCode();
                	 //tf.append("["+Integer.toString(keyCode)+"]");
                	 
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
                      handleEquals(1);
                      break;

                     case KeyEvent.KEYCODE_EQUALS:
                      handleEquals(0);
                      break;

                     case KeyEvent.KEYCODE_MINUS:
                      handleEquals(2);
                      break;


                     case KeyEvent.KEYCODE_C:
                      reset();
                      break;

                     case KeyEvent.KEYCODE_SLASH:
                      handleEquals(4);
                      break;

                     case KeyEvent.KEYCODE_DPAD_DOWN:
                	 }
                                          
                  return true;
                }
                return false;
            }

        
                        
			private void reset() {
				// TODO Auto-generated method stub
				
			}

			private void handleEquals(int i) {
				// TODO Auto-generated method stub
				
			}

			public void handleNumber(int i) {
				
				//Toast.makeText(CalculatorActivity.this, i, Toast.LENGTH_SHORT).show();
				String num = new Integer(i).toString();
				tf.append(num);
			}
        });
        
        
    }
 
        
}