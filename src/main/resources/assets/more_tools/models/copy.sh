#!/usr/bin/env sh

for TOOL in "axe" "hoe" "pickaxe" "shovel" "sword"
do
    for MATERIAL in "birch" "crimson" "dark_oak" "jungle" "oak" "warped"
    do
        sed -i 's/$MATERIAL/'"$MATERIAL"'/g' ${MATERIAL}_${TOOL}.json
    done
done
