public class main
{
    public static void main(String[] args)
    {
        ArrayList<String> myArrayList = new ArrayList<String>();


        String str = "CAT";
        myArrayList.add("cat");
        myArrayList.add("dog");

        myArrayList.remove(0);
        myArrayList.remove(str);
    }
}