package com.example.fooball;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;

import java.util.ArrayList;

public class ListClub extends AppCompatActivity {

    private ArrayList<String> fotoClub = new ArrayList<>();
    private ArrayList<String> namaClub = new ArrayList<>();
    private ArrayList<String> infoClub = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.listclub);

        getDataFromInternet();
    }

    private void prosesRecyclerViewAdapter(){
        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(fotoClub, namaClub, infoClub, this);

        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager( this));

    }

    private void getDataFromInternet(){

        fotoClub.add("https://www.thesportsdb.com/images/media/team/badge/xzqdr11517660252.png/preview");
        namaClub.add("Man United");
        infoClub.add("Manchester United Football Club is an English professional football club.");

        fotoClub.add("https://www.thesportsdb.com/images/media/team/badge/vwvwrw1473502969.png/preview");
        namaClub.add("Real Madrid");
        infoClub.add("Real Madrid Club de Fútbol (Royal Madrid Football Club), commonly known as Real Madrid, or simply as Real, is a professional football club based in Madrid, Spain");

        fotoClub.add("https://www.thesportsdb.com/images/media/team/badge/xqwpup1473502878.png/preview");
        namaClub.add("Barcelona");
        infoClub.add("Futbol Club Barcelona, also known as Barcelona and familiarly as Barça, is a professional football club, based in Barcelona, Catalonia, Spain.\n" +
                "\n" +
                "Founded in 1899 by a group of Swiss, English and Catalan footballers led by Joan Gamper, the club has become a symbol of Catalan culture and Catalanism, hence the motto \"Més que un club\" (More than a club). Unlike many other football clubs, the supporters own and operate Barcelona.");

        fotoClub.add("https://www.thesportsdb.com/images/media/team/badge/uvxuqq1448813372.png/preview");
        namaClub.add("Liverpool");
        infoClub.add("Liverpool Football Club /ˈlɪvərpuːl/ is a Premier League football club based in Liverpool. Liverpool F.C. is one of the most successful clubs in England and has won more European trophies than any other English team with five European Cups, three UEFA Cups and three UEFA Super Cups. The club has also won eighteen League titles, seven FA Cups and a record eight League Cups.");

        fotoClub.add("https://www.thesportsdb.com/images/media/team/badge/yvwvtu1448813215.png/preview");
        namaClub.add("Chelsea");
        infoClub.add("Chelsea Football Club /ˈtʃɛlsiː/ are a professional football club based in Fulham, London, who play in the Premier League, the highest level of English football. Founded in 1905, the club have spent most of their history in the top tier of English football. The club's home ground is the 41,837-seat Stamford Bridge stadium, where they have played since their establishment. ");

        fotoClub.add("https://www.thesportsdb.com/images/media/team/badge/dfyfhl1604094109.png/preview");
        namaClub.add("Tottenham");
        infoClub.add("Tottenham Hotspur Football Club /ˈtɒt(ə)nəm/, commonly referred to as Spurs, is an English football club located in Tottenham, London, that plays in the Premier League. The club's home stadium is White Hart Lane. Its newly developed training ground is in Bulls Cross on the northern borders of the London Borough of Enfield.");

        prosesRecyclerViewAdapter();



    }
}