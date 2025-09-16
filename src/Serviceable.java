public interface Serviceable {
    void check();
}


/*void check() {
    System.out.println("Обслуживаем " + Transport.getModelName());
    for (int i = 0; i < Transport.getWheelsCount(); i++) {
        Transport.updateTyre();
    }
    if (Transport.getWheelsCount() >= 4) {
        Transport.checkEngine();
    }
    if (Transport.getWheelsCount() >=6 {
        Transport.checkTrailer();
    }*/
