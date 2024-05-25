package Day2.Strings;

public class Solution {
    //1108. Defanging an IP Address
    public String defangIPaddr(String address) {
        StringBuffer sb = new StringBuffer();
        String[] array = address.split("\\.");
        for (int i = 0; i < array.length; i++) {
            sb.append(array[i]);
            if (i + 1 != array.length) {
                sb.append("[.]");
            }
        }
        return sb.toString();
    }

    public String defangIPaddr2(String address) {
        return address.replace(".", "[.]");
    }
    
    //1528. Shuffle String
    public String restoreString(String s, int[] indices) {
        StringBuilder sb = new StringBuilder();
        char[] array = new char[indices.length];
        for (int i = 0; i < indices.length; i++) {
            array[indices[i]] = s.charAt(i);
        }
        return new String(array);
    }
    

    // 1678. Goal Parser Interpretation
    public String interpret(String command) {
        return command.replaceAll("\\(\\)", "o").replaceAll("\\(al\\)", "al");
    }
    
    // 1859. Sorting the Sentence

    public String sortSentence(String s) {
        String[] string = s.split(" ");
        String[] result = new String[string.length];
        for(String str : string){
            int index = (int)(str.charAt(str.length()-1));
            index -=48;
            result[index-1] = str.substring(0, str.length()-1);
        }
        StringBuffer sb = new StringBuffer();
        for(String str : result){
            sb.append(str+" ");
        }
        return sb.toString().trim();
    }
}
