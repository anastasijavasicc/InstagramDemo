# InstagramDemo
**InstagramDemo** je mobilna aplikacija fokusirana na demonstraciju kreiranja korisničkog interfejsa pomoću najnovije tehnologije **Jetpack Compose**.

## Svrha tutorijala 🚀

Cilj ovog tutorijala je da demonstrira moć Jetpack Compose-a u razvoju Android aplikacija kroz praktičan primer - Instagram Demo Aplikaciju. Tutorijal ima za cilj da:
 - Prikaže osnovne koncepte deklarativnog programiranja u Jetpack Compose-u.
 - Pokaže kako modularnost i višekratno upotrebljivi Composable elementi mogu ubrzati i pojednostaviti razvoj korisničkog interfejsa.
 - Omogući polaznicima razumevanje kako se Jetpack Compose integriše sa modernim Android arhitekturalnim pristupima, poput upravljanja stanjem i ViewModel-a.
 - Ilustruje prednosti Jetpack Compose-a u odnosu na tradicionalni XML pristup, poput manje količine koda i bolje prilagodljivosti različitim uređajima.
 - Objasniti osnovne koncepte deklarativnog programiranja u Jetpack Compose-u.
 - Prikazati praktičnu primenu modernih Android tehnika, uključujući upravljanje stanjem, integraciju sa ViewModel-om i podršku za tamni režim.
 - Omogućiti developerima jasno razumevanje kako Jetpack Compose može pojednostaviti i ubrzati razvoj Android aplikacija.

## Ključne funkcionalnosti aplikacije

1. **Home Feed**: Lista objava koja se može listati vertikalno, sa avatarima korisnika, korisničkim imenima, opisima i slikama.
2. **Stories**: Horizontalni prikaz priča na vrhu feed-a sa kružnim pregledima.
3. **Interakcije sa objavama**: Korisnici mogu lajkovati, komentarisati i deliti objave. Animacija srca se pojavljuje prilikom lajkovanja.
4. **Profil ekran**: Detaljan prikaz sa informacijama o korisniku, objavama, brojem pratilaca i praćenja.
5. **Podrška za tamni režim**: Integracija sa tamnim modom Android-a za bolju upotrebljivost u uslovima slabog osvetljenja.
6. **Modularnost komponenti**: Komponente poput pregleda priča, stavki objava i donje navigacione trake implementirane su kao višekratno upotrebljivi `Composable` elementi.


> [!TIP]
> ## Korišćenje aplikacije
>
> * **Uključivanje zavisnosti u projekat**:
>   * implementation 'androidx.activity:activity-compose:1.4.0'
>   * implementation 'androidx.lifecycl e:lifecycle-viewmodel-compose:1.0.0-alpha07'
>   * implementation 'androidx.compose.runtime:runtime-livedata:1.0.4'
> * **Za potrebe asinhronog programiranja uključiti i**:
>   * implementation 'org.jetbrains.kotlinx:kotlinx-coroutines-android:1.5.1' 
> * **Home Feed**:
>   * Početna stranica prikazuje listu objava korisnika
>   * Sadrži gornju navigacionu traku sa logotipom i donju navigaciju za brzo prebacivanje između ekrana.
> * **Stories**:
>   * Horizontalno listanje priča na vrhu feed-a.
>   * Krugovi priča se ažuriraju dinamički.
> * **Interakcije**:
>   * Klikom na dugme srca, korisnik može lajkovati objave.
>   * Animacija srca se pojavljuje pri svakoj akciji lajkovanja.
> * **Profil**:
>   * Detaljan pregled profila korisnika.
>   * Sadrži informacije o objavama, pratiocima i praćenju.
---

## Demo UI
<div align="center">
  <strong>Declarative UI</strong>
</div>
<div align="center">
  Kolekcija fotografija ekrana koja prikazuje vizuelni izled upotrebe Jetpack Compose tehnologije.
</div>
<br />
<div align="center">
 <img src = "https://github.com/anastasijavasicc/InstagramDemo/blob/main/Screens/Screenshot_20241208_160652_com.example.myrecepies.jpg" width = "300px"/>
 <img src = "https://github.com/anastasijavasicc/InstagramDemo/blob/main/Screens/Screenshot_20241208_160659_com.example.myrecepies.jpg" width = "300px"/>
 <img src = "https://github.com/anastasijavasicc/InstagramDemo/blob/main/Screens/Screenshot_20241208_160709_com.example.myrecepies.jpg" width = "300px"/>
</div>


