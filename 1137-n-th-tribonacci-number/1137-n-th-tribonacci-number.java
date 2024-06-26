class Solution {
    public int tribonacci(int n) {
    if(n==0){
        return n;
    }
    if(n<3){
        return 1;
    }
    int[] Tri=new int[n+1];
    Tri[0]=0;
    Tri[1]=1;
    Tri[2]=1;
    for(int i=3;i<=n;i++){
        Tri[i]=Tri[i-1]+Tri[i-2]+Tri[i-3];
    }
    return Tri[n];
}
}