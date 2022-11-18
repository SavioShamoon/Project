public class Chip {
    protected int Staleness;
    protected int NutritionLevel;
    protected int Crunchiness;
    protected int Saltiness;
    protected int Flavor;
    
    public Chip() {
        Staleness = 1;
        NutritionLevel = 5;
        Crunchiness = 3;
        Flavor = 1;
    }
    
    public void leaveOut() {
        if (this.Staleness < 5) 
        this.Staleness += 1;
        if (this.NutritionLevel > 1) 
        this.NutritionLevel -= 1;
        if (this.Crunchiness < 5) 
        this.Crunchiness +=1;
    }

    public void putFlavor() {
        if (this.NutritionLevel < 5) 
        this.NutritionLevel -= 1;
        if (this.Flavor < 5) 
        this.Flavor += 1;
        if (this.Saltiness < 5) 
        this.Saltiness += 1;
    }

    public void waterChip() {
        this.Crunchiness = 1;
    }

    public void fry() {
       if (this.Crunchiness < 5) this.Crunchiness += 1;
       if (this.NutritionLevel > 1) this.NutritionLevel -= 1;
    }

    public int getStaleness() {
        return this.Staleness;
    }

    public int getNutritionLevel() {
        return this.NutritionLevel;
    }
    
    public int getCrunchiness() {
        return this.Crunchiness;
    }

    public int getSaltiness() {
        return this.Saltiness;
    }

    public int getFlavor() {
        return this.Flavor;
    }
}
