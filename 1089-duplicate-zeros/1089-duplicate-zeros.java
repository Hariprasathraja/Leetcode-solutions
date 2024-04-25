class Solution {
    public void duplicateZeros(int[] arr) {
    int[] copy=arr.clone();
    int j=0;
    for(int i=0;i<copy.length;i++){
        if(copy[i]==0){
            arr[j++]=0;
            if(j>=arr.length){
                break;
            }
        }
        arr[j++]=copy[i];
        if(j>=arr.length){
            break;
        }
    }   
    }
}