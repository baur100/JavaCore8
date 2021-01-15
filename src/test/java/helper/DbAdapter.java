package helper;

import models.Artist;
import models.Playlist;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DbAdapter {
    private static final String DB_URL = "jdbc:mariadb://104.237.9.33/dbkoel";
    private static final String USERNAME = "dbuser06";
    private static final String PASSWORD = "pa$$06";
    private static final String JDBC_DRIVER = "org.mariadb.jdbc.Driver";

    private static Connection connection = null;
    private static Statement statement = null;

    public static List<Artist> getAllArtists(){
        String query = "select * from artists";
        List<Artist> artists = new ArrayList<>();
        try {
            Class.forName(JDBC_DRIVER);
            connection = DriverManager.getConnection(DB_URL,USERNAME,PASSWORD);
            statement = connection.createStatement();
            ResultSet result = statement.executeQuery(query);

            while(result.next()){
                Artist artist = new Artist(result.getString("name"),result.getInt("id"),result.getString("image"));
                artists.add(artist);
            }
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        } finally {
            if(connection!=null){
                try{
                    connection.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
        }

        return artists;
    }
    public static List<Playlist> getAllPlaylists(){
        String query = "select * from playlists";
        List<Playlist> playlists = new ArrayList<>();
        try {
            Class.forName(JDBC_DRIVER);
            connection = DriverManager.getConnection(DB_URL,USERNAME,PASSWORD);
            statement = connection.createStatement();
            ResultSet result = statement.executeQuery(query);

            while(result.next()){
                Playlist pl = new Playlist(result.getInt("id"),result.getInt("user_id"),result.getString("name"));
                playlists.add(pl);
            }
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        } finally {
            if(connection!=null){
                try{
                    connection.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
        }

        return playlists;
    }

    public static Playlist getPlaylist(int i) {
        Playlist pl=null;
        String query = "select * from playlists where id = "+i;
        try {
            Class.forName(JDBC_DRIVER);
            connection = DriverManager.getConnection(DB_URL,USERNAME,PASSWORD);
            statement = connection.createStatement();
            ResultSet result = statement.executeQuery(query);

            while(result.next()){
                pl = new Playlist(result.getInt("id"),result.getInt("user_id"),result.getString("name"));
            }
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        } finally {
            if(connection!=null){
                try{
                    connection.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
        }
        return pl;
    }
}
