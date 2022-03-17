package ýp;
public class Main {

	public static void main(String[] args) {
		int [][]list= {
				{1},
				{8,4},
			    {2,6,9},
			    {8,5,9,3}
				};
	   
		int toplam=0;
		toplam=toplam+list[0][0];
		
		toplam=toplam+deger(list,0,0);
		System.out.println(toplam);
	    

		
		
}
	
	
     static int deger(int [][]list,int i,int j) {
		int toplam=0 ;
		int b=0;
		int a=1;
	    while(a!=list.length) {
	    int max=0;
		if(i==3) {
			max=0;
		}else {
			
			if(j!=0) {
			if(asalSayi(list[i+1][j-1])==false) {
				max=list[i+1][j-1];
				b=j-1;
			}
			if(asalSayi(list[i+1][j])==false){
				if(list[i+1][j]>max) {
					max=list[i+1][j];
					b=j;
				}
			}
			if(asalSayi(list[i+1][j+1])==false){
				if(list[i+1][j+1]>max) {
					max=list[i+1][j+1];
					b=j+1;
				}
			}
			}
			
			if(j==0) {
			
				if(asalSayi(list[i+1][j])==false){
					if(list[i+1][j]>max) {
						max=list[i+1][j];
						b=j;
					}
				}
				if(asalSayi(list[i+1][j+1])==false){
					if(list[i+1][j+1]>max) {
						max=list[i+1][j+1];
						b=j+1;
					}
				}
				}	
			
		}
	            toplam=toplam+max;	
	            i=i+1;
	            j=b;
	            a=a+1;
		
		}
		
		
    	  return toplam;
	}
	
	static boolean  asalSayi(int sayi) {
		boolean asalMý=true;
		for(int i=2;i<sayi/2;i++) {
			if(sayi%i==0) {
				
				asalMý=false;
				break;
			}else {
				asalMý=true;
			}
		}
		
		return asalMý;
	}
	
	
	
}
