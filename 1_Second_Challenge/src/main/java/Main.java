public class Main {


    public static String compute(int n){

        String result = "";
        boolean isDivided = false;

        if(n%3 == 0) {
            result = "Foo";
            isDivided = true;
        }
        if(n%5 == 0){
            result += "Bar";
            isDivided = true;
        }
        if(n%7 == 0){
            result += "Qix";
            isDivided = true;
        }

        int copy = n;
        while(copy > 0){
            if(copy%10 == 3){
                result+="Foo";
                isDivided = true;
            } else if(copy%10 == 5){
                result+="Bar";
                isDivided = true;
            } else if(copy%10 == 7){
                result+="Qix";
                isDivided = true;
            }
            copy/=10;
        }

        return !isDivided ? ""+n : result;

    }

    public static String compute2(int n){
        String result="";
        int copy = n;
        String newNumber = "";
        while(copy>0){
            if(copy%10 == 0){
                newNumber += "*";
            } else{
                newNumber += copy%10;
            }
            copy/=10;
        }

        return newNumber;
    }

    public static void main(String[] args){
        System.out.println(compute(53));
        System.out.println(compute2(101));
    }
}
