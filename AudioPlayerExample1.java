package musicPlayerMp3;
import java.io.File;
import java.io.IOException;
 
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.DataLine;
import javax.sound.sampled.LineEvent;
import javax.sound.sampled.LineListener;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;



public class AudioPlayerExample1 implements LineListener {
	
    /**
     * this flag indicates whether the playback completes or not.
     */
    private boolean playCompleted;
    private Clip audioClip;
    private long clipTime;
    private boolean isStopped;
    private boolean isPaused;
    private boolean isPlaying;
    /**
     * Play a given audio file.
     * @param audioFilePath Path of the audio file.
     */
    void play(String audioFilePath) {
        File audioFile = new File(audioFilePath);
        playCompleted = false;
		isStopped = false;
        try {
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(audioFile);
 
            AudioFormat format = audioStream.getFormat();
 
            DataLine.Info info = new DataLine.Info(Clip.class, format);
 
            audioClip = (Clip) AudioSystem.getLine(info);
 
            audioClip.addLineListener(this);
 
            audioClip.open(audioStream);
             
            audioClip.start();
             
            while (!playCompleted) {
                // wait for the playback completes
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                  }
            }
             
            audioClip.close();
            
             
        } catch (UnsupportedAudioFileException ex) {
            System.out.println("The specified audio file is not supported.");
            ex.printStackTrace();
        } catch (LineUnavailableException ex) {
            System.out.println("Audio line for playing back is unavailable.");
            ex.printStackTrace();
        } catch (IOException ex) {
            System.out.println("Error playing the audio file.");
            ex.printStackTrace();
        }
         
    }
	public void stop() {
		isStopped = true;
	}


	public void resume() {
		isPaused = false;
	}
    public void pause(String audioFilePath){
    	 try{
    	        File f = new File(audioFilePath);
    	        audioClip = AudioSystem.getClip();
    	        AudioInputStream ais = AudioSystem.getAudioInputStream(f);
    	        audioClip.open(ais);
    	        isStopped = true;
    	       // if(player.pause);
    	        clipTime = audioClip.getMicrosecondLength();
    	            audioClip.stop(); 
    	        
    	        //audioClip.loop(Clip.LOOP_CONTINUOUSLY);

    	    }catch(Exception exception){System.out.println("Failed To Play The WAV File!");}
    }
    /**
     * Listens to the START and STOP events of the audio line.
     */
    @Override
    public void update(LineEvent event) {
        LineEvent.Type type = event.getType();
        //LineEvent.Type type = event.getType();
        if (type == LineEvent.Type.STOP) {
			System.out.println("STOP EVENT");
			if (isStopped || !isPaused) {
				playCompleted = true;
			}
		}
		
        if (type == LineEvent.Type.START) {
            System.out.println("Playback started.");
             
        } else if (type == LineEvent.Type.STOP) {
            playCompleted = true;
            System.out.println("Playback completed.");
        }
 
    }
 
}
