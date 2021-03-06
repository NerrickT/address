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
public class PersonFactFirstName extends org.jooq.impl.TableImpl<opus.address.database.jooq.generated.tables.records.PersonFactFirstNameRecord> {

	private static final long serialVersionUID = 1396721736;

	/**
	 * The reference instance of <code>person_fact_first_name</code>
	 */
	public static final opus.address.database.jooq.generated.tables.PersonFactFirstName PersonFactFirstName = new opus.address.database.jooq.generated.tables.PersonFactFirstName();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<opus.address.database.jooq.generated.tables.records.PersonFactFirstNameRecord> getRecordType() {
		return opus.address.database.jooq.generated.tables.records.PersonFactFirstNameRecord.class;
	}

	/**
	 * The column <code>person_fact_first_name.sequence</code>.
	 */
	public final org.jooq.TableField<opus.address.database.jooq.generated.tables.records.PersonFactFirstNameRecord, java.lang.Long> Sequence = createField("sequence", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

	/**
	 * The column <code>person_fact_first_name.entity_id</code>.
	 */
	public final org.jooq.TableField<opus.address.database.jooq.generated.tables.records.PersonFactFirstNameRecord, java.lang.Long> EntityId = createField("entity_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

	/**
	 * The column <code>person_fact_first_name.first_name</code>.
	 */
	public final org.jooq.TableField<opus.address.database.jooq.generated.tables.records.PersonFactFirstNameRecord, java.lang.String> FirstName = createField("first_name", org.jooq.impl.SQLDataType.CLOB.nullable(false), this, "");

	/**
	 * Create a <code>person_fact_first_name</code> table reference
	 */
	public PersonFactFirstName() {
		this("person_fact_first_name", null);
	}

	/**
	 * Create an aliased <code>person_fact_first_name</code> table reference
	 */
	public PersonFactFirstName(java.lang.String alias) {
		this(alias, opus.address.database.jooq.generated.tables.PersonFactFirstName.PersonFactFirstName);
	}

	private PersonFactFirstName(java.lang.String alias, org.jooq.Table<opus.address.database.jooq.generated.tables.records.PersonFactFirstNameRecord> aliased) {
		this(alias, aliased, null);
	}

	private PersonFactFirstName(java.lang.String alias, org.jooq.Table<opus.address.database.jooq.generated.tables.records.PersonFactFirstNameRecord> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, opus.address.database.jooq.generated.DefaultSchema.DEFAULT_SCHEMA, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<opus.address.database.jooq.generated.tables.records.PersonFactFirstNameRecord> getPrimaryKey() {
		return opus.address.database.jooq.generated.Keys.PK_PERSON_FACT_FIRST_NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<opus.address.database.jooq.generated.tables.records.PersonFactFirstNameRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<opus.address.database.jooq.generated.tables.records.PersonFactFirstNameRecord>>asList(opus.address.database.jooq.generated.Keys.PK_PERSON_FACT_FIRST_NAME);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.ForeignKey<opus.address.database.jooq.generated.tables.records.PersonFactFirstNameRecord, ?>> getReferences() {
		return java.util.Arrays.<org.jooq.ForeignKey<opus.address.database.jooq.generated.tables.records.PersonFactFirstNameRecord, ?>>asList(opus.address.database.jooq.generated.Keys.PERSON_FACT_FIRST_NAME__FK_PERSON_FACT_FIRST_NAME_EVENT, opus.address.database.jooq.generated.Keys.PERSON_FACT_FIRST_NAME__FK_PERSON_FACT_FIRST_NAME_PERSON);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public opus.address.database.jooq.generated.tables.PersonFactFirstName as(java.lang.String alias) {
		return new opus.address.database.jooq.generated.tables.PersonFactFirstName(alias, this);
	}

	/**
	 * Rename this table
	 */
	public opus.address.database.jooq.generated.tables.PersonFactFirstName rename(java.lang.String name) {
		return new opus.address.database.jooq.generated.tables.PersonFactFirstName(name, null);
	}
}
