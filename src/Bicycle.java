public class Bicycle extends Transport implements Serviceable {

    public Bicycle(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void check() {
        System.out.println("Обслуживаем велосипед " + this.getModelName());
        for (int i = 0; i < this.getWheelsCount(); i++) {
            this.updateTyre();
        }

    }
}