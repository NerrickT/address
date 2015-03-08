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
public class UsersFactsUsername extends org.jooq.impl.TableImpl<opus.address.database.jooq.generated.tables.records.UsersFactsUsername> {

	private static final long serialVersionUID = 1232405165;

	/**
	 * The reference instance of <code>users_facts_username</code>
	 */
	public static final opus.address.database.jooq.generated.tables.UsersFactsUsername UsersFactsUsername = new opus.address.database.jooq.generated.tables.UsersFactsUsername();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<opus.address.database.jooq.generated.tables.records.UsersFactsUsername> getRecordType() {
		return opus.address.database.jooq.generated.tables.records.UsersFactsUsername.class;
	}

	/**
	 * The column <code>users_facts_username.sequence</code>.
	 */
	public final org.jooq.TableField<opus.address.database.jooq.generated.tables.records.UsersFactsUsername, java.lang.Long> Sequence = createField("sequence", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

	/**
	 * The column <code>users_facts_username.user_id</code>.
	 */
	public final org.jooq.TableField<opus.address.database.jooq.generated.tables.records.UsersFactsUsername, java.lang.Long> UserId = createField("user_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

	/**
	 * The column <code>users_facts_username.username</code>.
	 */
	public final org.jooq.TableField<opus.address.database.jooq.generated.tables.records.UsersFactsUsername, java.lang.String> Username = createField("username", org.jooq.impl.SQLDataType.CLOB.nullable(false), this, "");

	/**
	 * Create a <code>users_facts_username</code> table reference
	 */
	public UsersFactsUsername() {
		this("users_facts_username", null);
	}

	/**
	 * Create an aliased <code>users_facts_username</code> table reference
	 */
	public UsersFactsUsername(java.lang.String alias) {
		this(alias, opus.address.database.jooq.generated.tables.UsersFactsUsername.UsersFactsUsername);
	}

	private UsersFactsUsername(java.lang.String alias, org.jooq.Table<opus.address.database.jooq.generated.tables.records.UsersFactsUsername> aliased) {
		this(alias, aliased, null);
	}

	private UsersFactsUsername(java.lang.String alias, org.jooq.Table<opus.address.database.jooq.generated.tables.records.UsersFactsUsername> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, opus.address.database.jooq.generated.DefaultSchema.DEFAULT_SCHEMA, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<opus.address.database.jooq.generated.tables.records.UsersFactsUsername> getPrimaryKey() {
		return opus.address.database.jooq.generated.Keys.PK_USERS_FACTS_USERNAME_SEQUENCE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<opus.address.database.jooq.generated.tables.records.UsersFactsUsername>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<opus.address.database.jooq.generated.tables.records.UsersFactsUsername>>asList(opus.address.database.jooq.generated.Keys.PK_USERS_FACTS_USERNAME_SEQUENCE);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.ForeignKey<opus.address.database.jooq.generated.tables.records.UsersFactsUsername, ?>> getReferences() {
		return java.util.Arrays.<org.jooq.ForeignKey<opus.address.database.jooq.generated.tables.records.UsersFactsUsername, ?>>asList(opus.address.database.jooq.generated.Keys.USERS_FACTS_USERNAME__FK_USERS_FACTS_USERNAME_EVENTS, opus.address.database.jooq.generated.Keys.USERS_FACTS_USERNAME__FK_USERS_FACTS_USERNAME_USERS);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public opus.address.database.jooq.generated.tables.UsersFactsUsername as(java.lang.String alias) {
		return new opus.address.database.jooq.generated.tables.UsersFactsUsername(alias, this);
	}

	/**
	 * Rename this table
	 */
	public opus.address.database.jooq.generated.tables.UsersFactsUsername rename(java.lang.String name) {
		return new opus.address.database.jooq.generated.tables.UsersFactsUsername(name, null);
	}
}
