import java.util.*;

public abstract class GeometricObject{
	
	//Variables
	private String fillColor;
	private String borderColor;
	
	public GeometricObject(){
		fillColor="white";
		borderColor="black";
	}
	
	public GeometricObject(String fillColor,String borderColor){
		this.fillColor=	fillColor;
		this.borderColor=borderColor;
	}
	
	//Setter Method
	public void setFillColour(String fillColor){
		this.fillColor=	fillColor;
	}
	
	public void setBorderColour(String borderColor){
		this.borderColor=borderColor;
	}
	
	//Getter Method to return the values
	public String getFillColour(){
		return fillColor;
	}
	
	public String getBorderColour(){
		return borderColor;
	}
	
	//Two Abstract Method
	public abstract double findArea();
	public abstract double findCircumference();
}


//Sub-class of GeometricObject
class Triangle extends GeometricObject{
	private double A;
	private double B;
	private double C;
	
	public Triangle(){
		A=0.0;
		B=0.0;
		C=0.0;
	}
	
	public Triangle(double a,double b,double c){
		A=a;
		B=b;
		C=c;
	}
	
	public void setA(double a){
		A=a;
	}
	public void setB(double b){
		B=b;
	}
	public void setC(double c){
		C=c;
	}
	
	public double getA(){
		return A;
	}
	public double getB(){
		return B;
	}
	public double setC(){
		return C;
	}
	
	//Calculating area of triangle
	public double findArea(){
		if((A+B>C)&&(B+C)>A&&(A+C)>B){
			double S = (A + B + C) / 2;
        	return Math.sqrt(S * (S - A) * (S - B) * (S - C));
		}
		return 0;
	}
	
	//Calculating circumference of the triangle
	public double findCircumference(){
		if((A+B>C)&&(B+C)>A&&(A+C)>B){
		return A+B+C;
		}
		return 0;
	}
}


class Driver1{
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println ("Enter three sides of triangle : ");
		double a=sc.nextDouble();
		double b=sc.nextDouble();
		double c=sc.nextDouble();
		
		Triangle T=new Triangle(a,b,c);
		System.out.println ("Area of the Trianlge : "+T.findArea());
		System.out.println ("Circumference of the Trianlge= "+T.findCircumference());
}
}