Zadatak 3
Napisati klasu koja opisuje jedan printer. Printer ima sljedece atribute:
 Ime printera
 Kolicina papira u printeru
 Kolicina tinte u printeru
 Ukupno isprintano stranica
Printer ima sljedece konstruktore:
 Prazni konstruktor koji inicijalizira ime na „DefaultPrinter“, a kolicinu papira i tinte na 0
 Konstruktor koji inicijalizira ime na dati parametar, a kolicinu papira i tinte na 0
 Oba konstruktora inicijaliziraju ukupno isprintano stranica na 0
Printer ima sljedece metode:
 Metoda koja vraca da li ima tinte (true/false)
 Metoda koja vraca da li ima papira (true/false)
 Metoda koja vraca koliko je ukupno isprintano stranica od tog printera
 Metoda koja dodaje papira u printer (void metoda)
 Uzeti u obzir da se ne moze imati vise od 100 papira u printeru
 Metoda koja napuni tintu na max. (void metoda)
  Maksimalno tinte je 100
 Metoda koja „printa“ stranice papira (void metoda)
 Metoda prima int parametar koji predstavlja koliko stranica isprintati
 Za svaku isprintanu stranicu oduzeti jedan papir iz printera
 Za svaku isprintanu stranicu oduzeti tri iz atributa tinta
 Ukoliko nema papira ili ako nema tinte onda ne treba printati
Pored toga Printer klasa sadrzi sljedece:
 toString metodu koja printa ime printera i trenutno stanje
 Stanje moze biti „Ready“, „No ink“, „No paper“, „No ink nor paper“
 static varijablu koja biljezi koliko ukupno stranica je isprintano
 Napisati i metodu koja vraca vrijednost te varijable