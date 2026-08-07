package chap08.downcasting;

class Animal{
    public void move(){
        System.out.println("동물이 움직입니다.");
    }
}
class Human extends Animal{
    public void move(){
        System.out.println("사람이 두발로 걷습니다.");
    }
    public void  readBook(){
        System.out.println("사람이 책을 읽습니다.");
    }
}
class Tiger extends Animal{
    public void move(){
        System.out.println("호랑이가 어슬렁거립니다.");
    }
    public void hunting(){
        System.out.println("호랑이가 사냥을합니다.");
    }
}
class Eagle extends Animal{
    public void move(){
        System.out.println("독수리가 하늘을 납니다.");
    }
    public void flying(){
        System.out.println("독수리가 날고있는 중입니다.");
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

        /*Human human = (Human) animal;
        human.readBook();*/ //다운캐스팅 (instanceof) 를 하지않고 실행하면 오류발생

        if(animal instanceof Human){
            Human human = (Human) animal;
            human.readBook();;
        }
        else if(animal instanceof Tiger){
            Tiger tiger = (Tiger) animal;
            tiger.hunting();
        }
        else if (animal instanceof  Eagle) {
            Eagle eagle = (Eagle) animal;
            eagle.flying();
        }
        else {
            System.out.println("xxxxxxx");
        }
    }
}
