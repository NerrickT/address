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
public class EmailsFactsDomain extends org.jooq.impl.TableImpl<opus.address.database.jooq.generated.tables.records.EmailsFactsDomain> {

	private static final long serialVersionUID = -1065374133;

	/**
	 * The reference instance of <code>emails_facts_domain</code>
	 */
	public static final opus.address.database.jooq.generated.tables.EmailsFactsDomain EmailsFactsDomain = new opus.address.database.jooq.generated.tables.EmailsFactsDomain();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<opus.address.database.jooq.generated.tables.records.EmailsFactsDomain> getRecordType() {
		return opus.address.database.jooq.generated.tables.records.EmailsFactsDomain.class;
	}

	/**
	 * The column <code>emails_facts_domain.sequence</code>.
	 */
	public final org.jooq.TableField<opus.address.database.jooq.generated.tables.records.EmailsFactsDomain, java.lang.Long> Sequence = createField("sequence", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

	/**
	 * The column <code>emails_facts_domain.email_id</code>.
	 */
	public final org.jooq.TableField<opus.address.database.jooq.generated.tables.records.EmailsFactsDomain, java.lang.Long> EmailId = createField("email_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

	/**
	 * The column <code>emails_facts_domain.domain</code>.
	 */
	public final org.jooq.TableField<opus.address.database.jooq.generated.tables.records.EmailsFactsDomain, java.lang.String> Domain = createField("domain", org.jooq.impl.SQLDataType.CLOB.nullable(false), this, "");

	/**
	 * Create a <code>emails_facts_domain</code> table reference
	 */
	public EmailsFactsDomain() {
		this("emails_facts_domain", null);
	}

	/**
	 * Create an aliased <code>emails_facts_domain</code> table reference
	 */
	public EmailsFactsDomain(java.lang.String alias) {
		this(alias, opus.address.database.jooq.generated.tables.EmailsFactsDomain.EmailsFactsDomain);
	}

	private EmailsFactsDomain(java.lang.String alias, org.jooq.Table<opus.address.database.jooq.generated.tables.records.EmailsFactsDomain> aliased) {
		this(alias, aliased, null);
	}

	private EmailsFactsDomain(java.lang.String alias, org.jooq.Table<opus.address.database.jooq.generated.tables.records.EmailsFactsDomain> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, opus.address.database.jooq.generated.DefaultSchema.DEFAULT_SCHEMA, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<opus.address.database.jooq.generated.tables.records.EmailsFactsDomain> getPrimaryKey() {
		return opus.address.database.jooq.generated.Keys.PK_EMAILS_FACTS_DOMAIN;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<opus.address.database.jooq.generated.tables.records.EmailsFactsDomain>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<opus.address.database.jooq.generated.tables.records.EmailsFactsDomain>>asList(opus.address.database.jooq.generated.Keys.PK_EMAILS_FACTS_DOMAIN);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.ForeignKey<opus.address.database.jooq.generated.tables.records.EmailsFactsDomain, ?>> getReferences() {
		return java.util.Arrays.<org.jooq.ForeignKey<opus.address.database.jooq.generated.tables.records.EmailsFactsDomain, ?>>asList(opus.address.database.jooq.generated.Keys.EMAILS_FACTS_DOMAIN__FK_EMAILS_FACTS_DOMAIN_EVENTS, opus.address.database.jooq.generated.Keys.EMAILS_FACTS_DOMAIN__FK_EMAILS_FACTS_DOMAIN_EMAILS);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public opus.address.database.jooq.generated.tables.EmailsFactsDomain as(java.lang.String alias) {
		return new opus.address.database.jooq.generated.tables.EmailsFactsDomain(alias, this);
	}

	/**
	 * Rename this table
	 */
	public opus.address.database.jooq.generated.tables.EmailsFactsDomain rename(java.lang.String name) {
		return new opus.address.database.jooq.generated.tables.EmailsFactsDomain(name, null);
	}
}
