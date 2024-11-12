class Solution {
    public int[] maximumBeauty(int[][] items, int[] queries) {
        int[] res=new int[queries.length];
        
        Arrays.sort(items,(a,b)->Integer.compare(a[0],b[0]));
        TreeMap<Integer,Integer> map=new TreeMap<>();
        int maxBeauty=0;
        
        for(int[] i: items){
            int price=i[0];
            int beauty=i[1];
            maxBeauty=Math.max(maxBeauty,beauty);
            map.put(price,maxBeauty);
        }
        int ind=0;
        for(int i: queries){
            Integer price=map.floorKey(i);
            if(price!=null){
                res[ind++]=map.get(price);
            }else{
                res[ind++]=0;
            }
        }
        return res;
    }
}