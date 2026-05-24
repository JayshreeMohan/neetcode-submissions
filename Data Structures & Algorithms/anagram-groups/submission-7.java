class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        HashMap<String,List<String>> hm = new HashMap<>();

        for(String str : strs){
            char[]arr = str.toCharArray();
            Arrays.sort(arr);
            String newString = new String(arr);

            hm.putIfAbsent(newString,new ArrayList<>());
            hm.get(newString).add(str);



        }
        return new ArrayList<>(hm.values());
        
    }
}
