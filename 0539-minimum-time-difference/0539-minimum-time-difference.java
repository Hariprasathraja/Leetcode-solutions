class Solution {
    public int findMinDifference(List<String> timePoints) {
        List<Integer> minuteList=new ArrayList<>();
        for(String i: timePoints){
            String[] time=i.split(":");
            int hr=Integer.parseInt(time[0]);
            int m=Integer.parseInt(time[1]);
            minuteList.add(hr*60+m);
        }
        Collections.sort(minuteList);
        int diff=Integer.MAX_VALUE;
        for(int i=1;i<minuteList.size();i++){
            diff=Math.min(diff,minuteList.get(i)-minuteList.get(i-1));
            if(diff==0) return 0;
        }
        diff=Math.min(diff,1440-(minuteList.get(minuteList.size()-1)-minuteList.get(0)));
        return diff;
    }
}