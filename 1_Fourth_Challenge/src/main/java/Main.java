public class Main {
    public static void main(String[] args){
        int[] a = {-1,-1,-1,2,-1,-2,4};
        int count = 0;
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                for(int k=j+1;k<a.length;k++){
                    if(a[i]+a[j]+a[k] == 0 ){
                        count++;
                        i++;
                    }
                }
            }
        }
        System.out.println(count);
    }
}
