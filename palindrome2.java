public class palindrome2 {
    public static void main(String[] args) {
        String e= "john";
        String c= new StringBuffer(e).reverse().toString();

        if(e.equals(c)){
            System.out.println("palindihrome");
        }
        else{
            System.out.println("not palindihrome 🥀");
        }
}
}
