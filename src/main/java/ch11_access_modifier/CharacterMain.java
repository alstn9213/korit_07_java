package ch11_access_modifier;

class Character {
    public String name;
    private int health;
    int power;
    protected String skill;
    private int exp;


//    캐릭터 생성시에 필수적으로 요구되는 애들만 매개변수로 받은 매개변수 생성자
    public Character(String name, int power, String skill) {
        this.name = name;
        this.power = power;
        this.skill = skill;

        this.health = 100; // 초기체력(매개변수없이 객체 생성시에 무조건 체력 100으로 고정된다는 의미);
        this.exp = 0;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public int getPower() {
        return power;
    }

    public String getSkill() {
        return skill;
    }

    public int getExp() {
        return exp;
    }

    public void attack() {
        System.out.println(name + "이(가) " + power + "의 힘으로 로 공격합니다 !");
        this.gainExp(30);

    }

    private void gainExp(int amount) {
        exp += amount;
        System.out.println(name + "이(가) 경험치를 " + amount + " 얻었습니다.");
    }

    public void heal() {
        health += 10;
        System.out.println(name + "의 체력이 회복되었습니다. 현재 체력 : " + health);
    }

}

public class CharacterMain {
    public static void main(String[] args) {
        Character warrior = new Character("전사", 200, "세로베기");
//        warrior.setName("전사");
//        warrior.setHealth(100);
//        warrior.setPower(200);
//        warrior.setSkill("세로베기");
//        warrior.setExp(30);
//        System.out.println(warrior.getName());
//        System.out.println(warrior.getPower());
//        System.out.println(warrior.getExp());
//        System.out.println(warrior.getSkill());

        System.out.println(warrior.getHealth());

//        warrior.gainExp(1000); -> gainExp()를 private 처리했기때문에 오류발생
        warrior.attack();
        warrior.heal();

//        접근 지정자의 설정 수준에 따라서 setter / getter 가 필요한 경우가 있고 아닌 경우가 있다.
//        name필드는 public으로 설정되어있다. 그렇기때문에 getName()메서드는 쓸모가 없다.

//        어떤 클래스/필드/메서드를 어떤 접근 지정로 설정해야할지도 고민해야한다.
    }
}
