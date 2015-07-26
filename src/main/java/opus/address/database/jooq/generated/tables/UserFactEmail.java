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
public class UserFactEmail extends org.jooq.impl.TableImpl<opus.address.database.jooq.generated.tables.records.UserFactEmailRecord> {

	private static final long serialVersionUID = 2068019824;

	/**
	 * The reference instance of <code>user_fact_email</code>
	 */
	public static final opus.address.database.jooq.generated.tables.UserFactEmail UserFactEmail = new opus.address.database.jooq.generated.tables.UserFactEmail();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<opus.address.database.jooq.generated.tables.records.UserFactEmailRecord> getRecordType() {
		return opus.address.database.jooq.generated.tables.records.UserFactEmailRecord.class;
	}

	/**
	 * The column <code>user_fact_email.sequence</code>.
	 */
	public final org.jooq.TableField<opus.address.database.jooq.generated.tables.records.UserFactEmailRecord, java.lang.Long> Sequence = createField("sequence", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

	/**
	 * The column <code>user_fact_email.user_id</code>.
	 */
	public final org.jooq.TableField<opus.address.database.jooq.generated.tables.records.UserFactEmailRecord, java.lang.Long> UserId = createField("user_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

	/**
	 * The column <code>user_fact_email.email</code>.
	 */
	public final org.jooq.TableField<opus.address.database.jooq.generated.tables.records.UserFactEmailRecord, java.lang.String> Email = createField("email", org.jooq.impl.SQLDataType.CLOB.nullable(false), this, "");

	/**
	 * Create a <code>user_fact_email</code> table reference
	 */
	public UserFactEmail() {
		this("user_fact_email", null);
	}

	/**
	 * Create an aliased <code>user_fact_email</code> table reference
	 */
	public UserFactEmail(java.lang.String alias) {
		this(alias, opus.address.database.jooq.generated.tables.UserFactEmail.UserFactEmail);
	}

	private UserFactEmail(java.lang.String alias, org.jooq.Table<opus.address.database.jooq.generated.tables.records.UserFactEmailRecord> aliased) {
		this(alias, aliased, null);
	}

	private UserFactEmail(java.lang.String alias, org.jooq.Table<opus.address.database.jooq.generated.tables.records.UserFactEmailRecord> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, opus.address.database.jooq.generated.DefaultSchema.DEFAULT_SCHEMA, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<opus.address.database.jooq.generated.tables.records.UserFactEmailRecord> getPrimaryKey() {
		return opus.address.database.jooq.generated.Keys.PK_USER_FACT_EMAIL_SEQUENCE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<opus.address.database.jooq.generated.tables.records.UserFactEmailRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<opus.address.database.jooq.generated.tables.records.UserFactEmailRecord>>asList(opus.address.database.jooq.generated.Keys.PK_USER_FACT_EMAIL_SEQUENCE);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.ForeignKey<opus.address.database.jooq.generated.tables.records.UserFactEmailRecord, ?>> getReferences() {
		return java.util.Arrays.<org.jooq.ForeignKey<opus.address.database.jooq.generated.tables.records.UserFactEmailRecord, ?>>asList(opus.address.database.jooq.generated.Keys.USER_FACT_EMAIL__FK_USER_FACT_EMAIL_EVENT, opus.address.database.jooq.generated.Keys.USER_FACT_EMAIL__FK_USER_FACT_EMAIL_USER);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public opus.address.database.jooq.generated.tables.UserFactEmail as(java.lang.String alias) {
		return new opus.address.database.jooq.generated.tables.UserFactEmail(alias, this);
	}

	/**
	 * Rename this table
	 */
	public opus.address.database.jooq.generated.tables.UserFactEmail rename(java.lang.String name) {
		return new opus.address.database.jooq.generated.tables.UserFactEmail(name, null);
	}
}
