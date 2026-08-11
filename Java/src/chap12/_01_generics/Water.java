package chap12._01_generics;

public class Water extends Material{
    public String toString(){
        return "재료는 Water입니다.";
    }

    public void doPrinting() {
        System.out.println("Water 재료로 출력합니다");
    }
}
