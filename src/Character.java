interface Character {
    void attack();
}

class Warrior implements Character {
    public void attack() {
        System.out.println("Воин рубит мечом");
    }
}

class Mage implements Character {
    public void attack() {
        System.out.println("Маг кастует огненный шар");
    }
}

class Archer implements Character { // Добавили третьего
    public void attack() {
        System.out.println("Лучник выпускает стрелу");
    }
}

// Фабрика персонажей
abstract class CharacterFactory {
    public abstract Character createCharacter();
}cx

class WarriorFactory extends CharacterFactory {
    public Character createCharacter() {
        return new Warrior();
    }
}

class MageFactory extends CharacterFactory {
    public Character createCharacter() {
        return new Mage();
    }
}

class ArcherFactory extends CharacterFactory {
    public Character createCharacter() {
        return new Archer();
    }
}
