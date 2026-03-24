Geneerilised tüübid

Tõstke kõik failid, mis on kataloogis src/generics oma 
Github'i reposse (icd0019) kataloogi src/generics.

Veenduge, et kood kompileerub.

Kui valite Idea's Build menüüst -> Rebuild project peaks tulema teade 
"Compilation completed successfully ..."

1. Klass generics.pair.Pair on konteiner kahe elemendi hoidmiseks.
   Praegu on nende elementide tüübid rangelt määratud. 
 
   a) Muutke klassi Pair nii, et sellele saaks elementide tüübid 
      parameetritena ette anda.
   b) Kasutage klassi asemel record'it koos tüübi prameetritega.
   
   Proovimiseks on klass generics.pair.Runner.   

2. Klassis generics.methods.DefaultValueExample on näide vaikeväärtuste 
   (default value) kasutamisest. Meetod getConstantForZone() tagastab 
   vastavalt sisendile mingi numbrilise väärtuse. Teatud juhtudel võib 
   see meetod aga null'i tagastada. 
   
   Kahes esimeses testides on näide selle kohta, kuidas saame määrata
   mingi vaikimisi väärtuse, kui null tagastatakse. Antud juhul määratakse 
   sellisel juhul väärtuseks 1.
   
   Meetodis exampleWithHelperForIntegers() on näide, kuidas sama asja 
   abimeetodiga teha. Seekord on kood lühem ja loodetavasti paremini loetav.
   
   Selles näites olev abimeetod defaultIfNull() on aga kindla tüübiga.
   Kui soovime, et see Double tüüpi väärtuste puhul ka töötaks peame 
   eraldi meetodi tegema.
   
   Tehke meetod defaultIfNull() geneeriliseks, et piisaks ühest 
   meetodist mis sobiks erinevate tüüpide jaoks. 

3. Klassis generics.methods.MinimumExample on meetod min(), mis võtab
   sisendiks kaks argumenti ja tagastab nendest väiksema.
   
   See meetod on kindla tüübiga ja seega iga tüübi jaoks on vaja eraldi meetodit.

   Tehke meetod min() geneeriliseks, et piisaks ühest versioonist erinevate tüüpide jaoks.
   
4. Klassis generics.methods.MinimumElementExample on meetod minimumElement(), 
   mis võtab sisendiks listi ja tagastab sellest väiksema.
   
   Tehke meetod minimumElement() geneeriliseks, et piisaks ühest 
   versioonist erinevate tüüpide jaoks.
   
5. Klassis generics.stack.Stack on lihtne versioon pinust (ingl stack).
   Pinu elemente hoitakse massiivis ja see ei tohiks muutuda.
   
   Muutke meetod geneeriliseks, et selles pinus saaks ka muud tüüpi elemente hoida.
   
   Tüübiparameetri põhjal massiivi loomine pole võimalik. Seega peate
   elemente hoidma Object[] massiivis ja kasutama cast'imist.
   
   Klassi avalik liides peaks tagama, et Stack klassi kasutamisel ei tule 
   kunagi cast'imise viga. Kui push() meetod on ainus, mis massiivi midagi lisab,
   siis piisab tagamakse et see meetod lubab sisendina vaid sobivat tüüpi.

6. Selle ülesande mõte on aru saada tundmatut (wildcard) sisaldavatest 
   tüüpidest.

   a) Klassis generics.list.BoxExample on näide, mis illustreerib tundmatu 
      tüübi vajadust. Muutujas box peaks saama hoida objekti, mis sisaldab
      täisarvu ja objekti, mis sisaldab ujukomaarvu. Integer ja Double
      on mõlemad numbrid aga Box<Number> antud muutuja tüübiks ei sobi.
      Proovige aru saada, miks ei sobi.
   
   b) Klassis generics.list.ListExample on sama probleem illustreeritud
      Java List kollektsiooni puhul. Muutke muutuja source tüüpi, et saaks 
      väljakommenteeritud koodi sisse kommenteerida.

   c) Klassis generics.list.MyList on lihtne versioon listist.
      Selles on puudu addAll() meetodi sisu. Kirjutage vajalik kood, et tööle 
      hakkaks test klassis MyListTest.

   d) Klassis generics.wildcard.Main on näide, mis illustreerib "? extends ..."
      tüübiparameetri kasutamist. Proovige aru saada, miks rida mysteryBox.put(11);
      ei kompileeru.

   e) Klassis generics.validator.Validator on näide, mis illustreerib "? super ..."
      tüübiparameetri kasutamist. Proovige aru saada, mis roll on konstruktsioonil "? super ...".

7. Paketis generics.converter on mõned klassid, milles oleks sobilik 
   tüübi parameetreid kasutada.
   
   Kirjutage sobivad parameetrid, et kood klassis ConverterTests kompileeruks
   ilma hoiatusteta (nt. Unchecked assignment).

