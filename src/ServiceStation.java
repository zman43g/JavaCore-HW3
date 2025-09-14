interface ServiceStation {
    public default void check(Transport transport) {
        System.out.println("Обслуживаем " + transport.getModelName());
        for (int i = 0; i < transport.getWheelsCount(); i++) {
            transport.updateTyre();
        }// можно было сделать проверку по количеству колес, было бы равносильно
        if (transport.getClass() == Car.class || transport.getClass() == Truck.class) {
            transport.checkEngine();
        }
        if (transport.getClass() == Truck.class) {
            transport.checkTrailer();
        }

    }
}


