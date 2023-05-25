/**
 * GachaItem constructor that holds gacha item
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
class FoodItem extends GachaItem implements Usable {
    private int hunger;

    public FoodItem(String name, int hunger) {
        super(name);
        this.hunger = hunger;
    }

    @Override
    public void use() {
        System.out.println("Checking " + getName());
        System.out.println("Satisfies " + hunger + " hunger");
    }
}


// Subclass of GachaItem representing an armor item
class BevItem extends GachaItem implements Usable {
    private int bev;

    public BevItem(String name, int bev) {
        super(name);
        this.bev = bev;
    }

    @Override
    public void use() {
        System.out.println("Checking " + getName());
        System.out.println("Quenching " + bev + " thirst");
    }
}