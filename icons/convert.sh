for i in *.svg
do
  inkscape -z -e $i.png -w 64 -h 64 $i
done
