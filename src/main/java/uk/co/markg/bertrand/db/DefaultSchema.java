/*
 * This file is generated by jOOQ.
 */
package uk.co.markg.bertrand.db;


import java.util.Arrays;
import java.util.List;

import org.jooq.Catalog;
import org.jooq.Table;
import org.jooq.impl.SchemaImpl;

import uk.co.markg.bertrand.db.tables.Channels;
import uk.co.markg.bertrand.db.tables.Messages;
import uk.co.markg.bertrand.db.tables.Users;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class DefaultSchema extends SchemaImpl {

    private static final long serialVersionUID = -400102062;

    /**
     * The reference instance of <code>DEFAULT_SCHEMA</code>
     */
    public static final DefaultSchema DEFAULT_SCHEMA = new DefaultSchema();

    /**
     * The table <code>channels</code>.
     */
    public final Channels CHANNELS = Channels.CHANNELS;

    /**
     * The table <code>messages</code>.
     */
    public final Messages MESSAGES = Messages.MESSAGES;

    /**
     * The table <code>users</code>.
     */
    public final Users USERS = Users.USERS;

    /**
     * No further instances allowed
     */
    private DefaultSchema() {
        super("", null);
    }


    @Override
    public Catalog getCatalog() {
        return DefaultCatalog.DEFAULT_CATALOG;
    }

    @Override
    public final List<Table<?>> getTables() {
        return Arrays.<Table<?>>asList(
            Channels.CHANNELS,
            Messages.MESSAGES,
            Users.USERS);
    }
}
