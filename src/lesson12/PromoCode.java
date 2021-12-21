package lesson12;

public class PromoCode {
    private String code;
    private Boolean exp;

    public PromoCode(String code, Boolean exp) {
        this.code = code;
        this.exp = exp;
    }
    public Boolean isExpired() {
        return this.exp;
    }

    @Override
    public String toString() {
        return "PromoCode{" +
                "code='" + code + '\'' +
                ", exp=" + exp +
                '}';
    }
}
