public static void playWith(Bird bird) {
    bird.fly();
}

Parrot myPet;
playWith(myPet); // myPet "is-a" bird and can fly()

Penguin myOtherPet;
playWith(myOtherPet); // myOtherPet "is-a" bird
// and cannot fly()?!