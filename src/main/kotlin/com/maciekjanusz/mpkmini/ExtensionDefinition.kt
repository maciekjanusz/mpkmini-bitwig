package com.maciekjanusz.mpkmini

import com.bitwig.extension.api.PlatformType
import com.bitwig.extension.controller.AutoDetectionMidiPortNamesList
import com.bitwig.extension.controller.ControllerExtensionDefinition
import com.bitwig.extension.controller.api.ControllerHost
import java.util.*

const val VERSION = "0.1"
const val DRIVER_ID = "3fc3ad92-b27e-40cf-9a06-517436211327"

class ExtensionDefinition : ControllerExtensionDefinition() {

    override fun getRequiredAPIVersion() = 5

    override fun getNumMidiInPorts() = 1

    override fun getNumMidiOutPorts() = 1

    override fun getName() = "MPK Mini mkII"

    override fun getHardwareModel() = name

    override fun getHardwareVendor() = "AKAI"

    override fun getVersion() = VERSION

    override fun getId() = UUID.fromString(DRIVER_ID)

    override fun getAuthor() = "Maciej Janusz"

    override fun createInstance(host: ControllerHost) = Extension(this, host)

    override fun listAutoDetectionMidiPortNames(list: AutoDetectionMidiPortNamesList, platformType: PlatformType) {
        when (platformType) {
            PlatformType.WINDOWS -> TODO("not implemented")
            PlatformType.LINUX -> TODO("not implemented")
            PlatformType.MAC -> TODO("not implemented")
        }
    }
}