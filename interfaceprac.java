interface Animal{
    void makeSound();
}

class Dog implements Animal{
    public void makeSound(){
        try{
            System.out.println("Woof");
            throw new Exception("Exception thrown");
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
    }



public class interfaceprac {
    public static  void main(String[] args){
        int[] numbers=new int[5];
        for(int x:numbers){
            System.out.println(x);
        }
        Dog myDog=new Dog();
        myDog.makeSound();
    }

}
