public class Main {
    public static void main(String[] args){
        Composite China = new Composite();
        China.add(new Leaf(10000));//Beijing

        Composite Mongolia = new Composite();
        Mongolia.add(new Leaf(100));//包头

        China.add(Mongolia);
        int c = 1;

        System.out.println(China.count());
    }
}
