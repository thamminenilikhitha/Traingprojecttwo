public class Evenodd {

    public static void main(String[] args) {

        int num=40;
        String result=num%3==0?"even":"odd";
        System.out.println(result);

        int L1=6;
        int L2=8;
        int L3=-10;
      //int max=(L1>L2)?(L1>L3) ? L1:L3 : ((L2>L3)? L2:L3);
        int max = (L1 > L2) ? L1 : (L2 > L3) ? L2 : L3;
        System.out.println(max);










    }
}
