package Day2.Strings;

public class Solution {
    public String defangIPaddr(String address) {
        StringBuffer sb = new StringBuffer();
        String[] array = address.split("\\.");
        for(int i = 0; i < array.length; i++){
            sb.append(array[i]);
            if(i+1 != array.length){
                sb.append("[.]");
            }
        }
        return sb.toString();
    }
}
