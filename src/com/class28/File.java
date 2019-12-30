package com.class28;

public abstract class File {
	public abstract void open();
	
	public void Edit() {
		System.out.println("File editing");
	}
	public void Close() {
		System.out.println("File closing");
	}
}
	
class JavaFile extends File{
	public void open() {
		System.out.println("File open using Sublime");
	
}
class WordFile extends File{
	public void open() {
		System.out.println("Open Word File using Word");
	}
}
class PDFFile extends File{
	public void open() {
		System.out.println("Open pdf file using Adobe");
	}
}
	
		
	

}
