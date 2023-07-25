package org.example;

public class Animal {
    // properties all animals have
      // exterior/skin   -> String
      // number of limbs  -> int
      // eyes?  -> hasEyes -> boolean
      //        -> isBlind -> boolean
      // warm-blooded/cold-blooded  / exothermic/endothermic    -> endothermic -> boolean
      // weight -> double
      // health status -> isInjured -> boolean

      private String exterior;
      private int numLimbs;
      private boolean hasEyes, isBlind, endothermic, isInjured;
      private double weight;

      public Animal(String exterior, int numLimbs, boolean hasEyes, boolean isBlind, boolean endothermic, double weight) {
          this.exterior = exterior;
          this.numLimbs = numLimbs;
          this.hasEyes = hasEyes;
          this.isBlind = isBlind;
          this.endothermic = endothermic;
          this.weight = weight;
          this.isInjured = false;
      }

      // instance methods
    // eat, sleep, fight

    public void eat() {
          // in our example, all animals will eat a percentage of their weight
          // weight will increase by .5% when they eat
        double amountIncrease = this.weight * .005;
        this.weight += amountIncrease;

        System.out.println("Yummmmmmmmm... that was tasty!");
    }

    public void sleep() {
          double amountDecrease = this.weight * .0025;
          this.weight -= amountDecrease;

        System.out.println("ZZZZZzzzzZZZzzzzZZZzzzzZZZZZ");
    }

    public void breathe() {
        System.out.println("Ahhh, a refreshing breath");
    }

    public void fight(Animal otherAnimal) {
          // what if both animals are injured to begin with
          if (otherAnimal.getIsInjured() || this.isInjured) {
              System.out.println("Hey.... let's not do this today.");
          } else if (!otherAnimal.getIsInjured() && !this.isInjured) {
              // check to see if other is now injured
              if (Math.random() < .5) {
                  otherAnimal.setIsInjured(true);
              }
              // check to see if 'this' animal is injured
              if (Math.random() < .5) {
                  this.setIsInjured(true);
              }

              if (otherAnimal.getIsInjured() && this.isInjured) {
                  System.out.println("it was a draw");
              } else if (otherAnimal.getIsInjured()) {
                  System.out.println("This animal is the champ");
              } else if (this.isInjured){
                  System.out.println("The other animal is the champ!");
              } else {
                  System.out.println("undecided.. overtime!");
              }

          }
    }


    public String getExterior() {
        return exterior;
    }

    public void setExterior(String exterior) {
        this.exterior = exterior;
    }

    public int getNumLimbs() {
        return numLimbs;
    }

    public void setNumLimbs(int numLimbs) {
        this.numLimbs = numLimbs;
    }

    public boolean getHasEyes() {
        return hasEyes;
    }

    public void setHasEyes(boolean hasEyes) {
        this.hasEyes = hasEyes;
    }

    public boolean getIsBlind() {
        return isBlind;
    }

    public void setIsBlind(boolean blind) {
        isBlind = blind;
    }

    public boolean getIsEndothermic() {
        return endothermic;
    }

    public void setEndothermic(boolean endothermic) {
        this.endothermic = endothermic;
    }

    public boolean getIsInjured() {
        return isInjured;
    }

    public void setIsInjured(boolean injured) {
        isInjured = injured;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
