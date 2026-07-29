class Solution {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase().replaceAll("[^a-z0-9]", "");
        String st="";
        String rev="";
        for(int i=0;i<s.length();i++){
            st +=s.charAt(i);
        }
        for(int j=s.length()-1;j>=0;j--){
                rev+=s.charAt(j);
        }
        if(st.equals(rev)){
            return true;
        }
        return false;
    }
}
