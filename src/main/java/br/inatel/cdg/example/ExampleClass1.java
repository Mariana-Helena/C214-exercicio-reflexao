package br.inatel.cdg.example;

import br.inatel.cdg.annotation.reading.NumberToSum;

//Você deverá criar a @NumberToSum como parte da solução
public class ExampleClass1 {

	@NumberToSum(param1 = 1)
	private int field1;
	
	@NumberToSum(param1 = 2)
	private int field2;
	
	@NumberToSum(param1 = 3)
	private int field3;
	
	public void method1() {
		System.out.println("Example Class 1");
	}
	
}