## Poređenje sa tradicionalnim XML pristupom
**Tabela 1.** Poređenje Jetpack Compose-a sa tradicionalnim XML-om za izgradnju korisničkog interfejsa (UI)

| Karakteristika               | Jetpack Compose                            | XML pristup                                      |
|------------------------------|--------------------------------------------|--------------------------------------------------|
| **Količina koda**             | Znatno manja                               | Veoma velika                                      |
| **Deklarativni pristup**      | Da                                         | Ne                                               |
| **Integracija s Kotlinom**    | Prirodna i direktna                        | Zahteva `findViewById` i adaptere               |
| **Višekratna upotreba koda**  | Lako putem `Composable` funkcija           | Složenije putem `include` i prilagodbi          |
| **Podrška za stanje**         | Jednostavna (`remember`, `State`)          | Zahteva dodatni kod                             |
     
## Prednosti Jetpack Compose-a
 - **Deklarativni model**: Potpuno je deklarativan, što znači da možete opisati svoje UI komponente pozivanjem unapred definisanih funkcija.
 - **Manje koda**: Sve UI komponente se kreiraju direktno u Kotlin kodu.
 - **Kompatibilan**: Lako je kompatibilan sa postojećim prikazima (views) prisutnim u Androidu.
 - **Modularnost**: Višekratno upotrebljivi Composable elementi omogućavaju lakše održavanje i proširivanje aplikacije.
 - **Brže prototipiranje**: Sa alatima kao što su Preview i Hot Reload, omogućava brzo testiranje i iteracije.
 - **Lak za održavanje**: Pošto je celokupna baza koda aplikacije prisutna u jednoj datoteci, postaje lakše upravljati i održavati kod aplikacije.
 - **Napisan u Kotlinu**: Aplikacije napisane koristeći Jetpack Compose koriste 100% Kotlin programski jezik.
 - **Tamni režim**: Automatska podrška za prilagođavanje teme aplikacije.

## Komponente Jetpack Compose-a korišćene u aplikaciji

### 1. **Composable funkcije**
- Osnovni gradivni blokovi u Jetpack Compose-u.
- Svaka funkcija označena anotacijom *@Composable* predstavlja deo korisničkog interfejsa.
- One su reaktivne, što znači da automatski ažuriraju prikaz kada se podaci promene.

```kotlin
@Composable
fun InstagramHome() {}
```

### 2. **Preview funkcija**
- Za generisanje pogleda Composable funkcija.
- Umesto instaliranja APK-a na emulatoru ili virtuelnom uređaju, pomoću ove funkcije možemo pogledati UI direktno unutar IDE-a. *@Preview* anotacija se koristi za označavanje ovih funkcija.

### 3. **State Management (Upravljanje stanjem)**
- `State` omogućava praćenje i upravljanje podacima koji se dinamički menjaju tokom rada aplikacije. 
- State prati vrednosti koje utiču na prikaz korisničkog interfejsa.
- Promena vrednosti u State-u automatski osvežava deo interfejsa koji zavisi od tih podataka.
- `remember` i `mutableStateOf` se koriste za praćenje stanja korisničkog interfejsa, kao što je praćenje da li je objava lajkovana.

```kotlin
var isLiked by remember { mutableStateOf(false) }

var currentStoryCount by remember { mutableStateOf(0) }
var storyPaused by remember { mutableStateOf(false) }
var percent = remember { Animatable(0f) }
```

### 4. **Modifier**
- `Modifier` je objekat koji se koristi za prilagođavanje izgleda, rasporeda i ponašanja komponenata. Modifier može menjati dimenzije, poziciju, padding, margine, pozadinu, ponašanje na dodir i druge aspekte komponente.

```kotlin
modifier = Modifier
      .padding(16.dp)
      .background(Color.LightGray)
      .fillMaxWidth()
```

### 5. **Column i Row Layout-ovi**
- Koriste se za strukturiranje feed-a, priča i komponenti objava.
- Primer: Poravnavanje avatara korisnika i korisničkog imena horizontalno iznad slike objave.

```kotlin
Row(modifier = Modifier.padding(8.dp)) {
    Image(
        painter = painterResource(R.drawable.avatar),
        contentDescription = "Avatar korisnika",
        modifier = Modifier.size(40.dp).clip(CircleShape)
    )
    Spacer(modifier = Modifier.width(8.dp))
    Text(text = "Korisničko ime", style = MaterialTheme.typography.subtitle1)
}
```

