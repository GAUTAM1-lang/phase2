package com.specifier1;

 class Base
 	{
	 void Base()
	 {
		 System.out.println("this is const");
	 }
 	}
 		class Child extends Base
 		{
 			protected void Base()
 			{
 				System.out.println("this is overriding");
 			}
 		}
 		public class AccessModifier2 {
 			public static void main(String[] args) {

 				Child b = new Child(); b.Base();
 			}
}

