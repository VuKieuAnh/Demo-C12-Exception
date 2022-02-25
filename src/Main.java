public class Main {
    public static void main(String[] args) {
        try {
            Triangle a= new Triangle(4, 2, 3);
        } catch (IllegalTriangleException e) {
            System.out.println(e.getMessage());
        }
    }
}
