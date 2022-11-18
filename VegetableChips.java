public class VegetableChips{
    private Chip VegetableChips;
    public VegetableChips() {
        VegetableChips = new Chip();
    }
    public void kale() {
       VegetableChips.Crunchiness = 4;
       VegetableChips.Saltiness = 3;
       VegetableChips.NutritionLevel = 5;
    }
    public void tomato() {
       VegetableChips.Saltiness = 4;
       VegetableChips.NutritionLevel = 5;
    }
    
    public void leaveOut() {
        VegetableChips.leaveOut();
    }

    public void putFlavor() {
        VegetableChips.putFlavor();
    }

    public void waterChip() {
        VegetableChips.waterChip();
    }
    
    public int getStaleness() {
        return VegetableChips.getStaleness();
    }

    public int getNutritionLevel() {
        return VegetableChips.getNutritionLevel();
    }
    
    public int getCrunchiness() {
        return VegetableChips.getCrunchiness();
    }

    public int getSaltiness() {
        return VegetableChips.getSaltiness();
    }

    public int getFlavor() {
        return VegetableChips.getFlavor();
    }
}
