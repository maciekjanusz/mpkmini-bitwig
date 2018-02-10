package com.maciekjanusz.mpkmini

import com.bitwig.extension.api.PlatformType
import com.bitwig.extension.controller.AutoDetectionMidiPortNamesList
import com.bitwig.extension.controller.ControllerExtensionDefinition
import com.bitwig.extension.controller.api.ControllerHost
import java.util.*

class ExtensionDefinition : ControllerExtensionDefinition() {

    override fun getRequiredAPIVersion() = REQUIRED_API

    override fun getNumMidiInPorts() = MIDI_PORTS

    override fun getNumMidiOutPorts() = MIDI_PORTS

    override fun getName() = NAME

    override fun getHardwareModel() = MODEL

    override fun getHardwareVendor() = VENDOR

    override fun getVersion() = VERSION

    override fun getId() = UUID.fromString(DRIVER_ID)

    override fun getAuthor() = AUTHOR

    override fun createInstance(host: ControllerHost) = Extension(this, host)

    override fun listAutoDetectionMidiPortNames(list: AutoDetectionMidiPortNamesList, platformType: PlatformType) {
        // no auto detection
    }
}