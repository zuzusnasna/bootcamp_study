package chap08.polymorphism;

class Animal{
    public void move(){
        System.out.println("동물이 움직입니다.");
    }
}
class Human extends Animal{
    public void move(){
        System.out.println("사람이 두발로 걷습니다.");
    }
}
class Tiger extends Animal{
    public void move(){
        System.out.println("호랑이가 어슬렁거립니다.");
    }
}
class Eagle extends Animal{
    public void move(){
        System.out.println("독수리가 하늘을 납니다.");
    }
}
public class AnimalTest {
    public static void main(String[] args) {
        AnimalTest test = new AnimalTest();
        test.moveAnimal(new Human());
        test.moveAnimal(new Tiger());
        test.moveAnimal(new Eagle());
    }
    public void  moveAnimal(Animal animal){
        animal.move(); //다양성을 나타냄
        //Animal animal = new Human() = (Animal animal)
    }
}
