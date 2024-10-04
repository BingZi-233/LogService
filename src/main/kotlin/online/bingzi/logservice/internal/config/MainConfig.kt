package online.bingzi.logservice.internal.config

import taboolib.common.LifeCycle
import taboolib.common.platform.Awake
import taboolib.module.configuration.Config
import taboolib.module.configuration.Configuration

object MainConfig {
    @Config(value = "config.yml", autoReload = true)
    lateinit var config: Configuration
        private set

    @Awake(LifeCycle.ENABLE)
    fun load() {
    }

    @Awake(LifeCycle.ENABLE)
    fun registerAutoReload() {
        config.onReload { load() }
    }
}