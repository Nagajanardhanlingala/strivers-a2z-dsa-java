class Solution {
    public List<String> generateBinaryStrings(int n) {
        List<String> result = new ArrayList<>();
        generate("",0,n,result);
        return result;
    }
    private void generate(String current, int index, int n, List<String> result){
        if(index == n){
            result.add(current);
            return;
        }
        generate(current+"0",index+1,n,result);
        if(current.isEmpty() || current.charAt(current.length()-1) == '0'){
            generate(current+"1",index+1,n,result);
        }
    }
}