class Increment
{
     public static void main(String[] args)
{
        int a = 12,b;
        b = a++ + a-- + --a + --a + ++a - a-- + --a + a++ + --a - a++ - --a + ++a;
         System.out.println("the value of a=" +a);
         System.out.println(b);      
}
}