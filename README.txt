Restoranu bookingas:

Restoranai turi savo pavadinima ir rankinga pagal kuri klientai gali filtruot. Klientai gali
rezervuoti staleli pasirinktam restorane specifine valanda(int for now 0-24). Rezervavimas galioja 1h( or 2 up to ya) tada 
stalelis tampa laisvas. Klientai turi nurodyti zmoniu kieki rezervuojant staleli (min 1 max up to you).
Jeigu stalelis ta valanda laisvas ir restoranas turi pakankamo dydzio staliuka, staliukas gali buti rezervuojamas. Jeigu
staliukas uzimtas turi ismesti atitinkama notificationa (suck it).

Customer.java
Sukurimui klientu - id,Name,PhoneNumber

Restaurant.java
Restoranu sukurimui - Name,Ranking.
Kaip prideti stalelius restoranui rasi Main.java pavyzdi.

Table.java
Staleliu kurimui -id,AvailableSeats
self explanatory.

Tavo task ReservationSystem.java sukurt metodus kur patikrina ar staliukas laisvas, atsaukt rezervacija,
atnaujint rezervacija. Gali kurt kaip nori sita klase, up to you.

Sistemos veikimo pavizdys:
Klientas gali prisijungt(Login if ya want) -> restoranai pasirodo kaip sarasas filtruotas nuo geriasio iki blogiausio reitingo ->
Klientas pasirenka restorana ivesdamas jo pavadinima(or id jei sukursi) -> iveda norima valanda ir zmoniu kieki -> restoranas patikrina
ar laisvas stalelis ir ar zmone telpa -> Uzbookina staleli jei laisvas otherwise notification.