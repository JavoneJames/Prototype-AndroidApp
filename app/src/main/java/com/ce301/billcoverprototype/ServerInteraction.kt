package com.ce301.billcoverprototype

import org.json.JSONObject
import java.io.IOException
import java.io.ObjectInputStream
import java.io.ObjectOutputStream
import java.net.InetAddress
import java.net.Socket

class ServerInteraction internal constructor(private val serverName: InetAddress, private val PORT: Int) : Runnable {
    private var outputStream: ObjectOutputStream? = null
    private var jsonObject: JSONObject? = null
    private var socket: Socket? = null
    override fun run() {
        try {
            socket = Socket(serverName, PORT)
            if (socket!!.isConnected) println("connected to server") else println("cannot connect to server")
            val inputStream = ObjectInputStream(socket!!.getInputStream())
            outputStream = ObjectOutputStream(socket!!.getOutputStream())
            sendOutputToServer()
            //receiveMessages(inputStream);
        } catch (e: IOException) {
            e.printStackTrace()
        }
    }

    @Throws(IOException::class, ClassNotFoundException::class)
    private fun receiveMessages(inputStream: ObjectInputStream) {
        var message: String
        while (true) {
            message = inputStream.readObject() as String
            println(message)
        }
    }

    @Throws(IOException::class)
    private fun sendOutputToServer() {
        outputStream!!.writeObject(jsonObject.toString())
        outputStream!!.flush()
    }

    fun sendJSON(jsonObject: JSONObject?) {
        this.jsonObject = jsonObject
    }
}