class Solution {
    public String reverseWords(String s) {
        s = s.trim();
        String res = "";

        String [] str  = s.split(" ");
        for(int i =str.length-1 ;i>=0;i--){
             if(!str[i].equals(" ") && (!str[i].equals("")))
            {
                res+= str[i]+ " ";
            }
        }
        return res.trim();
    }
}