8. See ülesanne pole geneeriliste tüüpidega seotud aga seekordse lisaülesande
   juures võiks rekursioonist kasu olla. Seega oleks põhjust seda tehnikat 
   harjutada.

   Java liides Path kujutab faili teekonda (path), mida on võimalik 
   rekursiivselt navigeerida. Navigeerimise kohta on näide klassis 
   generics.recursion.RecursionTests meetodis pathElementsAccessExample().
   
   Eesmärk on kirjutada meetod, mis tagastab kõik faili teekonna elemendid 
   (faili nimi ja kataloogid) listina.
   
   Probleemile võiks läheneda etapiti.
   
   a) Lahendage probleem tsükliga.
   
   b) Kasutage rekursiooni navigeerimiseks ja printige leitud elemendid 
      välja. Elementide listi panemine ja tagastamine jääb hilisemaks.
   
   c) Kasutage rekursiooni navigeerimiseks ja saatke meetodile kaasa list, 
      kuhu vajalikud elemendid koguda.
   
   d) Kirjutage lõplik rekursioonil põhinev lahendus.   

9. Meie arendada on kaks veebipoodi. Üks müüb tooteid ja teine teenuseid.

   Kahe veebipoe lähtekood on teatud osas ühine. Ostukorvi loogika on mõlemas 
   veebipoes sama. Erinevus on vaid selles, mis tüüpi asju korvis hoitakse. 
   Samas soovime vältida olukorda, et toodete ostukorvi ei pandaks kogemata 
   teenuseid või teenuste ostukorvi tooteid.
   
   Selleks on ostukorvi klass tehtud geneeriliselt ja selles hoitavate 
   elementide tüüp antakse parameetriga ette.
   
   Ostukorvi klassist on praegu valmis vaid minimaalne osa, et testid 
   kompileeruks. Kirjutage see klass lõpuni.
   
   Nõutud käitumine on määratud testidega, mis asuvad klassis
   generics.cart.ShoppingCartTests.

   Andmete hoidmiseks võiks kasutada kollektsioonide loengus nimetatud 
   musterlahendust (slaid "Levinud musterlahendus"). Üks kirje (nt. CartEntry) 
   sisaldab tootet/teenust ja kogust. Kirjeid hoitakse listis, et neid 
   oleks võimalik vajadusel nt. koguse või hinna järgi sorteerida.

   Piirangud:
   
     1. klasse Product ja Service ning liidest CartItem ei tohi muuta;
   
     2. ühtegi (explicit) cast'i ei tohi kasutada.

   Selle ülesande koha on ka koodi ülevaatuse võimalus. Kui esitate lahenduse 
   tähtajaks, siis tähtaja möödudes on teil võimalik kellegi teise tudengi 
   tööd hinnata ja selle eest punkte saada. 
   
   Ülevaatuse leiate pärast tähtaja möödumist hindamissüsteemist ja selle 
   esitamiseks on aega 7 päeva.

   Ülevaatusel tuleb vastata kahele küsimusele.
     - Kas koodis on kasutatud ülesande tekstis nimetatud musterlahendust?
     - Kas kood tagab, et teenuste korvi ei saa panna tooteid?

   Aadressil https://github.com/mkalmo2/icd0019app on rakendus, mis illustreerib,
   kuidas loodud koodi praktikas kasutada. Rakenduse kasutamiseks kopeerige
   oma kood icd0019app projekti ja käivitage main() meetod klassis server.Server.
   See käivitab lokaalse veebiserveri aadressil http://localhost:8080.
   Sellelt aadressilt saate läbi brauseri tulemust vaadata.

10. Veenduge, et testid lähevad läbi.
   
    Commit-ige muudatused ja push'ige need Github'i. 
    
    Lisage commit'ile tag ex08.
    
    Veenduge tulemuste lehelt, et tulemus on positiivne.

11. See ülesanne pole kohustuslik aga selle lahendamise eest on võimalik 
    kaks lisapunkti saada.
    
    Ühenduse kirje koosneb kahest punktist. Näiteks A-B tähendab, et meil 
    on ühendus punktist A punkti B ja vastupidi.
    
    Ette on antud hulk ühendusi kirjeldavaid kirjeid. 
    
    Nt. A-B, E-C, D-A, jne.
    
    Teie ülesanne on teha kindlaks, kas ette antud ühenduste hulgas on 
    kahe elemendi vahel otsene või kaudne ühendus.
    
    Nt. Kui A on ühenduses B-ga ja B on ühenduses C-ga, siis on ka A ja 
        C ühenduses.
    
    Nõutud käitumine on kirjeldatud testidega klassis generics.connection.Tests.
    
    Kood peab töötama piisavalt kiiresti, et ~20 sekundiga jõuaks
    (testeri masinas) kõik testid läbida.
    
    Töö märgistage tag-iga b2
   
Seletused ja lahendused (1-8), seletused (9, 11): https://youtu.be/iKmXdcxANpY
