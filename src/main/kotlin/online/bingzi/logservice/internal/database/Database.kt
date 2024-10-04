package online.bingzi.logservice.internal.database

import com.j256.ormlite.jdbc.DataSourceConnectionSource
import com.j256.ormlite.jdbc.db.SqliteDatabaseType
import com.zaxxer.hikari.HikariConfig
import com.zaxxer.hikari.HikariDataSource
import taboolib.common.env.RuntimeDependencies
import taboolib.common.env.RuntimeDependency


@RuntimeDependencies(
    RuntimeDependency(value = "com.j256.ormlite:ormlite-core:6.1"),
    RuntimeDependency(value = "com.j256.ormlite:ormlite-jdbc:6.1"),
    RuntimeDependency(value = "org.xerial:sqlite-jdbc:3.46.1.3"),
    RuntimeDependency(value = "com.zaxxer:HikariCP:5.1.0"),
    RuntimeDependency(value = "mysql:mysql-connector-java:8.0.33")
)
object Database {
    private val hikariConfig = HikariConfig().apply {
        jdbcUrl = DatabaseType.jdbcUrl
    }
    private val dataSource = HikariDataSource(hikariConfig)
    private val connectionSource = DataSourceConnectionSource(dataSource, SqliteDatabaseType())

}