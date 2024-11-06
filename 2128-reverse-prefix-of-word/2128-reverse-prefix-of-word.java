class Solution {
    public String reversePrefix(String word, char ch) {
        
      


        int l=word.indexOf(ch);
        if(l!=-1){ 
        StringBuilder st=new StringBuilder();
         for(int j=l;j>=0;j--){
            
         st.append(word.charAt(j));

        }
        for(int i=l+1;i<word.length();i++){
            st.append(word.charAt(i));

        }
        return st.toString();
        }
        else {
            return word;
        }

     
    }
}