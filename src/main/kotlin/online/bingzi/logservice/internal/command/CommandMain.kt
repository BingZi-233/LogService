package online.bingzi.logservice.internal.command

import taboolib.common.platform.command.CommandBody
import taboolib.common.platform.command.CommandHeader
import taboolib.common.platform.command.PermissionDefault
import taboolib.common.platform.command.subCommand

@CommandHeader(
    name = "logService",
    aliases = ["log"],
    permission = "logService.command.use",
    permissionDefault = PermissionDefault.OP
)
object CommandMain {
    @CommandBody
    val upload = subCommand {

    }

    @CommandBody
    val set = subCommand {

    }

    @CommandBody
    val old = subCommand {

    }
}