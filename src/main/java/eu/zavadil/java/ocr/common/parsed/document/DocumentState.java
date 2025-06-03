package eu.zavadil.java.ocr.common.parsed.document;

public enum DocumentState {
	Waiting(Severity.warn),
	Processed(Severity.ok),
	Synchronized(Severity.ok),
	NoImage(Severity.error),
	NoTemplate(Severity.error),
	Error(Severity.error);

	public enum Severity {
		ok,
		warn,
		error
	}

	private final Severity severity;

	public Severity getSeverity() {
		return this.severity;
	}

	DocumentState(Severity severity) {
		this.severity = severity;
	}
}
