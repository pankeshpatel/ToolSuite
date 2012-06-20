package fr.inria.arles.pankesh.gen;



public class $struct.name$ {    
    $struct.allStructFields:{field |
	private $field.type$ $field.name; format="avoidCapital"$;  
	public $field.type$ get$field.name; format="capital"$() {
        return $field.name; format="avoidCapital"$;
    }    
    public void set$field.name; format="capital"$($field.type$ newValue) {
        this.$field.name; format="avoidCapital"$ = newValue;
    }			
}$
   $if(struct.fields)$  
	public $struct.name$ ($struct.fields:{field | $field.type$ $field.name; format="avoidCapital"$}; separator=", "$) 
	{ 
	$struct.fields:{field | 
	this.$field.name; format="avoidCapital"$ = $field.name; format="avoidCapital"$;}$
    }
$endif$

}

