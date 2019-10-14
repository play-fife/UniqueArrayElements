import java.util.*;

public class UniqueCounts
{
    public static void main(String[] args)
    {
        int[] arr = {1, 2, 2, 3, 3, 3, 4, 4, 4, 4};
        uniqueOccurrences(arr);
    }

    public static boolean uniqueOccurrences(int[] arr)
    {
        if (arr.length < 2)
            {
            return false;
            }

        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        String numAsStr = "";
        for(int i = 0; i < arr.length; i++)
            {
            numAsStr = numAsStr + arr[i];
            }

        for (int i = 0; i < arr.length; i++)
            {
            if (!map.containsKey(numAsStr.charAt(i)))
                {
                char x = numAsStr.charAt(i);
                map.put(numAsStr.charAt(i), (int) numAsStr.chars().filter(ch -> ch == x).count());
                }
            }
        return  (new HashSet(map.values()).size() == map.size());
    }
}
