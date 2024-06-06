class Solution {
    public boolean isNStraightHand(int[] hand, int size) {
        if(hand.length % size!=0) return false;
        Map<Integer,Integer> map=new HashMap<>();
        for(int i:hand){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        int[] ar=new int[map.size()];
        int indx=0;
        for(int key: map.keySet()){
            ar[indx++]=key;
        }
        Arrays.sort(ar);
        
        for(int key: ar){
            if(map.get(key)>0){
                int count=map.get(key);
                for(int j=key;j<key+size;j++){
                    if(map.getOrDefault(j,0)<count) return false;
                
                    map.put(j,map.get(j)-count);          
                }
            }
        }
        return true;
    }
}
