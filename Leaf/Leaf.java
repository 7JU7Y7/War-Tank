public class Leaf implements Component{
    private int sum = 0;
    public Leaf(int sum){
        this.sum = sum;
    }
    @Override
    public int count() {
        return sum;
    }
}