HashMap approach:

class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        HashMap<Character, Character> mapST = new HashMap<>();
        HashMap<Character, Character> mapTS = new HashMap<>();

        for(int i = 0;i<s.length();i++){
        char c = s.charAt(i);
        char d = t.charAt(i);

            if(mapST.containsKey(c)){
            if(!mapST.get(c).equals(d)){
                return false;
            }
        }
        if(mapTS.containsKey(d)){
            if(!mapTS.get(d).equals(c)){
                return false;
            }
        }
        mapST.put(c,d);
        mapTS.put(d,c);
    }
    return true;
    }    
}
---------------------------------------------------------------------------------------
Arrays Approach:

class Solution{
    public static boolean isIsomorphic(String s, String t){
        if(s.length() != t.length()){
            return false;
        }
        int[] mapST = new int [256];
        int[] mapTS = new int [256];
        
        
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            char d = t.charAt(i);
            
            
            if(mapST[c] != 0 && mapST[c] != d){
                return false;
            }
            if(mapTS[d] != 0 && mapTS[d] != c){
                return false;
            }
            mapST[c] = d;
            mapTS[d] = c;
        }
        return true;
    }
}
