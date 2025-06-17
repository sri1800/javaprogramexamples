
import java.io.*;


class Solution 
{
    public boolean checkPangram(String s) 
        {
            int MAX_CHAR = 26;
    
            boolean[] vis = new boolean[MAX_CHAR];     
            
            for (int i = 0; i < s.length(); i++)
            {
                if ('A' <= s.charAt(i) && s.charAt(i) <= 'Z')
                    vis[s.charAt(i) - 'A'] = true;
    
     
                else if ('a' <= s.charAt(i) && s.charAt(i) <= 'z')
                    vis[s.charAt(i) - 'a'] = true;
            }
    
            for (int i = 0; i < MAX_CHAR; i++) 
            {
                if (!vis[i])  
                    return false;
            }
            return true;
        }

    public Object popCharacter() {
        throw new UnsupportedOperationException("Unimplemented method 'popCharacter'");
    }

    public void pushCharacter(char c) {

        throw new UnsupportedOperationException("Unimplemented method 'pushCharacter'");
    }
    }
    class PanagramChecking 
    {
        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int t = Integer.parseInt(br.readLine());
            while (t-- > 0) {
                String s = br.readLine().trim();
    
                System.out.println(new Solution().checkPangram(s) == true ? "true"
                                                                      : "false");

            System.out.println("~");
        }
    }
}
