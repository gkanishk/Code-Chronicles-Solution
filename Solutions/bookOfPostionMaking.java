import java.io.*;
class ISBN {
public static void main(String args[])throws IOException
{ BufferedReader sc=new BufferedReader(new InputStreamReader(System.in));
   
        long isbnInteger =Long.parseLong(sc.readLine());
        String isbn = isbnInteger + "";
        int l=isbn.length();
if (l != 10) {
            System.out.println("Illegal ISBN");
        } else {
            int sum = 0;
            for (int i = 0; i < l; i++) {
                int digit = Integer.parseInt(isbn.charAt(i) + "");
                sum = sum + (digit * (i + 1));
            }
            if (sum % 11 == 0) {
                System.out.println("Legal ISBN");
            } else {
                System.out.println("Illegal ISBN");
            }
        }
    }
}