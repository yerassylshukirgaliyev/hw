public class Main {
    public static void main(String[] args) {
        System.out.println("- Создание персонажа и снаряжения");

        // маг и набор
        CharacterFactory mFactory = new MageFactory();
        EquipmentFactory equipFactory = new MagicEquipmentFactory();

        Character myHero = mFactory.createCharacter();
        Weapon myWeapon = equipFactory.createWeapon();
        Armor myArmor = equipFactory.createArmor();
        Accessory myAccessory = equipFactory.createAccessory();

        System.out.println("Герой готов:");
        myHero.attack();
        myWeapon.info();
        myArmor.info();
        myAccessory.info();

        System.out.println("- Другой пример");

        // лучник и следопыт
        CharacterFactory archerFact = new ArcherFactory();
        git remote add origin https://github.com/yerassylshukirgaliyev/hw.git EquipmentFactory rangerEquip = new RangerEquipmentFactory();

        Character myArcher = archerFact.createCharacter();
        System.out.println("Герой готов:");
        myArcher.attack();
        rangerEquip.createWeapon().info();
        rangerEquip.createArmor().info();
        rangerEquip.createAccessory().info();
    }
}
