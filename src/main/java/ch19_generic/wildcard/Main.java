package ch19_generic.wildcard;

public class Main {
    public AnimalData<? extends Animal> getAnimal(int flag) {
        if(flag == 1) {
            AnimalData<Human> humanAnimalData = new AnimalData<>(new Human());
            return humanAnimalData;
        } else if(flag == 2) {
            AnimalData<Tiger> tigerAnimalData = new AnimalData<>(new Tiger());
            return tigerAnimalData;
        }
        return null;
    }
    public static void main(String[] args) {
        AnimalData<Tiger> animalData1 = new AnimalData<>(new Tiger());
        AnimalData<Human> animalData2 = new AnimalData<>(new Human());
        AnimalData<Car> animalData3 = new AnimalData<>(new Car());
//        현재 상황에선 AnimalData에 Car 객체가 들어가 있지만 오류가 발생하지 않는다.
//        제네릭 때문에 T에는 어떤 클래스도 들어갈 수 있기때문이다.
        animalData1.showData();
        animalData2.showData();
//        animalData3.showData(); // 실행시에는 오류가 발생. AnimalData 클래스에서 정의된 메서드로직이 필드를 Animal 로 형변환 시키는데
//        Car 클래스의 인스턴스를 Animal로 형변환시키는 것이 불가능하기 때문이다.
        Main main = new Main();
        AnimalData<? extends Animal> animalData4 = main.getAnimal(1);
        AnimalData<? extends Animal> animalData5 = main.getAnimal(2);
        AnimalData<? extends Animal> animalData6 = main.getAnimal(3); // null

//        if(animalData4 != null) {
//            animalData4.showData();
//        }
//        if(animalData5 != null) {
//            animalData5.showData();
//        }
//        if(animalData6 != null) {
//            animalData6.showData();
//        } else { // animalData6 == null 이라면
//            System.out.println("아무것도 없습니다.");
//        }
    }
}
