package ContructorConcept;


public class HouseDog extends Dog {
    public HouseDog(String name) {
        this.setName(name);
    } 
    //�����ڰ� ������ ��� ��Ģ��θ� ��ü�� ������ �� �ִ�.

    public void sleep() {
        System.out.println(this.name+" zzz in house");
    } 

    public void sleep(int hour) {
        System.out.println(this.name+" zzz in house for " + hour + " hours");
    } 

    public static void main(String[] args) {
        HouseDog dog = new HouseDog("happy");
        System.out.println(dog.name);
    }
}