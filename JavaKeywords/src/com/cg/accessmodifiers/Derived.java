package com.cg.accessmodifiers;

public class Derived extends Base{

	Derived(){
		var_default = 10;
		var_public = 20;
		var_protected = 40;
		
		method_default();
		method_public();
		method_protected();
}
}