```kotlin
Column(
        modifier = modifier
            .fillMaxWidth()
            .padding(8.dp)
    ) {
        ProfileSection(
            firstImageId = post.authorImageId,
            text = post.author,
            size = ProfileSectionSizes.medium(),
            iconRight = {
                Icon(
                    imageVector = Icons.Default.MoreVert,
                    contentDescription = "See more options"
                )
            }
        )
        PostImage(
            imageId = post.tweetImageId,
            contentDescription = post.text,
            modifier = Modifier.padding(top = 8.dp)
        )
}
```

### 6. **LazyColumn i LazyRow**
- `LazyColumn` se koristi za prikaz liste objava koje se mogu listati vertikalno.
- `LazyRow` omogućava horizontalno listanje priča.

```kotlin
LazyRow(
        modifier = modifier.padding(top = 8.dp, bottom = 8.dp),
    ) {
        items(profiles) {
            StoryItem(
                profileImageId = it.authorImageId,
                profileName = it.author,
                isMe = it.id == 1,
                onClick = onProfileClicked
            )
        }
    }
```

### 7. **Scaffold za strukturu ekrana**
- `Scaffold` se koristi za implementaciju doslednog rasporeda, uključujući gornju aplikacionu traku i donju navigacionu traku.

```kotlin
Scaffold(
    topBar = {
        TopAppBar(title = { Text("Instagram Demo") })
    },
    bottomBar = {
        BottomNavigation {
            BottomNavigationItem(
                selected = currentScreen == Screen.Home,
                onClick = { currentScreen = Screen.Home },
                icon = { Icon(Icons.Default.Home, contentDescription = null) },
                label = { Text("Početna") }
            )
        }
    }
) {
    Content(currentScreen)
}
```

## Praktična primena

Ova aplikacija demonstrira moć Jetpack Compose-a u kreiranju potpuno funkcionalnog korisničkog interfejsa sa minimalnim količinama koda. Razvojni timovi mogu:
- Brzo prototipirati UI dizajn.
- Iskoristiti tipovnu sigurnost i kompozabilnost Kotlin jezika.
- Integrisati aplikaciju sa ViewModel-om za upravljanje stanjem.

## Rešeni izazovi 🚀

1. **Efikasno renderovanje UI-a**: Deklarativna priroda Jetpack Compose-a osigurava da se samo potrebni delovi korisničkog interfejsa ponovo renderuju kada dođe do promene stanja.
2. **Responzivni dizajn**: Aplikacija se prilagođava različitim veličinama ekrana i orijentacijama.
3. **Višekratna upotreba koda**: Višekratno upotrebljivi `Composable` elementi pojednostavljuju održavanje koda i podstiču čistiju arhitekturu.
   

### **Alternativne tehnologije: Zašto Jetpack Compose?** 

Postoji nekoliko tehnologija koje se mogu koristiti za izradu korisničkih interfejsa na Android platformi. Međutim, svaka ima svoje prednosti i ograničenja:

- **XML Layouts:**  
  Tradicionalni način izrade korisničkog interfejsa koji koristi XML datoteke i manuelno povezivanje sa Kotlin ili Java kodom. Iako robustan, često dovodi do velike količine koda i slabije fleksibilnosti.

- **Flutter (Dart):**  
  Omogućava razvoj multiplatformskih aplikacija. Iako moćan, nije specifično optimizovan za Android i može imati izazove sa performansama i podrškom za specifične funkcionalnosti Android platforme.

- **SwiftUI (iOS):**  
  Slično Jetpack Compose-u, ali ograničeno na iOS platformu, što ga čini neupotrebljivim za Android aplikacije.

Dakle, Jetpack Compose se ističe kao najbolji izbor za razvoj Android aplikacija zahvaljujući deklarativnom pristupu, prirodnoj integraciji sa Kotlinom i moćnim alatima za upravljanje stanjem. Omogućava brži razvoj, manje koda i bolju modularnost.

---

## Zaključak

Instagram Demo Aplikacija pokazuje kako Jetpack Compose može transformisati razvoj modernih Android aplikacija. Njegov deklarativni pristup, u kombinaciji sa moćnim alatima poput `LazyColumn`, `Scaffold` i upravljanja stanjem, omogućava programerima da kreiraju zanimljiva i lako održiva korisnička iskustva.

Kroz izradu ovog projekta, stekla sam dublje razumevanje mogućnosti Jetpack Compose-a i njegove uloge u oblikovanju budućnosti razvoja za Android platformu. Ovaj projekat služi kao dokaz njegove efikasnosti i pogodnosti za programere.

---



