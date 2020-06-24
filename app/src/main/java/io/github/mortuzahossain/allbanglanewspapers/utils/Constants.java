package io.github.mortuzahossain.allbanglanewspapers.utils;
/*
 * Created by mortuza on 23/6/20 | 1:29 AM for All Bangla Newspapers
 * Junior Programmer
 * Flora Systems
 * Email : mortuzahossain1997@gmail.com
 * Phone : +8801719200957
 * */


import java.util.ArrayList;
import java.util.List;

import io.github.mortuzahossain.allbanglanewspapers.R;
import io.github.mortuzahossain.allbanglanewspapers.model.NewspaperModel;

public class Constants {
    public enum NewsCategory {
        BANGLA,
        ENGLISH,
        INTERNATIONAL
    }

    public static String[] NewsCategoryTitle = {
            "BANGLA",
            "ENGLISH",
            "INTERNATIONAL"
    };

    public static List<NewspaperModel> getBanglaNewspapers() {
        List<NewspaperModel> banglaNewspapers = new ArrayList<>();
        banglaNewspapers.add(new NewspaperModel("Prothom Alo", "http://www.prothom-alo.com/", R.drawable.prothomalolog));
        banglaNewspapers.add(new NewspaperModel("Bangladesh Pratidin", "http://www.bd-pratidin.com/", R.drawable.bangladesh_pratidin));
        banglaNewspapers.add(new NewspaperModel("Daily Ittefaq", "http://www.ittefaq.com.bd/", R.drawable.ittefaq));
        banglaNewspapers.add(new NewspaperModel("Daily Kalerkantho", "http://www.kalerkantho.com/", R.drawable.kalerkontho));
        banglaNewspapers.add(new NewspaperModel("Daily Nayadiganta", "http://www.dailynayadiganta.com/", R.drawable.nayadigant));
        banglaNewspapers.add(new NewspaperModel("Smar Dangbad", "http://www.amar-sangbad.com/", R.drawable.amarsangbbadnews));
        banglaNewspapers.add(new NewspaperModel("Daily Shokaler Somoy", "http://www.dailysokalersomoy.com/", R.drawable.sokalersomoy));
        banglaNewspapers.add(new NewspaperModel("protidinersangbad", "http://www.protidinersangbad.com/", R.drawable.protidinersangbadnews));
        banglaNewspapers.add(new NewspaperModel("Daily Jugantor", "http://www.jugantor.com/", R.drawable.jugantor));
        banglaNewspapers.add(new NewspaperModel("Daily Sangram", "http://www.dailysangram.com/", R.drawable.songram));
        banglaNewspapers.add(new NewspaperModel("Daily Manabzamin", "http://www.mzamin.com/", R.drawable.manobjjamin));
        banglaNewspapers.add(new NewspaperModel("Daily Amader Somoy", "http://www.amadershomoys.com/", R.drawable.aamdersomoylogo));
        banglaNewspapers.add(new NewspaperModel("Daily Somokal", "http://www.samakal.net/", R.drawable.somomkallogo));
        banglaNewspapers.add(new NewspaperModel("Daily Janakontho", "http://www.dailyjanakantha.com/", R.drawable.janakontah));
        banglaNewspapers.add(new NewspaperModel("Khola Kagoj", "http://www.kholakagojbd.com/", R.drawable.khlakagoj));
        banglaNewspapers.add(new NewspaperModel("Jaijai din", "http://www.jjdin.com/", R.drawable.jaidinjai));
        banglaNewspapers.add(new NewspaperModel("", "http://www.bhorerkagoj.net/", R.drawable.vorerkagoj));
        banglaNewspapers.add(new NewspaperModel("Daily Manobkantha", "http://www.manobkantha.com/", R.drawable.manabkontho));
        banglaNewspapers.add(new NewspaperModel("Daily Odhikar", "http://www.odhikar.news/", R.drawable.odhikar));
        banglaNewspapers.add(new NewspaperModel("Daily Bhorerdak", "http://www.bhorer-dak.com/", R.drawable.vorerdak));
        banglaNewspapers.add(new NewspaperModel("Daily Bonikbarta", "http://www.bonikbarta.com/", R.drawable.bonik_barta));
        banglaNewspapers.add(new NewspaperModel("Daily Dinkal", "http://www.dailydinkal.net/", R.drawable.dinkallogo));
        banglaNewspapers.add(new NewspaperModel("Alokito Bangladesh", "http://www.alokitobangladesh.com/", R.drawable.alokitobd));
        banglaNewspapers.add(new NewspaperModel("Daily Inqilab", "http://www.dailyinqilab.com/", R.drawable.inkalablgo));
        banglaNewspapers.add(new NewspaperModel("Daily Notunvor.com", "http://www.dailynotunvor.com/", R.drawable.natunvoorlogo));
        banglaNewspapers.add(new NewspaperModel("Ajker Patrika", "http://www.ajkerpatrika.com/", R.drawable.ajkerpatrikalogo));
        banglaNewspapers.add(new NewspaperModel("Daily Sangbad", "http://www.thesangbad.net/", R.drawable.sangbad));
        banglaNewspapers.add(new NewspaperModel("BD-Journal", "http://www.bd-journal.com/", R.drawable.bangladeshj));
        banglaNewspapers.add(new NewspaperModel("The Daily AgniShikha", "http://www.dailyagnishikha.com/", R.drawable.agnishikha));
        banglaNewspapers.add(new NewspaperModel("Daily Dhakar Dak", "http://www.dhakardak-bd.com/", R.drawable.dhakardak));
        banglaNewspapers.add(new NewspaperModel("natun-barta.com", "http://www.natun-barta.com/", R.drawable.notunbangla));
        banglaNewspapers.add(new NewspaperModel("", "http://www.ajkerjibon.com/", R.drawable.ajkerjibon));
        banglaNewspapers.add(new NewspaperModel("", "http://www.dailynabochatona.com/", R.drawable.nobochatona));
        banglaNewspapers.add(new NewspaperModel("", "http://www.ajkalerkhobor.com/", R.drawable.logoajkaler));
        banglaNewspapers.add(new NewspaperModel("", "http://www.sangbadkonika.com/", R.drawable.songbadkonika));
        banglaNewspapers.add(new NewspaperModel("Daily jagaran", "http://www.dailyjagaran.com/", R.drawable.jagoron));
        banglaNewspapers.add(new NewspaperModel("Asia Bani", "http://dailyasiabani.com/index.php/", R.drawable.dailyasiabarta));
        banglaNewspapers.add(new NewspaperModel("Bangladesher Khabor", "http://www.bangladesherkhabor.net/", R.drawable.banlakhorob));
        banglaNewspapers.add(new NewspaperModel("", "http://www.arthoniteerkagoj.com/", R.drawable.aurthonitekagoj));
        banglaNewspapers.add(new NewspaperModel("Daily Vorerpata", "http://www.dailyvorerpata.com/", R.drawable.vorerpata));
        return banglaNewspapers;
    }

