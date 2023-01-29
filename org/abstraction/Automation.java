package org.abstraction;

public class Automation extends MultipleLangauge implements Language, TestTool {

	public void Selenium() {
		System.out.println("Selenium");

	}

	public void Java() {
		System.out.println("Java");

	}

	@Override
	public void ruby() {
		System.out.println("Ruby");
	}

	public static void main(String[] args) 
	{
		Automation Lang = new Automation();
		Lang.Selenium();
		Lang.Java();
		Lang.ruby();
	}

}
