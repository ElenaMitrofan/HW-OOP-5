public enum BodyType {
    SEDAN("Седан"),
    HETCHBEK("Хетчбек"),
    KUPE("Купе"),
    UNIVERSAL("Универсал"),
    VNEDOROZHNIK("Внедорожник"),
    KROSSOVER("Кроссовер"),
    PIKAP("Пикап"),
    FURGON("Фургон"),
    MINIVEN("Минивэн");
    private final String printBodyType;

    BodyType(String printBodyType) {
        this.printBodyType = printBodyType;
    }

    public String getPrintBodyType() {
        return printBodyType;
    }
}
