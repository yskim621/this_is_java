package chap07.sec02.exam01_inheritance;

public class DmbCellPhone extends CellPhone{
	int channel;
	
	DmbCellPhone(String model, String color, int channel){
		this.model = model;
		this.color = color;
		this.channel = channel; 
	}
}
