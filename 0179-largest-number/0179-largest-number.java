class Solution {
    public String largestNumber(int[] nums) {
        String[] arr=new String[nums.length];
        for(int i=0;i<nums.length;i++){
            arr[i]=String.valueOf(nums[i]);
        }
        Arrays.sort(arr,new Comparator<String>(){
            @Override
            public int compare(String a, String b){
                String x=a+b;
                String y=b+a;
                return y.compareTo(x);
            }
        });
        if(arr[0].equals("0")) return "0";
        StringBuilder sb=new StringBuilder();
        for(String i:arr) sb.append(i);
        return sb.toString();
    }
}