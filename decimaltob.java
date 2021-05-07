 class decimaltob {
    public static void main(String args[])
    {
        int binary[]=new int [20];//array syntax
        int index=0;
        int n=20;
        while(n>0)
        {
            binary [index]=n%8;
            n=n/8;  //1%2=1
					//1/2=0  //0101
							//1010
					//
             index++;
		}
        for(int i=index-1;i>=0;i--)
        {
            System.out.print(binary[i]);
        
		}
		
    }
}

