package automationtest;

public class Question_2_Vaiable_Q2 {
    int id;
    String name;
    public Question_2_Vaiable_Q2(int id, String name){
       this.id=id;
        this.name=name;
    }
    public void display(){
        System.out.print(id +" - " );
        System.out.println(name);
    }

    public static void main(String[] args) {
        Question_2_Vaiable_Q2 obj1 = new Question_2_Vaiable_Q2(101,"Your Name");
        obj1.display();

        Question_2_Vaiable_Q2 obj2 = new Question_2_Vaiable_Q2(102,"Prime");
        obj2.display();
    }


}
