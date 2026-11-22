class Solution {
    public String interpret(String command) {
        int n = command.length();
        ArrayList<String> arr = new ArrayList<>();
        int x=0;
        for(int i=0;i<n;i++){
            if(command.charAt(i)=='G'){
                arr.add("G");
                x++;
            }
            else if(command.charAt(i)=='(' && command.charAt(i+1)=='a'){
                arr.add("a");
                x++;
                arr.add("l");
                x++;
                i=i+3;
            }
            else if(command.charAt(i)=='('){
                arr.add("o");
                x++;
                i++;
            }
        }
        String result = String.join("",arr);
        return result;
    }
}