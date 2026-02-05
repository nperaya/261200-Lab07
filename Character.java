public class Character {

    //Attributes
    private int health;
    private int stamina;
    private int maxHealth;
    private int maxStamina;

    //Constructor
    public Character(int maxHealth, int maxStamina) {
        this.maxHealth = maxHealth;
        this.maxStamina = maxStamina;
        this.health = maxHealth;
        this.stamina = maxStamina;

        System.out.println("Character created with " + health + " health and " + stamina + " stamina.");
    }

    //Getter
    public int getHealth() {
        return health;
    }

    public int getStamina() {
        return stamina;
    }

    //Methods

    // Reduce stamina when swinging a sword
    public void swingSword() {
        int staminaCost = 10;

        stamina -= staminaCost;

        // Validation
        if (stamina < 0) {
            stamina = 0;
        }

        System.out.println("Character swings the sword. Stamina is now " + stamina + ".");

        // Trigger pass out event
        if (stamina == 0) {
            System.out.println("Your character needs to cool down.");
        }
    }

    // Reduce health when taking damage
    public void takeDamage(int damageAmount) {
        health -= damageAmount;

        // Validation: health must not go below zero
        if (health < 0) {
            health = 0;
        }

        System.out.println("Character takes " + damageAmount + " damage. Health is now " + health + ".");

        // Trigger death event
        if (health == 0) {
            System.out.println("Character is dead.");
        }
    }

    // Restore health and stamina to maximum
    public void rest() {
        health = maxHealth;
        stamina = maxStamina;

        System.out.println("Character has rested. Health and stamina restored to maximum.");
    }
}
