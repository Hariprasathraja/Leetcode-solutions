class Solution {
    public int romanToInt(String s) {
    int n=0;
        for(int i=s.length()-1;i>=0;i--){
            switch(s.charAt(i)){
                case 'I': 
                    if(i==s.length()-1){
                        n+=1;
                    }else{
                        if(Character.toString(s.charAt(i+1)).matches(".*[VX].*")){
                            n-=1;
                        }else{
                            n+=1;
                        }    
                    }
                    break;
                case 'V': 
                    n+= 5; break;
                case 'X':
                      if(i==s.length()-1){
                        n+=10;
                    }else{
                        if(Character.toString(s.charAt(i+1)).matches(".*[LC].*")){
                            n-=10;
                        }else{
                            n+=10;
                        }    
                    }
                    break;
                case 'L': n+= 50; break;
                case 'C':
                      if(i==s.length()-1){
                        n+=100;
                    }else{
                        if(Character.toString(s.charAt(i+1)).matches(".*[DM].*")){
                            n-=100;
                        }else{
                            n+=100;
                        }    
                    }
                    break;
                case 'D': n+= 500; break;
                case 'M': n+= 1000; break;
            }
        }
        return n;
    }
}