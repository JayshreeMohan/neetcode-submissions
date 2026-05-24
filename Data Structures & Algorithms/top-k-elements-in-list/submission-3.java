class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        HashMap<Integer,Integer>hm = new HashMap<>();
        for(int num:nums){
            hm.put(num,hm.getOrDefault(num,0)+1);
        }

        PriorityQueue<Integer>pq = new PriorityQueue<>((a,b)->hm.get(a)-hm.get(b)); //store in ascending order
        for(int key: hm.keySet()){
            pq.add(key);
            if(pq.size()>k){
                pq.poll();
            }
        }

        int[]res = new int[k];
        int index = 0;
        while(!pq.isEmpty()){
            res[index] = pq.poll();
            index++;
        }

        return res;
        
    }
}
