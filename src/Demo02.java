import java.util.Arrays;

public class Demo02 {
    public static void main(String[] args) {
        //String
        String name1 = "POP";
        String name2 = new String("POP");

        if (name1 == "POP"){
            System.out.println("OK 1");
        }

        if (name2 == "POP"){
            System.out.println("OK 2");
        }

        int[] scores = new int[]{0,10,20,30,40};

        //for each
        for(int score : scores){
            System.out.println(score);
        }
        for (int i = 0 ; i < scores.length; i++){
            System.out.println(i + " : " +scores[i]);
        }
        //Arrays.stream(scores).forEach(score -> System.out.println(score));
        Arrays.stream(scores).forEach(System.out::println);
    }
}
