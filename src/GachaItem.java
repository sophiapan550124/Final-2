/**
 *
 */
class GachaItem
{
    private String name;

    public GachaItem(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

// Subclass of GachaItem representing a weapon item
class WeaponItem extends GachaItem implements Usable {
    private int damage;

    public WeaponItem(String name, int damage) {
        super(name);
        this.damage = damage;
    }

    public int getDamage() {
        return damage;
    }

    @Override
    public void use() {
        System.out.println("Using " + getName());
        System.out.println("Causing " + damage + " damage");
    }
}


// Subclass of GachaItem representing an armor item
class ArmorItem extends GachaItem implements Usable {
    private int defense;

    public ArmorItem(String name, int defense) {
        super(name);
        this.defense = defense;
    }

    public int getDefense() {
        return defense;
    }

    @Override
    public void use() {
        System.out.println("Using " + getName());
        System.out.println("Providing " + defense + " defense");
    }
}