public class Rectangle {
    int width, height;

    public Rectangle(int width, int height){
        this.width = width;
        this.height = height;
    }
    public int getArea(){
        return this.width * this.height;
    }

    public int getPerimeter() {
        return (this.width + this.height)*2;
    }
    void display(){
        System.out.println("Chieu dai: " + width + " " +" Chieu rong: " + height);
    }
}
