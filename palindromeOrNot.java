import java.util.Scanner;

public class palindromeOrNot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the Five Digit Number : ");
        int num = scanner.nextInt();
        if (num>9999 && num<=99999){
            int rev = 0;
            int rem;
            int temp = num;
            while(temp!=0){
                rem = temp%10;
                rev = rev*10+rem;
                temp = temp/10;
            }if(num==rev){
                System.out.println("The Number is Palindrome");
            }else{
                System.out.println("The Number is not Plindrome");
            }       
        }      
    }   
}
