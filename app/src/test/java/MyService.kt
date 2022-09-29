import android.app.Service
import android.content.Intent
import android.media.MediaPlayer
import android.os.IBinder
import androidx.core.R

class MyService:Service() {
    lateinit var mediaPlayer: MediaPlayer
    val Tag ="MyService"
    override fun onBind(p0: Intent?): IBinder? {
        TODO("Not yet implemented")
    }

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
       if (! this::mediaPlayer.isInitialized) {
           mediaPlayer = MediaPlayer.create(this, R.raw.song)
       }
        if (intent !=null){
            val str1:String?=intent.getStringExtra("Service1")
            if (str1=="PlayPause"){
                if (!mediaPlayer.isPlaying)
                {
                    mediaPlayer.start()
                }
                else
                {
                    mediaPlayer.pause()
                }
                }
            }
        else
        {
            mediaPlayer.start()
        }
        return START_STICKY
    }

    override fun onDestroy() {
        mediaPlayer.stop()
        super.onDestroy()
    }
}