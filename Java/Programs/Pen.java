public class Pen {
    String color;
    int cost;
    public void penInfo(String color){
        System.out.println(this.color);
    }
    public void penInfo(int cost){
        System.out.println(this.cost);
    }
    public void penInfo(int cost,String color){
        System.out.println(this.cost);
        System.out.println(this.color);
    }
}