public class Rectangle {
    double width, height;
    public Rectangle(){
    }
    public Rectangle(double width, double height){
        this.height = height;
        this.width = width;
    }
    public double getArea(){
        return this.height * this.width;
    }
    public double getPerimeter(){
        return (this.height + this.width) * 2;
    }
    public String display(){
        return "Rectangle{" + "width = " + width + ", height = " + height + " }";
    }
}
