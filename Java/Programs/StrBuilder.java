public class StrBuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Vamse");
        System.out.println(sb);
        //char at index 0
        System.out.println(sb.charAt(0));
        //set char at index 0
        sb.setCharAt(4, 'i');
        System.out.println(sb);
        //insert is used to add a letter at particular index and shift the rest
        StringBuilder a = new StringBuilder("Udy");
        a.insert(2,'a');
        System.out.println(a);
        //delete
        a.insert(2,"aaa");
        System.out.println(a);
        a.delete(3, 6);
        System.out.println(a);
        //append add at the end .....at memory str points the same heap value locator in StringBuilder
        StringBuilder b = new StringBuilder("H");
        b.append('e');
        b.append('l');
        b.append('l');
        b.append('o');
        System.out.println(b);
    }
    
}
