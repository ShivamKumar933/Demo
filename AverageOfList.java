import java.util.ArrayList;

public class AverageOfList {
    public static float findAverage(ArrayList<Integer> list, int size){
        if(size == 0){
            return 0;
        }
        
        int sum = 0;
        int i = 0;

        do{
            sum += list.get(i);
            i++;
        }while(i < size);

        float ans =  ((float)sum / (float)size);
        return ans;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(5);
        list.add(7);
        list.add(21);
        list.add(4);
        list.add(8);

        float ans = findAverage(list, list.size());
        System.out.println("The average of the numbers is : " + ans);
    }
}
