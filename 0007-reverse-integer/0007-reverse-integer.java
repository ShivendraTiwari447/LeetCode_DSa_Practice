class Solution {
    public int reverse(int x) {
          
        boolean isNegative = false;
        if(x<0){
            isNegative=true;
            x=-x;

        }

        long nx=0;
        while(x>0){
            nx = nx*10 + x%10;
            x/=10;

        }

        if(isNegative){
            nx=-nx;

        }

        if(nx<-Math.pow(2,31) || nx>Math.pow(2,31)-1){
            return 0;

        }
        return (int)nx;
    }
}