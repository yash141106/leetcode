class Solution {
    public String defangIPaddr(String address) {
        StringBuilder ip = new StringBuilder();
        int n = address.length();
        for(int i=0;i<n;i++){
            if(address.charAt(i)=='.'){
                ip.append("[.]");
            }
            else{
                ip.append(address.charAt(i));
            }
        }
        return ip.toString();
    }
}