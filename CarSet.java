public class CarSet {
    private String color;
    private int horsepower;
    private String engineSize;
    public CarSet(){
    	this.color="black";
    	this.horsepower=500;
    	this.engineSize="regular";
    }
    public CarSet(String color,int horsepower, String engineSize){
    	this.color=color;
    	this.horsepower= horsepower;
    	this.engineSize=engineSize;
    }
    public void setcolor (String color){
    	color=this.color;
    }
    public String getcolor(){
    	return this.color;
    }
    public void sethorsepower(int horsepower){
    	horsepower=this.horsepower;
    }
    public int gethorsepower(){
    	return this.horsepower;
    }
    public void setenginSize(String size){
    	size=this.engineSize;
    	
    }
    public String getsize(){
    	return this.engineSize;
    	   }
public String  toString(){
	return "The car is "+this.color+". It has the horsepower of "+this.horsepower+". And its engine size is "+this.engineSize+".";
}
}

