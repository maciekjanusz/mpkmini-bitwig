package com.maciekjanusz.mpkmini

import com.bitwig.extension.callback.ShortMidiDataReceivedCallback

internal class MidiCallback : ShortMidiDataReceivedCallback {

    override fun midiReceived(statusByte: Int, data1: Int, data2: Int) {
        // no-op
    }

}