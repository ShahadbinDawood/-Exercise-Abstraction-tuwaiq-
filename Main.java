
public class Main {
    public static void main(String[] args) {
        //q1
        Movie movie=new Movie("boo",40,"james");
        System.out.println(movie.getName()+" discount is "+movie.getDiscount()+"\nthe directer is "+movie.getDirector());
        Book book = new Book("let go ",80,"gigi");
        System.out.println(book.getName()+" discounted price is "+book.getDiscount()+"\nthe author is "+book.getAuthor());
        //q2
        MovablePoint movablePoint = new MovablePoint(39,20,7,9);
        movablePoint.moveUp();
        movablePoint.moveRight();
        System.out.println("x  "+movablePoint.getX() + " y  "+movablePoint.getY());
        movablePoint.moveDawn();
        movablePoint.moveLeft();
        movablePoint.moveLeft();
        System.out.println("x  "+movablePoint.getX() + " y  "+movablePoint.getY());

    }
}