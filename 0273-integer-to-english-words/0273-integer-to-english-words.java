class Solution {
     
    private String[] units={"","One","Two","Three","Four","Five",
                        "Six","Seven","Eight","Nine","Ten",
                        "Eleven","Twelve","Thirteen","Fourteen","Fifteen"
                        ,"Sixteen","Seventeen","Eighteen","Nineteen"};
        
    private String[] tens={"","","Twenty","Thirty","Forty","Fifty",
                      "Sixty","Seventy","Eighty","Ninety"};
    
    public String numberToWords(int num) {
        if(num==0) return "Zero";
       
        
        String[] big={""," Thousand"," Million"," Billion"};
        int i=0;
        StringBuilder sb=new StringBuilder();
        while(num>0){
            if(num%1000!=0){
                String ans=helper(num%1000);
                sb.insert(0,ans+big[i]+" ");
            }
            i++;
            num/=1000;
        }
        return sb.toString().trim();
        
    }
    public String helper(int num){
        StringBuilder sb=new StringBuilder();
        if(num>=100){
            sb.append(units[num/100]).append(" Hundred ");
            num%=100;
        }
        if(num>19){
            sb.append(tens[num/10]).append(" ");
            num%=10;
        }
        if(num>0){
            sb.append(units[num]).append(" ");
        }
        return sb.toString().trim();
    }
}