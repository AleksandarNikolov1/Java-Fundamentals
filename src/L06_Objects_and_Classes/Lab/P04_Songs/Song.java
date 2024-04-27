package L06_Objects_and_Classes.Lab.P04_Songs;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Song {

    private String typeList;
    private String songName;
    private String time;

    public Song(String typeList, String songName, String time) {
        this.typeList = typeList;
        this.songName = songName;
        this.time = time;
    }

    public String getTypeList() {
        return typeList;
    }

    public String getSongName() {
        return songName;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        List<Song> songs = new ArrayList<>();


        while (n-- > 0){

            String[] songInfo = sc.nextLine().split("_");
            String typeList = songInfo[0];
            String songName = songInfo[1];
            String time = songInfo[2];

            Song song = new Song(typeList, songName, time);

            songs.add(song);
        }

        String typeListFilter = sc.nextLine();

        if (typeListFilter.equals("all")){
            for (Song song : songs) {
                System.out.println(song.getSongName());
            }
        }

        else{
            songs.stream().filter(s -> s.getTypeList().equals(typeListFilter)).
                    forEach(s -> System.out.println(s.getSongName()));
        }
    }
}
