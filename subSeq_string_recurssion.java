public class subSeq_string_recurssion {
    public static void printSubseq(String str,int idx,String newstr){
        if(idx == str.length()){
            System.out.println(newstr);
            return;
        }
        char ch = str.charAt(idx);

        // wants to be
        printSubseq(str, idx+1, newstr+ch);

        // not wants to be
        printSubseq(str, idx+1, newstr);
    }
    public static void main(String args[]){
        String str = "abc";
        printSubseq(str, 0, "");
    }
}
