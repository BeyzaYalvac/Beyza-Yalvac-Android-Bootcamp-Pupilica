package com.example.androidpupilicabootcamp.oop.Odev2

class Odev2 {

    fun fahreinheitConverter(degree:Double){
        var degree=0.0;
        var fahreinheit=0.0;
        fahreinheit=(degree*1.8)+32;
        degree=(fahreinheit-32)/1.8

        println(" fahreinheit: $fahreinheit");
        println("degree: $degree");
    }

    fun dikdortgenCevresi(kisaKenar:Double,uzunKenar:Double){
        var dikdortgenCevre=(kisaKenar+uzunKenar)*2
        println("dikdörtgen Çevresi: $dikdortgenCevre")
    }

    fun faktoriyelHesapla(sayi:Int){
        var baslangic=1;
        for(i in 1..sayi){
            baslangic*=i;
        }

        println("Faktoriyel: $baslangic")
    }

    fun aHarfiniSay(kelime:String){
        var aSayisi=0;
        for(i in kelime){
            if(i=='a'){aSayisi+=1;}
        }
        println("a harfi sayisi: $aSayisi")
    }

    fun kenarSayisiHesapla(kenarSayisi:Int){
        var icAcilarToplami=(kenarSayisi-2)*180;

        println("İç Açılar Toplamı: $icAcilarToplami")
    }

    fun maasHesapla(mass:Double,saat:Double){
        var saatUcreti=saat*10;
        var mesaiUcreti=0;
        if(saat>160){
            var mesaiSaati=160-saat;
        var mesaiUcreti=mesaiSaati*20;
        }

        var maas=saatUcreti+mesaiUcreti;
        println("Maaş: $maas")

    }

    fun kotaMiktariUcret(kota:Int){
        var kotaucreti=kota*2;
        var ekKota=0;
        if(kota>50){
            var ekKota=(kota-50)*4
        }
        var kotaucretison=kotaucreti+ekKota;
    }
}