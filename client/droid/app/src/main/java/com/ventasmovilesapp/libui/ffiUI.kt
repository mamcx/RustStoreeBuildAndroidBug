package com.ventasmovilesapp.libui

class Server {
    companion object {
        var server = Server()

        init {
            System.loadLibrary("ui")
        }
    }

    //This names must match on Rust libTaxi/droid.rs
    external fun init()
    external fun query(cmd: String): String
    //external fun stream(callback: Listener)
}