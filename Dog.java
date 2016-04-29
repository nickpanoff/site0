class Dog {
    String name;
    public static void main (String[] args) {
	
	// Создаем объект Dog и получаем к нему доступ
	Dog dog1 = new Dog();
	dog1.bark();
	dog1.name = "SUICIDE MACHINE";

	// Создаем массив типа Dog
	Dog[] myDogs = new Dog[3];
	myDogs[0] = new Dog();
	myDogs[1] = new Dog();
	myDogs[2] = dog1;

	myDogs[0].name = "FRED";
	myDogs[1].name = "GEORGE";

	System.out.println("MY 3RD DOGs NAME IS - " + myDogs[2].name);

	int x = 0;
	while(x < myDogs.length) {
	    myDogs[x].bark();
	    x = x + 1;
	}
    }
    public void bark () {
	System.out.println(name + " BARK ! ");
    }
    public void eat() { }
    public void chaseCat() { }
}
