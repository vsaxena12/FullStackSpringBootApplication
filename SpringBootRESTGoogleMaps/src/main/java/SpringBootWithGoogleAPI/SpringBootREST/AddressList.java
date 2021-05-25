package SpringBootWithGoogleAPI.SpringBootREST;

class AddressList
{
 
    // Maximum length of string
    // after modifications.
    static int MAX = 1000;
 
    // Replaces spaces with %20 in-place
    // and returns new length of modified string.
    // It returns -1 if modified string
    // cannot be stored in str[]
    static char[] replaceSpaces(char[] str)
    {
 
        // count spaces and find current length
        int space_count = 0, i = 0;
        for (i = 0; i < str.length; i++)
            if (str[i] == ' ')
                space_count++;
 
        // count spaces and find current length
        while (str[i - 1] == ' ')
        {
            space_count--;
            i--;
        }
 
        // Find new length.
        int new_length = i + space_count * 2;
 

        if (new_length > MAX)
            return str;
 

        int index = new_length - 1;
 
        char[] old_str = str;
        str = new char[new_length];
 

        for (int j = i - 1; j >= 0; j--)
        {
 
            // inserts %20 in place of space
            if (old_str[j] == ' ')
            {
                str[index] = '0';
                str[index - 1] = '2';
                str[index - 2] = '%';
                index = index - 3;
            }
             
            else
            {
                str[index] = old_str[j];
                index--;
            }
        }
        return str;
    }
 
    // Driver Code
    public static void main(String[] args)
    {
        char[] str = "302 Bluesedge Lane Alpharetta GA".toCharArray();
 
      
        str = replaceSpaces(str);
 
        for (int i = 0; i < str.length; i++)
            System.out.print(str[i]);
    }
}