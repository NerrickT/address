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
public class AddressProjection implements java.io.Serializable {

	private static final long serialVersionUID = 1944064567;

	private final java.lang.Long addressId;
	private final java.lang.Long parentId;

	public AddressProjection(
		java.lang.Long addressId,
		java.lang.Long parentId
	) {
		this.addressId = addressId;
		this.parentId = parentId;
	}

	public java.lang.Long addressId() {
		return this.addressId;
	}

	public java.lang.Long parentId() {
		return this.parentId;
	}
}
