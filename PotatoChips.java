public class PotatoChips {
    private Chip PotatoChip;

    public PotatoChips() {
        PotatoChip = new Chip();
        PotatoChip.Saltiness = 3;
    }

    public void frenchOnionDip() {
        if (PotatoChip.Flavor < 3) PotatoChip.Flavor += 3;
    }
    
    public void leaveOut() {
        PotatoChip.leaveOut();
    }

    public void putFlavor() {
        PotatoChip.putFlavor();
    }

    public void waterChip() {
        PotatoChip.waterChip();
    }
    
    public int getStaleness() {
        return PotatoChip.getStaleness();
    }

    public int getNutritionLevel() {
        return PotatoChip.getNutritionLevel();
    }
    
    public int getCrunchiness() {
        return PotatoChip.getCrunchiness();
    }

    public int getSaltiness() {
        return PotatoChip.getSaltiness();
    }

    public int getFlavor() {
        return PotatoChip.getFlavor();
    }
}
