package arupdemo.adapter;

/** Baseline formatter with no dependency on the test model component. */
public final class RecordFormatter {
    public String format(String value) {
        return "record: " + value;
    }
}
