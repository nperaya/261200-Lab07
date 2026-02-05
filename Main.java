public class Main {

    public static void main(String[] args) {

        Character character = new Character(100, 50);

        character.swingSword();
        character.swingSword();
        character.swingSword();
        character.swingSword();
        character.swingSword();

        character.takeDamage(30);
        character.takeDamage(50);
        character.takeDamage(20);

        character.rest();
        
        System.out.println(
                "Character's health: " + character.getHealth() +
                        ", stamina: " + character.getStamina()
        );
    }
}
