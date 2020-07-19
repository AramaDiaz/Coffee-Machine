// declare your enum here
enum Currency {
    USD ("United States dollar"),
    EUR ("Euro"),
    GBP ("Pound sterling"),
    RUB ("Russian ruble"),
    UAH ("Ukrainian hryvnia"),
    KZT ("Kazakhstani tenge"),
    CAD ("Canadian dollar"),
    JPY ("Japanese yen"),
    CNY ("Chinese yuan");

    private final String name;

    Currency (String s) {
        this.name = s;
    }

}