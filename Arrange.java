package java;

public class Arrange {

	public  int main(String[] args) {
		int n=6;
		 int coins = n;
	        for(int i=1;i<=n;i++){
	            coins=coins-i;
	            if(coins<0){
	                return i-1;
	            }
	        }
	        
	        return 1;
	    }
	

}
