package quiz._05_chap05_Quiz;

public class Man {
    int age;
    String name;
    boolean isMarried;
    String children;

    public Man(int age, String name, boolean isMarried, String children)
    {
        this.age = age;
        this.name = name;
        this.isMarried = isMarried;
        this.children = children;
    }
    public String manInfo(){
        return "나이가 " + age + "살, " +
                        "이름이 " + name +
                        "라는 남자가 있습니다.  이 남자는 " +
                (isMarried ? "결혼을 했고 " :  "결혼을 안했고 ")+ "자식이 " + children +
                        " 있습니다.";
    }
    /*public static void main(String[] args) {
        Man man1 = new Man(40, "James", true, "셋");
        System.out.println(man1.manInfo());
    }*/
}
