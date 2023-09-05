class Palindrome {
    
    boolean isPalindrome(int num) {
        int originalNum = num;
        int reverse = 0;
        
        while (num > 0) {
            int digit = num % 10;
            reverse = reverse * 10 + digit;
            num = num / 10;
        }
        
        return originalNum == reverse;
    }

    public static void main(String[] args) {
        Palindrome p = new Palindrome();
        boolean result = p.isPalindrome(1223); // Example number to check for palindrome
        System.out.println(result);
    }
}
