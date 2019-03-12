import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args){

        int[] a={15,1,-1,2,5,1,15,-2,3,-3,-15};
        List<Integer> foundArr = new ArrayList<Integer>();
        int count = 0;
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]+a[j] == 0 && !foundArr.contains(Math.abs(a[i]))){
                    count++;
                    foundArr.add(Math.abs(a[i]));
                }
            }
        }

        System.out.println(count);
        System.out.println(foundArr);
    }
}
