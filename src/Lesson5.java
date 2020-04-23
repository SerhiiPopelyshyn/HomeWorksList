//* Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст;
//* Конструктор класса должен заполнять эти поля при создании объекта;
//* Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль;
//* Создать массив из 5 сотрудников
//Пример:
//Person[] persArray = new Person[5]; // Вначале объявляем массив объектов
//persArray[0] = new Person("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30); // потом для каждой ячейки массива задаем объект
//persArray[1] = new Person(...);
//...
//persArray[4] = new Person(...);
//
//* С помощью цикла вывести информацию только о сотрудниках старше 40 лет;

class Person {
    private String fio;
    private String post;
    private String email;
    private String tel;
    private double salary;
    private int age;

    Person(String fio, String post, String email, String tel, double salary, int age) {
        this.fio = fio;
        this.post = post;
        this.email = email;
        this.tel = tel;
        this.salary = salary;
        if (age >= 18) {
            this.age = age;
        } else {
            System.out.println("Сотрудник должен быть старше 18 лет");
        }
    }

    int GetAge() {
        return age;
    }

    void Show() {
        System.out.println(fio + " " + post + " " + email + " " + tel + " " + salary + " " + age);
    }
}

class Main {

    public static void main(String[] args) {

        Person[] persArray = new Person[5];
        persArray[0] = new Person("Иванов Иван", "Инженер", "ii@gmail.com", "+79996669966", 30000, 54);
        persArray[1] = new Person("Петров Петя", "Программист", "pp@gmail.com", "+79996669966", 30000, 21);
        persArray[2] = new Person("Васильев Василий", "Водитель", "vv@gmail.com", "+79996669966", 30000, 55);
        persArray[3] = new Person("Николавьев Николай", "Продавец", "nn@gmail.com", "+79166420458", 40000, 36);
        persArray[4] = new Person("Андреев Андрей", "Стоматолог", "aa@gmail.com", "+79996669966", 30000, 44);

        for (Person item : persArray) {
            if (item.GetAge() > 40) item.Show();
        }
    }
}