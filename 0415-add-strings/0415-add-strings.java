class Solution {
    public String addStrings(String num1, String num2) {
        int i=num1.length()-1,j=num2.length()-1,balance=0;
        StringBuilder sb=new StringBuilder();
        while(i>-1||j>-1||balance==1){
            int dig1=(i>-1)?num1.charAt(i)-'0':0;
            int dig2=(j>-1)?num2.charAt(j)-'0':0;
            i--;
            j--;
            int sum=dig1+dig2+balance;
            sb.append(sum%10);
            balance=sum/10;
        }
        return sb.reverse().toString();
    }
}