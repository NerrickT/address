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
public class PersonFactFirstNameProjection implements java.io.Serializable {

	private static final long serialVersionUID = 889406150;

	private final java.lang.Long   sequence;
	private final java.lang.Long   entityId;
	private final java.lang.String firstName;

	public PersonFactFirstNameProjection(
		java.lang.Long   sequence,
		java.lang.Long   entityId,
		java.lang.String firstName
	) {
		this.sequence = sequence;
		this.entityId = entityId;
		this.firstName = firstName;
	}

	public java.lang.Long sequence() {
		return this.sequence;
	}

	public java.lang.Long entityId() {
		return this.entityId;
	}

	public java.lang.String firstName() {
		return this.firstName;
	}
}
