class Solution {
    public String toLowerCase(String s) {

        StringBuilder st=new StringBuilder();
        int l=s.length();
        for(int i=0;i<l;i++){
            char ch=s.charAt(i);
            if(ch>='A'&& ch<='Z'){
               
               st.append((char)(ch+32));
            }
            else{
                st.append(ch);

            }



        }
        return st.toString();
    }}








                          