    public static List<NewspaperModel> getEnglishNewspapers() {
        List<NewspaperModel> englishNewspapers = new ArrayList<>();
        englishNewspapers.add(new NewspaperModel("aljajira", "https://www.aljazeera.com/",R.drawable.aljajira));
        englishNewspapers.add(new NewspaperModel("cnn", "https://www.aljazeera.com/", R.drawable.cnn));
        englishNewspapers.add(new NewspaperModel("bbc", "https://www.bbc.com/news/world",R.drawable.bbcnews));
        englishNewspapers.add(new NewspaperModel("phonearena", "https://www.phonearena.com/",R.drawable.phonearena));
        englishNewspapers.add(new NewspaperModel("guardian", "https://www.theguardian.com/international", R.drawable.thegurdian));
        englishNewspapers.add(new NewspaperModel("sbnation", "https://www.sbnation.com/",R.drawable.sbnation));
        englishNewspapers.add(new NewspaperModel("skynews", "https://news.sky.com/",R.drawable.skynews));
        englishNewspapers.add(new NewspaperModel("skysports", "https://www.skysports.com/",R.drawable.skynews));
        englishNewspapers.add(new NewspaperModel("techcrunch", "https://techcrunch.com/",R.drawable.techcurner));
        englishNewspapers.add(new NewspaperModel("tindia", "https://timesofindia.indiatimes.com/", R.drawable.timesindia));
        englishNewspapers.add(new NewspaperModel("usatoday", "https://www.usatoday.com/", R.drawable.usatoday));
        englishNewspapers.add(new NewspaperModel("vtech", "https://www.theverge.com/", R.drawable.veraga));
        englishNewspapers.add(new NewspaperModel("waj", "https://wsj.com", R.drawable.wallsteet));
        englishNewspapers.add(new NewspaperModel("wpost", "https://washingtonpost.com", R.drawable.washingtonpost));
        englishNewspapers.add(new NewspaperModel("xda", "https://www.xda-developers.com/category/xda-news/", R.drawable.xda));
        return englishNewspapers;
    }

    public static List<NewspaperModel> getInternationalNewspapers() {
        List<NewspaperModel> internationalNewspapers = new ArrayList<>();
        internationalNewspapers.add(new NewspaperModel("businessinsider", "https://www.businessinsider.com/", R.drawable.businessinsider));
        internationalNewspapers.add(new NewspaperModel("engadget", "https://www.engadget.com/", R.drawable.engadget));
        internationalNewspapers.add(new NewspaperModel("financialexpress", "https://www.financialexpress.com/world-news/", R.drawable.financialexpress));
        internationalNewspapers.add(new NewspaperModel("financialtime", "https://www.ft.com/", R.drawable.financetime));
        internationalNewspapers.add(new NewspaperModel("phonearena", "https://www.phonearena.com/",R.drawable.phonearena));
        internationalNewspapers.add(new NewspaperModel("techcrunch", "https://techcrunch.com/",R.drawable.techcurner));
        internationalNewspapers.add(new NewspaperModel("vtech", "https://www.theverge.com/", R.drawable.veraga));
        return internationalNewspapers;
    }

}
