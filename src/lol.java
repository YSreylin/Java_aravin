class KIT{
    void School(){
        System.out.println("lecture");
    }
}
class b8 extends KIT
{
    void Aravin(){
        System.out.println("Study JAVA ");
        System.out.println("9:30AM - 10:30AM");
    }
}
class bsection extends KIT
{
    void Aruna() {
        System.out.println("Study Database ");
    }
}
class online{
    public static void main(String args[]){
        b8  c = new b8();
        c.School();
        c.Aravin();

    }}
