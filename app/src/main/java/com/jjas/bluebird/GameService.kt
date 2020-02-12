package com.jjas.bluebird

import android.app.Service
import android.content.Intent
import android.os.HandlerThread
import android.os.IBinder
import android.os.Messenger
import android.os.Parcelable
import androidx.localbroadcastmanager.content.LocalBroadcastManager

class GameService: Service(), GameStateListener{

    private val handlerThread = HandlerThread("GameHandlerThread")

    override fun onBind(intent: Intent?): IBinder? {
        handlerThread.start()
        val gameHandler = GameHandler(handlerThread.looper, SinglePlayerGame(this))
        return Messenger(gameHandler).binder
    }

    override fun onDestroy() {
        super.onDestroy()
        handlerThread.quitSafely()
    }

    override fun onGameStateChanged(action: String, data: Parcelable) {
        LocalBroadcastManager.getInstance(this).sendBroadcast(Intent().run {
            setAction(action)
            putExtra("", data)
        })
    }
}