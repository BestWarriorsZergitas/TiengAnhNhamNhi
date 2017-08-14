package com.applestudio.jwplayerdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.longtailvideo.jwplayer.JWPlayerFragment;
import com.longtailvideo.jwplayer.JWPlayerView;
import com.longtailvideo.jwplayer.media.playlists.PlaylistItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        JWPlayerFragment fragment = (JWPlayerFragment) getFragmentManager().findFragmentById(R.id.playerFragment);

        JWPlayerView playerView = fragment.getPlayer();

        PlaylistItem video = new PlaylistItem("http://r3---sn-ogueln7y.googlevideo.com/videoplayback?expire=1497967319&beids=%5B9466592%5D&signature=7F1178EAABCAFB8BD335651275A81DD8574810F6.1B6F887C996E854DC749444FDD1C5E998B70DB0A&ei=d9ZIWYmzA8q6-gPAzZC4Bg&id=o-ANE-3moCwuqZ14Rh6Ey3jij2thQPIKwXuSBA9XQEInYV&itag=18&dur=49.110&ratebypass=yes&ipbits=0&pl=24&source=youtube&sparams=dur,ei,expire,id,ip,ipbits,ipbypass,itag,lmt,mime,mip,mm,mn,ms,mv,pl,ratebypass,source&lmt=1402213094763787&key=cms1&mime=video%2Fmp4&ip=23.80.156.4&title=How+to+get+link+MP4%2C+FLV+in+Youtube&req_id=46e51e87a226a3ee&ipbypass=yes&mip=118.71.106.111&cm2rm=sn-42u-i5oel7e,sn-i3bs77s&redirect_counter=3&cms_redirect=yes&mm=34&mn=sn-ogueln7y&ms=ltu&mt=1497945632&mv=m");

        playerView.load(video);
    }
}
