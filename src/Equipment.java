interface Weapon {
    void info(); }
interface Armor {
    void info(); }
interface Accessory {
    void info(); }

// Средневековье
class Sword implements Weapon {
    public void info() {
    System.out.println("Оружие: Двуручный меч");
} }
class IronPlate implements Armor {
    public void info() {
    System.out.println("Броня: Стальной панцирь");
} }
class Shield implements Accessory { public void info() {
    System.out.println("Аксессуар: Рыцарский щит");
} }

// Маги
class Staff implements Weapon {
    public void info() {
        System.out.println("Оружие: Посох Мудрости");
    } }

class Robe implements Armor { public void info() {
    System.out.println("Броня: Шелковая роба"); } }

class Amulet implements Accessory { public void info() {
    System.out.println("Аксессуар: Магический амулет"); } }

// Следопыт
class Bow implements Weapon { public void info() {
    System.out.println("Оружие: Длинный лук"); } }

class LeatherArmor implements Armor {
    public void info() {
        System.out.println("Броня: Кожаная куртка"); } }

class Quiver implements Accessory { public void info() {
    System.out.println("Аксессуар: Колчан со стрелами"); } }

// Абстрактная фабрика (теперь создает 3 связанных предмета)
interface EquipmentFactory {
    Weapon createWeapon();
    Armor createArmor();
    Accessory createAccessory();
}

class MedievalEquipmentFactory implements EquipmentFactory {
    public Weapon createWeapon() {
        return new Sword(); }
    public Armor createArmor() {
        return new IronPlate();
    }
    public Accessory createAccessory() {
        return new Shield();
    }
}

class MagicEquipmentFactory implements EquipmentFactory {
    public Weapon createWeapon() {
        return new Staff(); }

    public Armor createArmor() {
        return new Robe(); }

    public Accessory createAccessory() {
        return new Amulet(); }
}

class RangerEquipmentFactory implements EquipmentFactory {
    public Weapon createWeapon() {
        return new Bow();
    }

    public Armor createArmor() {
        return new LeatherArmor();
    }
    public Accessory createAccessory() {
        return new Quiver();
    }
}
