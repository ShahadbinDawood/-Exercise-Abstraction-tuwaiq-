
public class Main {
    public static void main(String[] args) {
        //q1
        Movie movie=new Movie("boo",40,"james");
        System.out.println(movie.toString());
        System.out.println(movie.getName()+" discount is "+movie.getDiscount()+"\nthe directer is "+movie.getDirector());
        System.out.println("\n-----------------");
        Book book = new Book("let go ",80,"gigi");
        System.out.println(book.toString());
        System.out.println("\n-----------------");
        System.out.println(book.getName()+" discounted price is "+book.getDiscount()+"\nthe author is "+book.getAuthor());
        System.out.println(book.getName()+" discounted price is "+book.addDiscount(50)+"\nthe author is "+book.getAuthor());
        System.out.println("\n-----------------");
        //q2
        MovablePoint movablePoint = new MovablePoint(39,20,7,9);
        movablePoint.moveUp();
        movablePoint.moveRight();
        movablePoint.printCordinint();
        movablePoint.moveDawn();
        movablePoint.moveLeft();
        movablePoint.moveLeft();
        movablePoint.printCordinint();

    }
}