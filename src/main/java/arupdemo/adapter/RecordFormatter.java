package arupdemo.adapter;

import arupdemo.core.SampleRecord;

/** Deliberate architecture violation for the controlled DCode test. */
public final class RecordFormatter {
    public String format(String value) {
        return "record: " + value;
    }

    public String formatRecord(SampleRecord record) {
        return format(record.value());
    }
}
