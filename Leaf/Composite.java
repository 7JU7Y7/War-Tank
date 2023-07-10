import java.util.ArrayList;

public class Composite implements Component{
    private ArrayList<Component> counterList = new ArrayList<>();

    public void add(Component counter){
        counterList.add(counter);
    }
    public void remove(Component counter){
        counterList.remove(counter);
    }
    public ArrayList<Component> getChild(){
        return counterList;
    }

    @Override
    public int count() {
        int sum = 0;
        int a = 0;
        for(Component counter : counterList){
            sum += counter.count();
        }
        return sum;
    }
}
