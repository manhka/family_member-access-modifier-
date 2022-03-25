package static_method;

public class staticMethod {
    public static void main(String[] args) {
        familyMember.family_name();
        familyMember me=new familyMember(1,"MANH",19);
        familyMember myBrother= new familyMember(2,"TIEN",22);
        familyMember mother= new familyMember(3,"HONG",45);
        familyMember father= new familyMember(4,"NHIEN",47);
        me.display();
        myBrother.display();
        mother.display();
        father.display();
    }
}
