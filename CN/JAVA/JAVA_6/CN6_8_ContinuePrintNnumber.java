package JAVA_6;

public class CN6_8_ContinuePrintNnumber {
    public static void main(String[] args) {
        int n = 10;

        int i = 1;
        while (i<=n){
            if (i == 5){
                i++;
                continue;
            }
            System.out.println(i);
            i++;
        }

        for (int j=1;j<=n;j++){
            if (j == 5){
                continue;
            }
            System.out.println(j);
        }
    }
}
