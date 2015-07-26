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
public class Email extends org.jooq.impl.TableImpl<opus.address.database.jooq.generated.tables.records.EmailRecord> {

	private static final long serialVersionUID = 1645710464;

	/**
	 * The reference instance of <code>email</code>
	 */
	public static final opus.address.database.jooq.generated.tables.Email Email = new opus.address.database.jooq.generated.tables.Email();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<opus.address.database.jooq.generated.tables.records.EmailRecord> getRecordType() {
		return opus.address.database.jooq.generated.tables.records.EmailRecord.class;
	}

	/**
	 * The column <code>email.email_id</code>.
	 */
	public final org.jooq.TableField<opus.address.database.jooq.generated.tables.records.EmailRecord, java.lang.Long> EmailId = createField("email_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

	/**
	 * The column <code>email.parent_id</code>.
	 */
	public final org.jooq.TableField<opus.address.database.jooq.generated.tables.records.EmailRecord, java.lang.Long> ParentId = createField("parent_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

	/**
	 * Create a <code>email</code> table reference
	 */
	public Email() {
		this("email", null);
	}

	/**
	 * Create an aliased <code>email</code> table reference
	 */
	public Email(java.lang.String alias) {
		this(alias, opus.address.database.jooq.generated.tables.Email.Email);
	}

	private Email(java.lang.String alias, org.jooq.Table<opus.address.database.jooq.generated.tables.records.EmailRecord> aliased) {
		this(alias, aliased, null);
	}

	private Email(java.lang.String alias, org.jooq.Table<opus.address.database.jooq.generated.tables.records.EmailRecord> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, opus.address.database.jooq.generated.DefaultSchema.DEFAULT_SCHEMA, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<opus.address.database.jooq.generated.tables.records.EmailRecord> getPrimaryKey() {
		return opus.address.database.jooq.generated.Keys.PK_EMAIL;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<opus.address.database.jooq.generated.tables.records.EmailRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<opus.address.database.jooq.generated.tables.records.EmailRecord>>asList(opus.address.database.jooq.generated.Keys.PK_EMAIL);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.ForeignKey<opus.address.database.jooq.generated.tables.records.EmailRecord, ?>> getReferences() {
		return java.util.Arrays.<org.jooq.ForeignKey<opus.address.database.jooq.generated.tables.records.EmailRecord, ?>>asList(opus.address.database.jooq.generated.Keys.EMAIL__FK_EMAIL_ENTITY_EMAIL_ID, opus.address.database.jooq.generated.Keys.EMAIL__FK_EMAIL_ENTITY_PARENT_ID);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public opus.address.database.jooq.generated.tables.Email as(java.lang.String alias) {
		return new opus.address.database.jooq.generated.tables.Email(alias, this);
	}

	/**
	 * Rename this table
	 */
	public opus.address.database.jooq.generated.tables.Email rename(java.lang.String name) {
		return new opus.address.database.jooq.generated.tables.Email(name, null);
	}
}
