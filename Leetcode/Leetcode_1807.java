class Solution {
    public String evaluate(String s, List<List<String>> knowledge) {
        HashMap<String, String> map = new HashMap<>();
        for(List<String> pair : knowledge){
            map.put(pair.get(0),pair.get(1));
        }
        StringBuilder result = new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) != '('){
                result.append(s.charAt(i));
            }else{
                i++;
                int start = i;

                while(s.charAt(i) != ')'){
                    i++;
                }
                String key = s.substring(start,i);
                String value = map.get(key);

                if(value != null){
                    result.append(value);
                }else{
                    result.append("?");
                }
            }
        }
        return result.toString();
    }
}