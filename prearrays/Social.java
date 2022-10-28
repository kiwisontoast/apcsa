public class Social
{
   private String socialNum;
   private int sum;

    public Social()
    {

    }

    public Social(String social)
    {
        socialNum = social;
    }


    public void setWord(String word)
    {
        socialNum = word;
    }

    public void chopAndAdd()
    {
        int temp = 0;
        String[] splitNum = socialNum.split("-");
        for (int i = 0; i < splitNum.length; i++)
		{
            temp += Integer.parseInt(splitNum[i]);
		}
        sum = temp;
    }

    public String toString()
    {
        return "SS# " + socialNum + " has a total of " + sum + "\n";
    }
}