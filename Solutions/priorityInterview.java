import java.io.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
         BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
         int n=Integer.parseInt(br.readLine());
         int a[]=new int[100000];
         int b[]=new int[100000];
         int i=0,j=0;
         while(n-->0)
         {
             String[] s=br.readLine().split("\\s+");
             if(Integer.parseInt(s[0])==0)
             {
                 a[i]=Integer.parseInt(s[1]);
                 i++;
             }
             else
             {
             b[j]=Integer.parseInt(s[1]);
             j++;
             }
         }
         Arrays.sort(a,0,i);
         Arrays.sort(b,0,j);
         for(int k=i-1;k>=0;k--)
         System.out.print(a[k]+" ");
         for(int k=j-1;k>=0;k--)
         System.out.print(b[k]+" ");
    }
}