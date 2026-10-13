package arupdemo.core;

/** Small test-only model used to evaluate DCode architecture compliance. */
public final class SampleRecord {
    private final String value;

    public SampleRecord(String value) {
        this.value = value;
    }

    public String value() {
        return value;
    }
}
