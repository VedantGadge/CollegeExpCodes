public class Exp1_g2 
{
        public static void main(String[] args) 
        {
            int temp2=1,alpha=1,temp1=65;
            for(int i = 1;i<=4;i++)
            {
                for(int j=4;j>=i;j--)
                {  
                    System.out.print(" ");
                }
                alpha=temp1;
                for(int j=1;j<=i;j++)
                {
                    System.out.print((char)(alpha));
                    alpha--;
                }
                temp1+=++temp2;
                System.out.println();
            }

        }
    }
    