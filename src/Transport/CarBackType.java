package Transport;

public enum CarBackType {
    SEDAN("Седан"),
    HATCHBACK("Хэтчбэк"),
    COUPE("Купе"),
    UNIVERSAL("Универсал"),
    SUV("Внедорожник"),
    CROSSOVER("Кроссовер"),
    PICKUP("Пикап"),
    VEN("Фургон"),
    MINI_VEM("Минивен");
    private final String backType;

    CarBackType(String backType) {
        this.backType = backType;
    }

    public String getBackType() {
        return backType;
    }
}