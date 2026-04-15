
public class Main {
    public static void main(String[] args) {
    //q1
        Movie movie=new Movie("boo",40,"james");
        System.out.println("the movie discount is "+movie.getDiscount());
        Book book = new Book("let go ",80,"gigi");
        System.out.println(book.getName()+" discounted price is "+book.getDiscount());
        //q2
        MovablePoint movablePoint = new MovablePoint(39,20,7,9);
        movablePoint.moveUp();
        movablePoint.moveRight();
        System.out.println("x  "+movablePoint.getX() + " y  "+movablePoint.getY());

    }
}