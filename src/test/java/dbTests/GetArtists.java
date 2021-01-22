package dbTests;

import helper.DbAdapter;
import models.Playlist;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GetArtists {
    @Test
    public void getAllArtists_artistsReturned(){
        var artists = DbAdapter.getAllArtists();

        artists.forEach(ar-> System.out.println(ar.getName()));
    }
    @Test
    public void getAllPlaylists_playlistsReturned(){
        var playlists = DbAdapter.getAllPlaylists();

        playlists.forEach(ar-> System.out.println(ar.getName()));
    }
    @Test
    public void assertSinglePlaylist(){
        Playlist pl = DbAdapter.getPlaylist(812);
        Assert.assertEquals(pl.getName(),"Great");
    }
}
