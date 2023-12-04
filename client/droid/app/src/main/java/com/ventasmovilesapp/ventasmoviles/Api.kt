package com.ventasmovilesapp.ventasmoviles

import android.util.Log
import com.github.guepardoapps.kulid.ULID
import com.ventasmovilesapp.libui.Server
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.decodeFromString
import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json

private const val tag = "VENTAS"

fun setup_server() {
    Log.d(tag, "Starting Rust...")
    Server.server.init()
    Log.d(tag, "Starting Rust DONE")
}

@Serializable
sealed class Request {

}
