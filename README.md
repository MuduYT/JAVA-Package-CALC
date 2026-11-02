# Einfaches Java Package Beispiel

Dies ist ein sehr einfaches Java-Projekt, das die Verwendung von Java Packages demonstriert.

## Projektstruktur

```
Java/
├── src/
│   └── main/
│       └── java/
│           └── meinprojekt/
│               ├── Main.java           # Hauptklasse im Package "meinprojekt"
│               └── utils/
│                   └── MathematikHelfer.java  # Hilfsklasse im Sub-Package "meinprojekt.utils"
└── README.md
```

## Package-Struktur

- **meinprojekt**: Das Haupt-Package des Projekts
  - **Main**: Die Hauptklasse mit der main-Methode
  - **utils**: Ein Sub-Package für Hilfsklassen
    - **MathematikHelfer**: Eine Klasse mit mathematischen Methoden

## Das Projekt kompilieren und ausführen

### Manuelles Kompilieren und Ausführen

1. Zum Verzeichnis navigieren:
   ```bash
   cd C:\Users\itlabvi\Downloads\Java
   ```

2. Kompilieren:
   ```bash
   javac -d bin src/main/java/meinprojekt/*.java src/main/java/meinprojekt/utils/*.java
   ```

3. Ausführen:
   ```bash
   java -cp bin meinprojekt.Main
   ```

### Erwartete Ausgabe

```
Willkommen zum Java Package Beispiel!

Zahl 1: 10
Zahl 2: 5

Summe: 15
Produkt: 50
Durchschnitt: 7.5
```

## Was wird demonstriert?

1. **Package-Deklaration**: Jede Klasse deklariert ihr Package mit `package meinprojekt;` oder `package meinprojekt.utils;`
2. **Import von Klassen**: Die Main-Klasse importiert die Klasse aus dem Sub-Package mit `import meinprojekt.utils.MathematikHelfer;`
3. **Sub-Packages**: Die Klasse `MathematikHelfer` ist im Sub-Package `utils` organisiert
4. **Instanzmethoden**: Methoden, die ein Objekt benötigen (z.B. `addieren`, `multiplizieren`)
5. **Statische Methoden**: Methoden, die ohne Objekt aufgerufen werden können (z.B. `berechneDurchschnitt`)

## Erklärung der Packages

Packages in Java dienen dazu:
- Klassen logisch zu gruppieren
- Namenskonflikte zu vermeiden
- Zugriffskontrolle zu ermöglichen
- Code besser zu organisieren
