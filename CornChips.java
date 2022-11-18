public class CornChips{
    private Chip CornChip;

    public CornChips() {
        CornChip = new Chip();
        CornChip.Saltiness = 6;
        CornChip.Flavor = 0;
        CornChip.NutritionLevel = 0;
    }
    
    public void leaveOut() {
        CornChip.leaveOut();
    }

    public void putFlavor() {
        CornChip.putFlavor();
    }

    public void waterChip() {
        CornChip.waterChip();
    }
    
    public int getStaleness() {
        return CornChip.getStaleness();
    }

    public int getNutritionLevel() {
        return CornChip.getNutritionLevel();
    }
    
    public int getCrunchiness() {
        return CornChip.getCrunchiness();
    }

    public int getSaltiness() {
        return CornChip.getSaltiness();
    }

    public int getFlavor() {
        return CornChip.getFlavor();
    }
}
