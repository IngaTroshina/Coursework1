import java.util.Objects;

public class Employee {
    private String FIO;
    private int department;
    private int salary;
    private int id;
    private static int counter;

    public Employee(String FIO, int department, int salary){
        this.FIO = FIO;
        this.department = department;
        this.salary = salary;
        id = ++counter;
    }
    public static void listDataAllEmployees() {
        System.out.println("Список данных по всем сотрудникам:");
        for (Employee i: Main.employee) {
            System.out.println(i + " ");
        }
        System.out.println();
    }

    public static void sumSalaries() {
        int sum = 0;
        for (Employee i : Main.employee) {
            sum += i.getSalary();
        }
        System.out.println("Сумма затрат на зарплаты в месяц: " + sum + " руб.");
        System.out.println();
    }
    public static void minSalary() {
        var min = Main.employee[0];
        for (Employee i : Main.employee) {
            if (i.getSalary() < min.getSalary()) {
                min = i;
            }
        }
        System.out.println("Сотрудник с минимальной зарплатой: " + min.getFIO());
        System.out.println("Его оклад: " + min.getSalary() + " руб.");
        System.out.println();
    }
    public static void maxSalary() {
        var max = Main.employee[0];
        for (Employee i : Main.employee) {
            if (i.getSalary() > max.getSalary()) {
                max = i;
            }
        }
        System.out.println("Сотрудник с максимальной зарплатой: " + max.getFIO());
        System.out.println("Его оклад: " + max.getSalary() + " руб.");
        System.out.println();
    }

    public static void averageSalary() {
        int sum = 0;
        for (Employee i : Main.employee) {
            sum += i.getSalary();
        }
        var average = sum / Main.employee.length;
        System.out.println("Среднее значение зарплат в месяц: " + average + " руб.");
        System.out.println();
    }

    public static void listEmployees() {
        System.out.println("Список сотрудников:");
        for (Employee i: Main.employee) {
            System.out.println(i.getFIO());
        }
        System.out.println();
    }

    public static void salaryIndexation() {
        int index = 10;
        for (Employee i : Main.employee) {
            i.salary = i.getSalary() + i.getSalary() * index / 100;
        }
    }
    public static void listDataAllEmployeesAfterIndexation() {
        salaryIndexation();
        System.out.println("Список данных по всем сотрудникам после индексации:");
        for (Employee i: Main.employee) {
            System.out.println(i + " ");
        }
        System.out.println();
    }

    static int numberDepartment = 2;

    public static void minSalaryInDepartment() {
        var min = Main.employee[0];
        for (Employee i : Main.employee) {
            if (i.getDepartment() == getNumberDepartment()) {
                min = i;
                for (Employee j : Main.employee) {
                    if (j.getDepartment() == min.getDepartment() && j.getSalary() < min.getSalary()) {
                        min = j;
                    }
                }
            }
        }
                System.out.println("Сотрудник с минимальной зарплатой в отделе " + numberDepartment + ": " + min.getFIO());
                System.out.println("Его оклад: " + min.getSalary() + " руб.");
                System.out.println();
    }

    public static void maxSalaryInDepartment() {
        var max = Main.employee[0];
        for (Employee i : Main.employee) {
            if (i.getDepartment() == getNumberDepartment()) {
                max = i;
                for (Employee j : Main.employee) {
                    if (j.getDepartment() == max.getDepartment() && j.getSalary() > max.getSalary()) {
                        max = j;
                    }
                }
            }
        }
        System.out.println("Сотрудник с максимальной зарплатой в отделе " + numberDepartment + ": " + max.getFIO());
        System.out.println("Его оклад: " + max.getSalary() + " руб.");
        System.out.println();
    }
    public static void sumSalariesInDepartment() {
        int sum = 0;
        for (Employee i : Main.employee) {
            if (i.getDepartment() == getNumberDepartment()) {
                sum += i.getSalary();
            }
        }
        System.out.println("Сумма затрат на зарплаты в отделе " + numberDepartment + " в месяц: " + sum + " руб.");
        System.out.println();
    }
    public static void averageSalaryInDepartment() {
        int sum = 0;
        int amount = 0;
        for (Employee i : Main.employee) {
            if (i.getDepartment() == getNumberDepartment()) {
                sum += i.getSalary();
                amount++;
            }
        }
        var average = sum / amount;
        System.out.println("Среднее значение зарплат по отделу " + numberDepartment + ": " + average + " руб.");
        System.out.println();
    }

    public static void departmentSalariesIndexation() {
        int index = 10;
        for (Employee i : Main.employee) {
            if (i.getDepartment() == getNumberDepartment()) {
                i.salary = i.getSalary() + i.getSalary() * index / 100;
            }
        }
    }
    public static void listEmployeesOfDepartment() {
        departmentSalariesIndexation();
        System.out.println("Список сотрудников в отделе " + numberDepartment + ": ");
        for (Employee i: Main.employee) {
            if (i.getDepartment() == getNumberDepartment()) {
                System.out.println("ФИО: " + i.getFIO() + ", оклад: " + i.getSalary());
            }
        }
        System.out.println();
    }

    static int salaryToCompare = 100000;

    public static void searchEmployeesSalaryHigherSalaryToCompare() {
        System.out.println("Список сотрудников с зарплатой больше или равно " + salaryToCompare + " руб.: ");
        int id = 0;
        for (Employee i: Main.employee) {
            if (i.getSalary() >= getSalaryToCompare()) {
                id++;
                System.out.println(id + ". " + i.getFIO() + ", оклад: " + i.getSalary());
            }
        }
        System.out.println();
    }
    public static void searchEmployeesSalaryLessSalaryToCompare() {
        System.out.println("Список сотрудников с зарплатой меньше " + salaryToCompare + " руб.: ");
        int id = 0;
        for (Employee i: Main.employee) {
            if (i.getSalary() < getSalaryToCompare()) {
                id++;
                System.out.println(id + ". " + i.getFIO() + ", оклад: " + i.getSalary());
            }
        }
    }

    public int getDepartment() {
        return department;
    }

    public int getSalary() {
        return salary;
    }

    public int getId() {
        return id;
    }

    public static int getNumberDepartment() {
        return numberDepartment;
    }

    public String getFIO() {
        return FIO;
    }

    public static int getSalaryToCompare() {
        return salaryToCompare;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public static void setSalaryToCompare(int salaryToCompare) {
        Employee.salaryToCompare = salaryToCompare;
    }

    public static void setNumberDepartment(int numberDepartment) {
        Employee.numberDepartment = numberDepartment;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return department == employee.department && salary == employee.salary && id == employee.id && Objects.equals(FIO, employee.FIO);
    }

    @Override
    public int hashCode() {
        return Objects.hash(FIO, department, salary, id);
    }

    @Override
    public String toString() {
        return this.id + ". " + "Сотрудник: " + this.FIO + ", отдел: " + this.department + ", оклад: " + this.salary + " руб.";
    }
}
