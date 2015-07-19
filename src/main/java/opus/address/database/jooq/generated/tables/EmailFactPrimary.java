/**
 * This class is generated by jOOQ
 */
package opus.address.database.jooq.generated.tables;

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
public class EmailFactPrimary extends org.jooq.impl.TableImpl<opus.address.database.jooq.generated.tables.records.EmailFactPrimary> {

	private static final long serialVersionUID = 484686664;

	/**
	 * The reference instance of <code>email_fact_primary</code>
	 */
	public static final opus.address.database.jooq.generated.tables.EmailFactPrimary EmailFactPrimary = new opus.address.database.jooq.generated.tables.EmailFactPrimary();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<opus.address.database.jooq.generated.tables.records.EmailFactPrimary> getRecordType() {
		return opus.address.database.jooq.generated.tables.records.EmailFactPrimary.class;
	}

	/**
	 * The column <code>email_fact_primary.sequence</code>.
	 */
	public final org.jooq.TableField<opus.address.database.jooq.generated.tables.records.EmailFactPrimary, java.lang.Long> Sequence = createField("sequence", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

	/**
	 * The column <code>email_fact_primary.email_id</code>.
	 */
	public final org.jooq.TableField<opus.address.database.jooq.generated.tables.records.EmailFactPrimary, java.lang.Long> EmailId = createField("email_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

	/**
	 * Create a <code>email_fact_primary</code> table reference
	 */
	public EmailFactPrimary() {
		this("email_fact_primary", null);
	}

	/**
	 * Create an aliased <code>email_fact_primary</code> table reference
	 */
	public EmailFactPrimary(java.lang.String alias) {
		this(alias, opus.address.database.jooq.generated.tables.EmailFactPrimary.EmailFactPrimary);
	}

	private EmailFactPrimary(java.lang.String alias, org.jooq.Table<opus.address.database.jooq.generated.tables.records.EmailFactPrimary> aliased) {
		this(alias, aliased, null);
	}

	private EmailFactPrimary(java.lang.String alias, org.jooq.Table<opus.address.database.jooq.generated.tables.records.EmailFactPrimary> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, opus.address.database.jooq.generated.DefaultSchema.DEFAULT_SCHEMA, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<opus.address.database.jooq.generated.tables.records.EmailFactPrimary> getPrimaryKey() {
		return opus.address.database.jooq.generated.Keys.PK_EMAIL_FACT_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<opus.address.database.jooq.generated.tables.records.EmailFactPrimary>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<opus.address.database.jooq.generated.tables.records.EmailFactPrimary>>asList(opus.address.database.jooq.generated.Keys.PK_EMAIL_FACT_PRIMARY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.ForeignKey<opus.address.database.jooq.generated.tables.records.EmailFactPrimary, ?>> getReferences() {
		return java.util.Arrays.<org.jooq.ForeignKey<opus.address.database.jooq.generated.tables.records.EmailFactPrimary, ?>>asList(opus.address.database.jooq.generated.Keys.EMAIL_FACT_PRIMARY__FK_EMAIL_FACT_PRIMARY_EVENT, opus.address.database.jooq.generated.Keys.EMAIL_FACT_PRIMARY__FK_EMAIL_FACT_PRIMARY_EMAIL);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public opus.address.database.jooq.generated.tables.EmailFactPrimary as(java.lang.String alias) {
		return new opus.address.database.jooq.generated.tables.EmailFactPrimary(alias, this);
	}

	/**
	 * Rename this table
	 */
	public opus.address.database.jooq.generated.tables.EmailFactPrimary rename(java.lang.String name) {
		return new opus.address.database.jooq.generated.tables.EmailFactPrimary(name, null);
	}
}
