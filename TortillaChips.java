public class TortillaChips {
    private Chip TortillaChip;
    public TortillaChips() {
        TortillaChip = new Chip();
    }
    
    public void salsa() {
       if (TortillaChip.Crunchiness > 1) 
       TortillaChip.Crunchiness -= 1;
       if (TortillaChip.Flavor < 5) 
       TortillaChip.Flavor += 1;
    }
    
    public void leaveOut() {
        TortillaChip.leaveOut();
    }

    public void putFlavor() {
        TortillaChip.putFlavor();
    }

    public void waterChip() {
        TortillaChip.waterChip();
    }
    
    public int getStaleness() {
        return TortillaChip.getStaleness();
    }

    public int getNutritionLevel() {
        return TortillaChip.getNutritionLevel();
    }
    
    public int getCrunchiness() {
        return TortillaChip.getCrunchiness();
    }

    public int getSaltiness() {
        return TortillaChip.getSaltiness();
    }

    public int getFlavor() {
        return TortillaChip.getFlavor();
    }
}
