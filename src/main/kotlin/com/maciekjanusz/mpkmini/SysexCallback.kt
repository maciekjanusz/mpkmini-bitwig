package com.maciekjanusz.mpkmini

import com.bitwig.extension.callback.SysexMidiDataReceivedCallback

internal class SysexCallback : SysexMidiDataReceivedCallback{

    override fun sysexDataReceived(data: String?) {
        // no-op
    }
}