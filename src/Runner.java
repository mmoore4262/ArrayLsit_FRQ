import java.util.ArrayList;

public class Runner {
    public static void main (String[] args)
    {
        ArrayList<Integer> digitList= new ArrayList<Integer>();
       /* for (int i=0; i<digitList.size(); i++)
        {
            digitList.set(i,(int)(Math.random()*10));
        }*/
        Digits digit= new Digits(65310);
        System.out.println(""+ digit.isStrictlyIncreasing());

    }
}
