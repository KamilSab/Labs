package Construction;

public class ConstructionImpl implements Construction{

    @Override
    public void startConstruction() {
        System.out.println("Строительство началось");
    }

    @Override
    public void finishConstruction() {
        System.out.println("Строительство закончилось");
    }
}
