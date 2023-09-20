package d09_18_2023;

public class TekstZadatka {

}
//*//1. Zadatak
//        Kreirati klasu VideoPlayer koja ima:
//        duzinu videa
//        trenutno vreme videa
//        jacinu zvuka
//        Kvalitet videa (144, 240, 360, 480, 720, 1080)
//        gettere, settere i konstruktore
//        metodu stampaj koja stampa podatke u formatu:
//        trenutno vreme videa
//        jacina zvuka
//        kavlitet videa
//
//        Kreirati apstraktnu klasu Control koja ima:
//        abstraktnu metodu izvrsi akciju, koja kao parametar prima objekat VideoPlayer
//
//        Kreirati klasu TimeControl koja nasledjuje klasu Control i
//        konstruktore
//        ima atribut koji kaze na koju stranu pomera trenutno vreme videa (tipa boolean)
//        implementira metodu izvrsi akciju tako sto pomeri trenutno vreme videa za 15s unapred ili unazad u zavisnosti od atributa. Veoma je bitno da se ne izadje van granica videa.
//
//        Kreirati klasu AudioControl koja nasledjuje klasu Control i
//        gettere, settere i konstruktore
//        ima atribut koji kaze da li se smanjuje ili pojacava zvuk (tipa boolean)
//        implementira metodu izvrsi akciju tako sto pojaca ili smanjuje zvuk za 1. U opsegu od 0 do 100
//
//        Kreirati klasu QualityOptimizerControl koja nasledjuje klasu Control i
//        ima brzinu interneta u megabajtima, npr 10mb/s, 20mb/s, 7.9mb/s
//        gettere, settere i konstruktore
//        implementira metodu izvrsi akciju tako sto postavlja kvalitet videa u zavisnosti od brzine interneta. Kvalitet se racuna na osnovu formule:
//        brzina interneta * 10.1, gde se uzima prvi veci kvalitet
//        npr: ako je brizna interneta 20 * 10.1 = 204 => postavlja 240
//        npr: ako je brzina interneta 5 * 10.1 = 50.5 => postavlja 144
//        npr: ako je brzina interneta 50 * 10.1 = 505 => postavlja 720
//
//        U glavnom programu kreirati video plejer i izvrsiti neke akcije nad njim.
//
//
//
//
//
//
//
//
//
//        2.Zadatak (ZA VEZBANJE ALI PREPORUKA)
//        Krerati klasu ValidationResult koja ima:
//        hasErrors- koji moze da bude true ili false
//        Errors - niz strigova
//        Gettere za atribute
//        Metodu addError koja postavlja hasErrors na true i dodaje gresku u niz.
//        Metodu print koja stampa u formatu:
//        Ako greske postoje, svaku gresku stampamo u novom redu
//        Ukoliko ne postoje, stampamo “No validation errors”
//
//        Kreirati apstraktnu klasu Validator koja ima:
//        Apstraktnu metodu validate koja vraca ValidationResult. Metoda ne prima parametre.
//
//        Kreirati klasu EmailValidator koja nasledjuje klasu Validator i koja ima:
//        Atribut email
//        Geter i seter za email
//        Email je validan ukoliko ispunjava sledec uslove:
//        Email mora da sadrzi @
//        Email mora da se zavrsava na .com ili .net
//        Ukoliko email ne ispunjava uslove vratiti rezultat sa greskom “Email is invalid”
//
//        Kreirati klasu PasswordValidator koja nasledjuje klasu Validator i koja ima:
//        Atribut password
//        Geter i seter za password
//        Password je validan ukoliko:
//        Sadrzi jedan od sledecih karaktera @ # / *
//        Ima minimum 8 karaktera
//        Sadrzi bar jedno veliko slovo (izguglajte kako ovo da proverite)
//        Koristan link
//        Sadrzi bar jedno malo slovo
//        Sadrzi bar jedan cifru. Koristan link, idite na kraj stranice to je najslicnije resenje onom iznad
//        Ukoliko se npr za password unese vrednost botcamp
//        Metoda vraca rezultat sa greskama:
//        Password must contain at least one uppercase letter
//        Password must contain at least one special character @, # or *
//        Password must be minimum 8 characters
//        Password must contain at least one digit
//        Kreirati klasu PhoneValidator koja nasledjuje klasu Validator i koja ima:
//        Atribut za broj telefona
//        Geter i seter za broj telefona
//        Broj telefona je validan ukoliko:
//        Broj krece sa znakom +
//        Ukoliko nema razmaka
//        Sadrzi samo cifre
//        Ukoliko se npr za broj telefona unese vrednost 5a5 555 55
//        Metoda vraca rezultat sa greskama:
//        Phone number must start with +
//        Phone number cannot contain spaces
//        Phone number can only contain numbers
//
//        U glavnom programu kreirati objekte i testirati sve funkionalnosti
