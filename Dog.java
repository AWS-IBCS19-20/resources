class Dog {

  private String name;
  private Integer age;
  private String breed;
  private Boolean aggressive;

  public Dog() {
    name = "Poppy";
    age = 5;
    breed = "mut";
    aggressive = false;
  }

  public void bark() {
    System.out.println("Bark Bark!");
  }

  public String isAngry() {

    return  "dog is mad";
  }

  public static void main(String[] args) {
    Dog d = new Dog();
    System.out.println(d.name);
    System.out.println(d.age);
    System.out.println(d.aggressive);

    d.bark();
    System.out.println(d.isAngry());
  }
}
