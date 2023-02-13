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
        Employee.listDataAllEmployees();

        System.out.println("**********************************************************");

        //Сумма затрат на зарплаты в месяц:
        Employee.sumSalaries();

        System.out.println("**********************************************************");

        //Сотрудник с минимальной зарплатой:
        Employee.minSalary();

        System.out.println("**********************************************************");

        //Сотрудник с максимальной зарплатой:
        Employee.maxSalary();

        System.out.println("**********************************************************");

        //Среднее значение зарплат в месяц:
        Employee.averageSalary();

        System.out.println("**********************************************************");

        //Список сотрудников ФИО:
        Employee.listEmployees();

        System.out.println("**********************************************************");

        //Список данных по всем сотрудникам после индексации:
        Employee.listDataAllEmployeesAfterIndexation();

        System.out.println("**********************************************************");

        //Сотрудник с минимальной зарплатой в отделе
        Employee.minSalaryInDepartment();

        System.out.println("**********************************************************");

        //Сотрудник с максимальной зарплатой в отделе
        Employee.maxSalaryInDepartment();

        System.out.println("**********************************************************");

        //Сумма затрат на зарплаты в отделе в месяц:
        Employee.sumSalariesInDepartment();

        System.out.println("**********************************************************");

        //Среднее значение зарплат по отделу:
        Employee.averageSalaryInDepartment();

        System.out.println("**********************************************************");

        //Список сотрудников в отделе:
        Employee.listEmployeesOfDepartment();

        System.out.println("**********************************************************");

        //Список сотрудников с зарплатой больше или равно указанной:
        Employee.searchEmployeesSalaryHigherSalaryToCompare();

        System.out.println("**********************************************************");

        //Список сотрудников с зарплатой меньше указанной:
        Employee.searchEmployeesSalaryLessSalaryToCompare();
    }
}
