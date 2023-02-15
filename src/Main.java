public class Main {
    static Employee[] employee = new Employee[10];

    public static void main(String[] args) {

        employee[0] = new Employee("Иванов Иван Иванович", 3, 50000);
        employee[1] = new Employee("Петров Петр Петрович", 3, 60000);
        employee[2] = new Employee("Алексеев Алексей Алексеевич", 1, 75000);
        employee[3] = new Employee("Яковлев Яков Яковлевич", 4, 100000);
        employee[4] = new Employee("Евгеньев Евгений Евгеньевич", 5, 200000);
        employee[5] = new Employee("Александров Александр Александрович", 1, 76000);
        employee[6] = new Employee("Кириллов Кирилл Кириллович", 2, 90000);
        employee[7] = new Employee("Сергеев Сергей Сергеевич", 4, 80000);
        employee[8] = new Employee("Васильев Василий Васильевич", 2, 92000);
        employee[9] = new Employee("Дмитриев Дмитрий Дмитриевич", 5, 110000);

        //Список данных по всем сотрудникам:
        listDataAllEmployees();

        System.out.println("**********************************************************");

        //Сумма затрат на зарплаты в месяц:
        System.out.println("Сумма затрат на зарплаты в месяц: " + getSumSalaries() + " руб.");

        System.out.println();
        System.out.println("**********************************************************");

        //Сотрудник с минимальной зарплатой:
        minSalary();

        System.out.println("**********************************************************");

        //Сотрудник с максимальной зарплатой:
        maxSalary();

        System.out.println("**********************************************************");

        //Среднее значение зарплат в месяц:
        System.out.println("Среднее значение зарплат в месяц: " + getAverageSalary() + " руб.");

        System.out.println();
        System.out.println("**********************************************************");

        //Список сотрудников ФИО:
        listEmployees();

        System.out.println("**********************************************************");

        //Список данных по всем сотрудникам после индексации:
        listDataAllEmployeesAfterIndexation();

        System.out.println("**********************************************************");

        //Сотрудник с минимальной зарплатой в отделе
        minSalaryInDepartment();

        System.out.println("**********************************************************");

        //Сотрудник с максимальной зарплатой в отделе
        maxSalaryInDepartment();

        System.out.println("**********************************************************");

        //Сумма затрат на зарплаты в отделе в месяц:
        System.out.println("Сумма затрат на зарплаты в отделе " + numberDepartment + " в месяц: " + getSumSalariesInDepartment() + " руб.");

        System.out.println();
        System.out.println("**********************************************************");

        //Среднее значение зарплат по отделу:
        System.out.println("Среднее значение зарплат по отделу " + numberDepartment + ": " + getAverageSalaryInDepartment() + " руб.");
        System.out.println();

        System.out.println("**********************************************************");

        //Список сотрудников в отделе:
        listEmployeesOfDepartment();

        System.out.println("**********************************************************");

        //Список сотрудников с зарплатой больше или равно указанной:
        searchEmployeesSalaryHigherSalaryToCompare();

        System.out.println("**********************************************************");

        //Список сотрудников с зарплатой меньше указанной:
        searchEmployeesSalaryLessSalaryToCompare();
    }

    private static void listDataAllEmployees() {
        System.out.println("Список данных по всем сотрудникам:");
        for (Employee i: employee) {
            System.out.println(i);
        }
        System.out.println();
    }

    private static int getSumSalaries() {
        int sum = 0;
        for (Employee i : employee) {
            sum += i.getSalary();
        }
        return sum;
    }

    private static void minSalary() {
        var min = employee[0];
        for (Employee i : employee) {
            if (i.getSalary() < min.getSalary()) {
                min = i;
            }
        }
        System.out.println("Сотрудник с минимальной зарплатой: " + min.getFio());
        System.out.println("Его оклад: " + min.getSalary() + " руб.");
        System.out.println();
    }

    private static void maxSalary() {
        var max = employee[0];
        for (Employee i : employee) {
            if (i.getSalary() > max.getSalary()) {
                max = i;
            }
        }
        System.out.println("Сотрудник с максимальной зарплатой: " + max.getFio());
        System.out.println("Его оклад: " + max.getSalary() + " руб.");
        System.out.println();
    }

    private static double getAverageSalary() {
        int sum = getSumSalaries();
        return (double) sum / employee.length;
    }

    private static void listEmployees() {
        System.out.println("Список сотрудников:");
        for (Employee i: employee) {
            System.out.println(i.getFio());
        }
        System.out.println();
    }

    private static void salaryIndexation() {
        int index = 10;
        for (Employee i : employee) {
            i.setSalary(i.getSalary() + i.getSalary() * index / 100);
        }
    }

    private static void listDataAllEmployeesAfterIndexation() {
        salaryIndexation();
        System.out.println("Список данных по всем сотрудникам после индексации:");
        for (Employee i: employee) {
            System.out.println(i + " ");
        }
        System.out.println();
    }

    static int numberDepartment = 2;

    private static void minSalaryInDepartment() {
        var min = employee[0];
        for (Employee i : employee) {
            if (i.getDepartment() == numberDepartment) {
                min = i;
                for (Employee j : employee) {
                    if (j.getDepartment() == min.getDepartment() && j.getSalary() < min.getSalary()) {
                        min = j;
                    }
                }
            }
        }
        System.out.println("Сотрудник с минимальной зарплатой в отделе " + numberDepartment + ": " + min.getFio());
        System.out.println("Его оклад: " + min.getSalary() + " руб.");
        System.out.println();
    }

    private static void maxSalaryInDepartment() {
        var max = employee[0];
        for (Employee i : employee) {
            if (i.getDepartment() == numberDepartment) {
                max = i;
                for (Employee j : employee) {
                    if (j.getDepartment() == max.getDepartment() && j.getSalary() > max.getSalary()) {
                        max = j;
                    }
                }
            }
        }
        System.out.println("Сотрудник с максимальной зарплатой в отделе " + numberDepartment + ": " + max.getFio());
        System.out.println("Его оклад: " + max.getSalary() + " руб.");
        System.out.println();
    }

    private static int getSumSalariesInDepartment() {
        int sum = 0;
        for (Employee i : employee) {
            if (i.getDepartment() == numberDepartment) {
                sum += i.getSalary();
            }
        }
        return sum;
    }

    private static double getAverageSalaryInDepartment() {
        int sum = 0;
        int amount = 0;
        for (Employee i : employee) {
            if (i.getDepartment() == numberDepartment) {
                sum += i.getSalary();
                amount++;
            }
        }
        return (double) sum / amount;
    }

    private static void departmentSalariesIndexation() {
        int index = 10;
        for (Employee i : employee) {
            if (i.getDepartment() == numberDepartment) {
                i.setSalary(i.getSalary() + i.getSalary() * index / 100);
            }
        }
    }

    private static void listEmployeesOfDepartment() {
        departmentSalariesIndexation();
        System.out.println("Список сотрудников в отделе " + numberDepartment + ": ");
        for (Employee i: employee) {
            if (i.getDepartment() == numberDepartment) {
                System.out.println("ФИО: " + i.getFio() + ", оклад: " + i.getSalary());
            }
        }
        System.out.println();
    }

    static int salaryToCompare = 100000;

    private static void searchEmployeesSalaryHigherSalaryToCompare() {
        System.out.println("Список сотрудников с зарплатой больше или равно " + salaryToCompare + " руб.: ");
        int id = 0;
        for (Employee i: employee) {
            if (i.getSalary() >= salaryToCompare) {
                id++;
                System.out.println(id + ". " + i.getFio() + ", оклад: " + i.getSalary());
            }
        }
        System.out.println();
    }
    
    private static void searchEmployeesSalaryLessSalaryToCompare() {
        System.out.println("Список сотрудников с зарплатой меньше " + salaryToCompare + " руб.: ");
        int id = 0;
        for (Employee i: employee) {
            if (i.getSalary() < salaryToCompare) {
                id++;
                System.out.println(id + ". " + i.getFio() + ", оклад: " + i.getSalary());
            }
        }
    }
}
