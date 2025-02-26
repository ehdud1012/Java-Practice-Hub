
//절차지향프로그래밍 (Procedural Programming)
//	if, for, 배열 등등 순서대로, 효율적으로 잘 써서 프로그램 만들어내자
//객체 지향 프로그래밍 (Object Oriented Programming) : 현재 시대
//프로그램 완성은 기본이고, 유지보수에 용이한 형태로 만들자
//	==> 소스가 쉬워야함 : 자바 소스로 실생활을 묘사하자
//객체(Object) : 실생활에 존재하는 무언가
//	만들려면 : class (새 클래스 만들기)필요

public class OMain {

public static void main(String[] args) {
/* 
String name = "후추";
System.out.println(name);
int age = 3;
System.out.println(age);
*/
// 개 객체 만들기
Dog dog1 = new Dog();
dog1.name = "후추";
dog1.age = 3;
dog1.bark();
dog1.printInfo();

Dog dog2 = new Dog();
dog2.name = "소금";
dog2.age = 1;
}

}
