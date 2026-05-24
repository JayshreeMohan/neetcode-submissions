class MyHashSet {

    private List<Integer>list1;  
    public MyHashSet() {

     list1 = new ArrayList<>();
        
    }
    
    public void add(int key) {

        if(!list1.contains(key)){
            list1.add(key);
        }
        
    }
    
    public void remove(int key) {

        list1.remove(Integer.valueOf(key));
        
    }
    
    public boolean contains(int key) {
        return list1.contains(key);
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */