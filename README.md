# ImageGenerator
A quick pixel to block plugin i made cuz some tiktok kid said i couldnt

anyway, the source is in branch master.

# Intructions:
Usage: <b>/image \<filename> \<x direction> \<y direction> \<z direction> \<x> \<y> \<z></b>

or just

<b>/image \<filename> \<x direction> \<y direction> \<z direction></b>

specifying a location (the last 3 numbers) will make it draw at that location, otherwise it will just go to ur player pos.

Example: <b>/image image.png 0 -1 1</b>

this will render the file at location <b>"MyServer/plugins/ImageGenerator/image.png"</b> at the position of your player.
and each pixel it will move 

+0 blocks on the x axis, (flat)

-1 block on the y axis, (goes down)

1 block on the z axis, (goes some directon idk)

To get a picture to use, just have any .png .jpg .anythingelsethatssupportedbyImageIO and put it in the <b>"MyServer/plugins/ImageGenerator"</b> folder
(if it doesnt exist just create the folder stupid)

![alt text](https://github.com/Tuffdufroggins/ImageGenerator/blob/main/images/server-folder.png?raw=true)
ur normal server folder
![alt text](https://github.com/Tuffdufroggins/ImageGenerator/blob/main/images/plugins-folder.png?raw=true)
ur normal plugins folder (with the ImageGenerator folder)
![alt text](https://github.com/Tuffdufroggins/ImageGenerator/blob/main/images/pictures-folder.png?raw=true)
ur images

# How it works

basically, it just takes the image
gets the pixels (loops through width and height and uses <b>(BufferedImage) image.getRGB(col, row)</b>)
and compairs the color of that pixel to the average color of each block

then i made a list of minecraft blocks and the average color (as an int) of that block.

then it just loops through the block colors and finds the closest distance between the block color and the pixel color

it then puts that block at the right location in the world (according to ur <b>\<x direction> \<y direction> \<z direction></b>)

I made a seperate program to scan through all the block pngs and calculate the average color then format it so i can just copy and paste them into my code.

# Issues that i know about but dont care enough to solve

transparency worked for a lil bit, then didnt after i added every block (uses gray glass instead)

diagonal renders dont all work cuz it can either use the pixel row or collumn and im too lazy to make controls for that so i just chose one for each dimension and hard coded it


idk dude i got school i cant be bothered fight me
