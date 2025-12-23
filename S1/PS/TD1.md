# Exercices

### TD1 - Exercice 1

```shell
# 1)
ls rapport*
# 2)
ls ??????.???
# 3)
ls *[12]*.jpg
# 4)
ls data[A-z0-9].csv
```

#### 5)

ls *[!0-9].jpg

lister les fichiers dont le cacactère précédent l'extension .jpg n'est pas un chiffre.

### TD1 - Exercice 2

```shell
# 1) a)
/home/A01/etudiant1/journal
# 1) b) 
..
# 1) c)
/home/A01/etudiant1/travaux/f1
# 1) d)
../travaux/f2
# 1) e)
 /home/A01/etudiant2/divers/f5
# 1) f)
../../etudiant2/divers/f5
# 1) g)
/bin
# 1) h)
../../../../bin
# 1) i)
/home/A02/etudiant3
# 1) j)
../../../A02/etudiant3


# 2) a)
ls
# 2) b)
ls ../travaux/
# 2) c)
pwd
# 2) d)
mkdir lundi
# 2) e)
touch cr.txt
# 2) j)
mv ../travaux/f2 lundi/urgent
# 2) f)
cp f1 ../travaux/f3
# 2) g)
cp ../../etudiant2/divers/f5 .
# 2) h)
mv f5 fich_etudiant2
# 2) i)
mv f2 ../
# 2) k)
ls -R ~/SE/TD1/EX2/
```

### TD1 - Exercice 3

#### 1)

- Les fichiers invisibles sont des fichiers réguliers dont le nom commence par le caractère point « . ».
  
- On utilise l’option -a avec la commande ls pour les afficher
  

#### 2)

- Non il n'y pas de différence, par ce que l'ordre des options n'est pas important avec la commande.

#### 3)

- la commande b
