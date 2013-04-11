
package $GUIdriver.deviceImplPackageName$;

import logic.*;
import com.example.$GUIdriver.name$project.R;

import framework.*;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.*;

public class Android$GUIdriver.name$ extends Dialog implements I$GUIdriver.name$ {

	Fake$GUIdriver.name$ fn;

	public Android$GUIdriver.name$(Context context, Fake$GUIdriver.name$ obj) {
		super(context);
		this.fn = (Fake$GUIdriver.name$) obj;
	}

	$GUIdriver.allActions:{ action | 
		
		TextView $action.control$;
	
	};separator="\n"$ 
	
	$GUIdriver.commands:{ command |
	
		$command.widget.textboxs:{ textbox | EditText  $textbox$; };seperator="\n"$
		$command.widget.buttons:{ button | Button $button$; };seperator="\n"$		

	};separator="\n"$
			
	$GUIdriver.reqWidgets:{ reqWidget | 
		
		EditText $reqWidget.textbox$ ;
		Button $reqWidget.button$;
		TextView $reqWidget.textview$;
		
	
	};separator="\n"$ 
    
	public void onCreate(Bundle savedInstanceState) {
		setContentView(R.layout.$GUIdriver.name$layout);
		super.onCreate(savedInstanceState);

		$GUIdriver.allActions:{ action | 
		
			$action.control$ = (TextView) findViewById(R.id.$action.control$View);
		
		};separator="\n"$ 
		
		$GUIdriver.commands:{ command |
			$command.widget.textboxs:{ textbox | $textbox$ = (EditText)findViewById(R.id.$textbox$View);};separator="\n"$
			$command.widget.buttons:{ button | $button$ = (Button) findViewById(R.id.$button$View);};separator="\n"$

			$command.widget.buttons:{ button | $button$.setOnClickListener(new View.OnClickListener() {
				public void onClick(View v) {

					$command.name$GUI();
				}
			});
			};separator="\n"$
		
		};separator="\n"$
				
		$GUIdriver.reqWidgets:{ reqWidget | 

			$reqWidget.textview$ = (EditText)findViewById(R.id.$reqWidget.textview$View);
			$reqWidget.button$ = (Button) findViewById(R.id.$reqWidget.button$View);
			$reqWidget.textview$ = (TextView) findViewById(R.id.$reqWidget.textview$View);
			
			$reqWidget.button$.setOnClickListener(new View.OnClickListener() {
				public void onClick(View v) {

					RequestGUI();
				}
			});
			
		};separator="\n"$

	}
	
	$GUIdriver.allActions:{ action | 
	    
		@Override
		public void $action.name$GUI($action.allParameter:{ param | $param.type.name$ arg }; separator=", "$)
		{
			//text.setText((String)arg.);
	
	    }
	
	}; separator="\n"$

	$GUIdriver.commands:{ command |
			
		@Override
		public void $command.name$GUI() {
		     
			//TempStruct newValue = new TempStruct(100.0, "C");
			fn.$command.name; format="capital"$FromGUI($command.widget.textboxs:{ textbox | $textbox$.getText().toString() }; separator=", "$);
		}
	
	}; separator="\n"$
			
}