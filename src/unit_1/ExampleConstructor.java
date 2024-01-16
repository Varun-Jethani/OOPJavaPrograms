package unit_1;

class Box2 {
    private double width, height, depth;
    public Box2(){
        width = 10;
        height = 10;
        depth = 10;
    }

    public Box2(double width, double height, double depth){
        this.width = width;
        this.height = height;
        this.depth=  depth;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getDepth() {
        return depth;
    }

    public void setDepth(double depth) {
        this.depth = depth;
    }

    public void volume(){
        System.out.println("Volume is "+width*depth*height);
    }

    public  void finalize() throws Throwable{
        System.out.println("Dabbbe ko Dabbe main dal diya");
    }

}
public class ExampleConstructor {
    public static void main(String[] args) {
        Box2 myBox1  = new Box2();
        myBox1.setHeight(20);
        myBox1.setDepth(30);
        myBox1.volume();
        myBox1 = null;
        System.gc();
        Box2 myBox2 = new Box2(15,35,12);
        myBox2.volume();

    }
}
