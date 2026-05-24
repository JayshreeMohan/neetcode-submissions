class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        HashMap<Integer,Integer>hm = new HashMap<>();
        
        for(int num : nums){
            hm.put(num,hm.getOrDefault(num,0)+1);
        }

        PriorityQueue<Integer>pq = new PriorityQueue<>((a,b)->hm.get(a) - hm.get(b));

        for(int key : hm.keySet()){
            pq.add(key);
            if(pq.size() > k){
                pq.poll();
            }
        }

        int index = 0;
        int[] res = new int[k];
        while(!pq.isEmpty()){
            res[index++] = pq.poll();
        }
        return res;
        
    }
}
