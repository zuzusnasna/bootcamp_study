package chap11._01_object;

import java.util.HashMap;
import java.util.Objects;

class Student {
    String studentName;
    int studentID;

    public Student( int studentID, String studentName) {
        this.studentName = studentName;
        this.studentID = studentID;
    }
    @Override
    public String toString(){
        return studentID + ", " + studentName;
    }

    @Override
    public boolean equals(Object obj){
        if(obj instanceof Student){
            Student std = (Student)obj;
            if (this.studentID == std.studentID)
                return true;
            else
                return false;
        }
        return false;
    }
    //hashCode 재정의


    /**
     * {@return a hash code value for this object} This method is
     * supported for the benefit of hash tables such as those provided by
     * {@link HashMap}.
     * <p>
     * The general contract of {@code hashCode} is:
     * <ul>
     * <li>Whenever it is invoked on the same object more than once during
     *     an execution of a Java application, the {@code hashCode} method
     *     must consistently return the same integer, provided no information
     *     used in {@code equals} comparisons on the object is modified.
     *     This integer need not remain consistent from one execution of an
     *     application to another execution of the same application.
     * <li>If two objects are equal according to the {@link
     *     #equals(Object) equals} method, then calling the {@code
     *     hashCode} method on each of the two objects must produce the
     *     same integer result.
     * <li>It is <em>not</em> required that if two objects are unequal
     *     according to the {@link #equals(Object) equals} method, then
     *     calling the {@code hashCode} method on each of the two objects
     *     must produce distinct integer results.  However, the programmer
     *     should be aware that producing distinct integer results for
     *     unequal objects may improve the performance of hash tables.
     * </ul>
     *
     * @implSpec As far as is reasonably practical, the {@code hashCode} method defined
     * by class {@code Object} returns distinct integers for distinct objects.
     * @apiNote The {@link Objects#hash(Object...) hash} and {@link
     * Objects#hashCode(Object) hashCode} methods of {@link
     * Objects} can be used to help construct simple hash codes.
     * @see Object#equals(Object)
     * @see System#identityHashCode
     */
    @Override
    public int hashCode() {
        return studentID; // 학번이 같으면 true
    }
}
public class EqualsTest {
    public static void main(String[] args) {
        Student studentLee = new Student(100, "이상원");
        Student studentLee2 = studentLee;
        Student studentSang = new Student(100, "이상원");

        if(studentLee == studentLee2)
            System.out.println("studentLee와 studentLee2는 주소가 같다");
        else
            System.out.println("studentLee와 studentLee2는 주소가 다르다");

        if(studentLee.equals(studentLee2))
            System.out.println("studentLee와 studentLee2는 동일한 사람입니다.");
        else
            System.out.println("studentLee와 studentLee2는 다른 사람입니다.");

        System.out.println("------------------------------------------------------------------------------");

        if(studentLee == studentSang)
            System.out.println("studentLee와 studentSang는 주소가 같다");
        else
            System.out.println("studentLee와 studentSang는 주소가 다르다");

        if(studentLee.equals(studentSang))
            System.out.println("studentLee와 studentSang는 동일한 사람입니다.");
        else
            System.out.println("studentLee와 studentSang는 다른 사람입니다.");

        System.out.println("------------------------------------------------------------------------------");

        System.out.println("studentLee의 hashcode :  " + studentLee.hashCode());
        System.out.println("studentSang의 hashcode :  " + studentSang.hashCode());
        System.out.println("studentSang의 실제주솟값 :  " + studentSang.hashCode());
        System.out.println("studentSang의 실제주솟값 :  " + studentSang.hashCode());
    }
}
