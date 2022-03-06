package ru.skypro;

public class Main {
    public static Employee[] employees = new Employee[10];

    public static void printEmployees() {
        System.out.println("Данные всех сотрудников: ");
        for (Employee employee : employees) {
            if (employee != null) {
                System.out.println(employee);
            }
        }
    }

    public static int calculateTotalSalary() {
        int sum = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                sum += employee.getSalary();
            }
        }
        return sum;
    }

    public static Employee findEmployeeWithMinSalary() {
        Employee result = employees[0];
        int minSalary = employees[0].getSalary();
        for (Employee employee : employees) {
            if (employee != null) {
                if (employee.getSalary() < minSalary) {
                    minSalary = employee.getSalary();
                    result = employee;
                }
            }
        }
        return result;
    }

    public static Employee findEmployeeWithMaxSalary() {
        Employee result = employees[0];
        int maxSalary = employees[0].getSalary();
        for (Employee employee : employees) {
            if (employee != null) {
                if (employee.getSalary() > maxSalary) {
                    maxSalary = employee.getSalary();
                    result = employee;
                }
            }
        }
        return result;
    }

    public static float calculateAverageSalary() {
        int n = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                n++;
            }
        }
        return calculateTotalSalary() / (float) n;
    }

    public static void printTotalSalary() {
        System.out.println("Сумма затрат на зарплаты " + calculateTotalSalary() + " рублей в месяц");
    }

    public static void printEmployeeWithMinSalary() {
        System.out.println("Работник с самой маленькой зарплатой - " + findEmployeeWithMinSalary());
    }

    public static void printEmployeeWithMaxSalary() {
        System.out.println("Работник с самой большой зарплатой - " + findEmployeeWithMaxSalary());
    }

    public static void printAverageSalary() {
        System.out.println("Среднее значение зарплат: " + calculateAverageSalary() + " рублей");
    }

    public static void printFullNames() {
        System.out.println("Ф.И.О. всех сотрудников:");
        for (Employee employee : employees) {
            if (employee != null) {
                System.out.println(employee.getFullName());
            }
        }
    }

    public static void main(String[] args) {
        employees[0] = new Employee("Иванов Иван Иванович", 1, 35_000);
        employees[1] = new Employee("Петров Петр Петрович", 2, 25_000);
        employees[2] = new Employee("Сидоров Иван Семенович", 3, 15_000);
        employees[3] = new Employee("Смирнов Станислав Яковлевич", 4, 50_000);
        employees[4] = new Employee("Иванов Александр Сергеевич", 5, 75_000);
        employees[5] = new Employee("Зимин Александр Александрович", 5, 75_000);
        printEmployees();
        printTotalSalary();
        printEmployeeWithMinSalary();
        printEmployeeWithMaxSalary();
        printAverageSalary();
        printFullNames();
    }
}