package lesson7;

public class LocalExample {
    private int outerField;

    void methodWithLocalClass(final int param) {
        class InnerClass {
            int getOuterField() {
                return LocalExample.this.outerField;
            }
            int getParam() {
                return param;
            }
        }
    }
}
