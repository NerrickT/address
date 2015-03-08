/**
 * This class is generated by jOOQ
 */
package opus.address.database.jooq.generated.tables.pojos;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.5.1"
	},
	comments = "This class is generated by jOOQ"
)
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class EventsProjection implements java.io.Serializable {

	private static final long serialVersionUID = -1531362872;

	private final java.lang.Long     sequence;
	private final java.lang.String   event;
	private final java.lang.Integer  eventVersion;
	private final java.lang.String   codeVersion;
	private final java.lang.Long     actor;
	private final java.lang.String   tablesAffected;
	private final java.sql.Timestamp when;

	public EventsProjection(
		java.lang.Long     sequence,
		java.lang.String   event,
		java.lang.Integer  eventVersion,
		java.lang.String   codeVersion,
		java.lang.Long     actor,
		java.lang.String   tablesAffected,
		java.sql.Timestamp when
	) {
		this.sequence = sequence;
		this.event = event;
		this.eventVersion = eventVersion;
		this.codeVersion = codeVersion;
		this.actor = actor;
		this.tablesAffected = tablesAffected;
		this.when = when;
	}

	public java.lang.Long sequence() {
		return this.sequence;
	}

	public java.lang.String event() {
		return this.event;
	}

	public java.lang.Integer eventVersion() {
		return this.eventVersion;
	}

	public java.lang.String codeVersion() {
		return this.codeVersion;
	}

	public java.lang.Long actor() {
		return this.actor;
	}

	public java.lang.String tablesAffected() {
		return this.tablesAffected;
	}

	public java.sql.Timestamp when() {
		return this.when;
	}
}
