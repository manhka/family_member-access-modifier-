package static_method;

public class familyMember {
    private int id;
    private String name;
    private int age;
      static String family_name;

    public familyMember(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;

    }
    static  void  family_name(){
        family_name="NGUYEN";
    }
    void display(){
        System.out.println("id"+id+ ":"+ family_name +"  "+ name +" age:" +age);
    }
}
