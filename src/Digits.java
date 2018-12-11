import java.util.ArrayList;

public class Digits
{
    private ArrayList<Integer> digitList;

    public Digits(int num)
    {
        digitList= new ArrayList<Integer>();
        String indiv= Integer.toString(num);
        if (indiv.length()==1)
        {
            digitList.add(0,num);
            return;
        }
        for (int i=0; i<indiv.length(); i++)
        {
            digitList.add(Integer.parseInt(indiv.substring(i,i+1)));
        }

    }

    public boolean isStrictlyIncreasing()
    {
        for (int i=0; i< digitList.size(); i++)
        {
            System.out.print(digitList.get(i));
        }
        System.out.println("");
        //System.out.println(digitList.size());
        for (int i=0; i<digitList.size()-1;i++)
        {
            if (digitList.get(i+1)<digitList.get(i))
            {
             return false;
            }
            if (digitList.get(i+1)==digitList.get(i))
            {
                return false;
            }
        }
        return true;
    }
}
