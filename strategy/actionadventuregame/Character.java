package actionadventuregame; 

interface WeaponBehavior{
    void useWeapon();
}

public abstract  class Character {
    WeaponBehavior weapon;  

    public void fight(){
        weapon.useWeapon();
    }
    
    public void setWeapon(WeaponBehavior w){
        this.weapon = w; 
    }
}


/* Behaviors */

class KnifeBehavior implements WeaponBehavior{

    @Override
    public void useWeapon() {
        System.out.println("Use knife for damage!!");
    }

}

class BowAndArrowBehavior implements WeaponBehavior{

    @Override
    public void useWeapon() {
        System.out.println("Use long range weapon Bow and Arrow");
    }
}

class AxeBehavior implements WeaponBehavior{

    @Override
    public void useWeapon() {
        System.out.println("Use heavy weapon Axe. !! one shot kill");
    }
}


class SwordBehavior implements WeaponBehavior{

    @Override
    public void useWeapon() {
        System.out.println("Use swoard rapid damage weapon, !! require agility");
    }

}