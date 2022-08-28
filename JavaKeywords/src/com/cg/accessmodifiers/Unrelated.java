package com.cg.accessmodifiers;

public class Unrelated {
	Unrelated()
	{
		Base obj = new Base();
		obj.var_default = 10;
		obj.var_protected = 20;
		obj.var_public=30;
		
		obj.method_default();
		obj.method_protected();
		obj.method_public();
}
}
