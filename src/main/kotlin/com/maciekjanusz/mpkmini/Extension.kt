package com.maciekjanusz.mpkmini

import com.bitwig.extension.controller.ControllerExtension
import com.bitwig.extension.controller.ControllerExtensionDefinition
import com.bitwig.extension.controller.api.ControllerHost
import com.bitwig.extension.controller.api.Transport

class Extension(definition: ControllerExtensionDefinition, host: ControllerHost)
    : ControllerExtension(definition, host) {

    lateinit var transport: Transport

    private val midiCallback = MidiCallback()
    private val sysexCallback = SysexCallback()

    override fun init() {
        transport = host.createTransport()
        host.getMidiInPort(0).setMidiCallback(midiCallback)
        host.getMidiInPort(0).setSysexCallback(sysexCallback)

        host.showPopupNotification("${extensionDefinition.name} initialized.")
    }

    override fun exit() {
        host.showPopupNotification("${extensionDefinition.name} removed.")
    }

    override fun flush() {
//        host.showPopupNotification("${extensionDefinition.name} flushed.")
    }

}