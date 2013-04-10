
package $GUIdriver.deviceImplPackageName$;

import logic.*;
import framework.*;

import android.app.Dialog;
import android.content.Context;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.*;

import com.example.androidguibutton.R;

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
	
		Button $command.widget.button$;
		EditText $command.widget.textbox$;
		

	};separator="\n"$
			
	$GUIdriver.reqWidgets:{ reqWidget | 
		
		EditText $reqWidget.textbox$ ;
		Button $reqWidget.button$;
		TextView $reqWidget.textview$;
		
	
	};separator="\n"$ 
    
	public void onCreate(Bundle savedInstanceState) {
		setContentView(R.layout.$GUIdriver.name$_layout);
		super.onCreate(savedInstanceState);

		$GUIdriver.allActions:{ action | 
		
			$action.control$ = (TextView) findViewById(R.id.$action.control$View);
		
		};separator="\n"$ 
		
		$GUIdriver.commands:{ command |
			$command.widget.textbox$ = (EditText)findViewById(R.id.$command.widget.textbox$View);
			$command.widget.button$ = (Button) findViewById(R.id.$command.widget.button$View);

			$command.widget.button$.setOnClickListener(new View.OnClickListener() {
				public void onClick(View v) {

					$command.name$GUI();
				}
			});
		
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
			fn.$command.name; format="capital"$FromGUI($command.widget.textbox$.getText().toString());
		}
	
	}; separator="\n"$
			
}