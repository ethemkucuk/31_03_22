package tiktak;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class TikTak {

static String[][] arrMatris;
static boolean hamle = false;
static boolean kazananVarMı = false;
static ArrayList<String> arrHamleler;

public static void main(String[] args) {
arrMatris = new String[3][3];
bilgisayarBilgisayarOyna();
}

public static void bilgisayarBilgisayarOyna() {
Random rnd = new Random();
basla();
olasiHamleler();
for (int i = 0; i < 9; i++) {
kazananVarMı = kazananVarMı();
if (!kazananVarMı) {
int randomHamle = rnd.nextInt(arrHamleler.size());
String koordinat = arrHamleler.get(randomHamle);
arrHamleler.remove(randomHamle);

System.out.println(koordinat);
int satir = Integer.parseInt("" + koordinat.charAt(0));
int sutun = Integer.parseInt("" + koordinat.charAt(2));
oyna(!hamle, satir, sutun);
yazdir();
} else {
String kazanan;
if (hamle) {
kazanan = "o";
} else {
kazanan = "x";
}
System.out.println("Oyun Bitti.Kazanan " + kazanan);
return;
}
System.out.println("");
}
System.out.println("Oyun Bitti.Oyun Berabere.");
}

public static void ikiKisilikOyna() {

Scanner giris = new Scanner(System.in);
//System.out.println(arrMatris.length);
basla();
yazdir();
for (int i = 0; i < 9; i++) {
kazananVarMı = kazananVarMı();
if (!kazananVarMı) {
System.out.println("Hamle Girin:");
String koordinat = giris.nextLine();
System.out.println(koordinat);
int satir = Integer.parseInt("" + koordinat.charAt(0));
int sutun = Integer.parseInt("" + koordinat.charAt(2));
System.out.println(satir + "," + sutun);
oyna(!hamle, satir, sutun);
yazdir();
} else {
String kazanan;
if (hamle) {
kazanan = "o";
} else {
kazanan = "x";
}
System.out.println("Oyun Bitti.Kazanan " + kazanan);
return;
}

}
System.out.println("Oyun Bitti.Oyun Berabere.");
}

public static void olasiHamleler() {
arrHamleler = new ArrayList<>();
for (int i = 1; i < 4; i++) {
for (int j = 1; j < 4; j++) {
String strHamle = i + " " + j;
arrHamleler.add(strHamle);
// System.out.println(strHamle);
}
}
}

public static void yazdir() {
for (int i = 0; i < 3; i++) {
for (int j = 0; j < 3; j++) {
System.out.print(arrMatris[i][j]);
}
System.out.println("");
}
}

public static void basla() {
for (int i = 0; i < 3; i++) {
for (int j = 0; j < 3; j++) {
arrMatris[i][j] = "- ";
}
}
}

public static void oyna(boolean x, int i, int j) {
if (arrMatris[i - 1][j - 1].equalsIgnoreCase("- ")) {
if (x) {
arrMatris[i - 1][j - 1] = "o ";
} else {
arrMatris[i - 1][j - 1] = "x ";
}
hamle = !hamle;
} else {
System.out.println("Buraya Hamle Yapamazsınız");
}
}

public static boolean kazananVarMı() {
String harf = arrMatris[1][1];
if (!harf.equalsIgnoreCase("- ")) {
if (arrMatris[1][0].equals(harf) && arrMatris[1][2].equals(harf)) {
System.out.println("orta yatay");
return true;
} else if (arrMatris[2][0].equals(harf) && arrMatris[0][2].equals(harf)) {
System.out.println("sag ustten,sol alta capraz");
return true;
} else if (arrMatris[0][0].equals(harf) && arrMatris[2][2].equals(harf)) {
System.out.println("sol ustten,sag alta capraz");
return true;
} else if (arrMatris[0][1].equals(harf) && arrMatris[2][1].equals(harf)) {
System.out.println("orda dikey");
return true;
}
}

harf = arrMatris[0][0];
if (!harf.equalsIgnoreCase("- ")) {
if (arrMatris[0][1].equals(harf) && arrMatris[0][2].equals(harf)) {
System.out.println("ust yatay");
return true;
} else if (arrMatris[1][0].equals(harf) && arrMatris[2][0].equals(harf)) {
System.out.println("ust dikey");
return true;
}
}

harf = arrMatris[2][0];
if (!harf.equalsIgnoreCase("- ")) {

if (arrMatris[2][1].equals(harf) && arrMatris[2][2].equals(harf)) {
System.out.println("alt yatay");
return true;
}
}

harf = arrMatris[0][2];
if (!harf.equalsIgnoreCase("- ")) {
if (arrMatris[1][2].equals(harf) && arrMatris[2][2].equals(harf)) {
System.out.println("son dikey");
return true;
}
}

return false;
}

}
