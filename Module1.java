import java.text.DecimalFormat;
import java.util.Scanner;

public class Module1 {
    public static void linearTask1() {
        //Задание 1
        int a;
        int b;
        int c;
        Scanner console = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        a=console.nextInt();
        System.out.print("Введите второе число: ");
        b=console.nextInt();
        System.out.print("Введите третье число: ");
        c=console.nextInt();
        int z;
        z=((a-3)*b/2)+c;
        System.out.println("z=((a-3)*b/2)+c = "+z);
    }

    public static void linearTask2(){
        // Задание 2
        double argA;
        double argB;
        double argC;
        double result;
        Scanner console = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        argA=console.nextDouble();
        System.out.print("Введите второе число: ");
        argB=console.nextDouble();
        System.out.print("Введите третье число: ");
        argC=console.nextDouble();
        result=((argB+Math.sqrt(Math.pow(argB,2)+4*argA*argC))/2*argA)-(Math.pow(argA,3)*argC)+Math.pow(argB,-2);
        System.out.println(result);
    }

    public static void linearTask3(){
        //Задание 3
        double x;
        double y;
        double res;
        Scanner console = new Scanner(System.in);
        System.out.print("Введите x: ");
        x=console.nextDouble();
        System.out.print("Введите y: ");
        y=console.nextDouble();
        res = ((Math.sin(x)+Math.cos(y))/(Math.cos(x)-Math.sin(y)))*Math.tan(x*y);
        System.out.println(res);
    }

    public static void linearTask4(){
        double number;
        double leftPart;
        double rightPart;
        double helper;
        double res;
        Scanner console = new Scanner(System.in);
        System.out.print("Введите число формата ццц.ддд: ");
        number=console.nextDouble();
        helper=Math.floor(number);
        rightPart=helper/1000;
        leftPart=(number-(int)helper)*1000;
        res = rightPart+leftPart;
        System.out.printf("%.3f",res);
    }

    public static void linearTask5(){
        int timeInSeconds;
        int hours;
        int minutes;
        int seconds;
        int helperM;
        Scanner console = new Scanner(System.in);
        System.out.print("Введите количество секунд: ");
        timeInSeconds=console.nextInt();
        hours = timeInSeconds/3600;
        helperM = timeInSeconds-hours*3600;
        minutes=helperM/60;
        seconds=helperM-minutes*60;
        System.out.printf("%dHH.%dMM.%dSS",hours,minutes,seconds);
    }

    public static void linearTask6(){
        int x;
        int y;
        boolean flagX;
        boolean flagY;
        boolean flagXSecond;
        boolean flagYSecond;
        boolean result;
        Scanner console = new Scanner(System.in);
        System.out.print("Введите координаты х и у: ");
        x=console.nextInt();
        y=console.nextInt();
        flagY = (y>=0 && y<=4)? true : false;
        flagX = (x>=-2 && x<=2)? true: false;
        flagXSecond=(x>=-4 && x<=4)? true: false;
        flagYSecond=(y>=-3 && y<=0)? true: false;
        result=((flagY==true && flagX==true) || (flagYSecond==true && flagXSecond==true))? true: false;
        System.out.println(result);
    }

    public static void branchingTask1(){
        int firstAngle;
        int secondAngle;
        boolean check90Degrees;
        String answer;
        Scanner console = new Scanner(System.in);
        System.out.print("Введите два угла в градусах: ");
        firstAngle=console.nextInt();
        secondAngle=console.nextInt();
        if (firstAngle+secondAngle<180) {
            check90Degrees=(180-(firstAngle+secondAngle)==90)? true: false;
            answer=(check90Degrees==true)? "Такой треугольник существует. Он прямоугольный.": "Такой треугольник существует. Он не прямоугольный.";
        }
        else {
            answer="Такого треугольника не существует.";
        }
        System.out.println(answer);
    }

    public static void branchingTask2(){
        double numberA;
        double numberB;
        double numberC;
        double numberD;
        double minAB;
        double minCD;
        double max;
        Scanner console = new Scanner(System.in);
        System.out.print("Введите число а: ");
        numberA=console.nextDouble();
        System.out.print("Введите число b: ");
        numberB=console.nextDouble();
        System.out.print("Введите число c: ");
        numberC=console.nextDouble();
        System.out.print("Введите число d: ");
        numberD=console.nextDouble();
        if (numberA < numberB){
            minAB = numberA;
        }
        else {
            minAB = numberB;
        }
        System.out.println("min(a,b) = "+minAB);
        if (numberC < numberD){
            minCD = numberC;
        }
        else {
            minCD = numberD;
        }
        System.out.println("min(c,d) = "+minCD);
        if (minAB > minCD){
            max = minAB;
        }
        else {
            max = minCD;
        }
        System.out.println("Max{min(a,b) , min(c,d)} = "+max);
    }

    public static void branchingTask3(){
        int x_1;
        int x_2;
        int x_3;
        int y_1;
        int y_2;
        int y_3;
        String answer;
        Scanner console = new Scanner(System.in);
        System.out.print("Введите координаты точки А: ");
        x_1 = console.nextInt();
        y_1 = console.nextInt();
        System.out.print("Введите координаты точки B: ");
        x_2 = console.nextInt();
        y_2 = console.nextInt();
        System.out.print("Введите координаты точки C: ");
        x_3 = console.nextInt();
        y_3 = console.nextInt();
        if ((x_3 - x_1) / (x_2 - x_1) == (y_3 - y_1) / (y_2 - y_1)) {
            answer = "Точки лежат на одной прямой";
        }
        else {
            answer = "Точки не лежат на одной прямой";
        }
        System.out.println(answer);
    }

    public static void branchingTask4(){
        int rectangleDimensionX;
        int rectangleDimensionY;
        int brickDimensionX;
        int brickDimensionY;
        int brickDimensionZ;
        String answer;
        Scanner console = new Scanner(System.in);
        System.out.print("Введите длину и ширину отверстия: ");
        rectangleDimensionX = console.nextInt();
        rectangleDimensionY = console.nextInt();
        System.out.print("Введите длину, ширину и высоту кирпича: ");
        brickDimensionX = console.nextInt();
        brickDimensionY = console.nextInt();
        brickDimensionZ = console.nextInt();
        if (rectangleDimensionX > rectangleDimensionY){
            if ((rectangleDimensionX >= brickDimensionX) && (rectangleDimensionY >= brickDimensionY)){
                answer = "Кирпич пройдёт.";
            }
            else if ((rectangleDimensionY>=brickDimensionZ) && (rectangleDimensionX>=brickDimensionX)){
                answer = "Кирпич пройдёт.";
            }
            else if ((rectangleDimensionY>=brickDimensionY) && (rectangleDimensionX>=brickDimensionZ)){
                answer = "Кирпич пройдёт.";
            }
            else if((rectangleDimensionX>=brickDimensionY) && (rectangleDimensionY>=brickDimensionZ)){
                answer = "Кирпич пройдёт.";
            }
            else {answer = "Кирпич не пройдёт.";}
        }
        else {
            if ((rectangleDimensionX >= brickDimensionX) && (rectangleDimensionY >= brickDimensionY)){
                answer = "Кирпич пройдёт.";
            }
            else if ((rectangleDimensionY >= brickDimensionX) && (rectangleDimensionX >= brickDimensionY)){
                answer = "Кирпич пройдёт.";
            }
            else if ((rectangleDimensionY>=brickDimensionZ) && (rectangleDimensionX>=brickDimensionX)){
                answer = "Кирпич пройдёт.";
            }
            else if ((rectangleDimensionX>=brickDimensionZ) && (rectangleDimensionY>=brickDimensionX)){
                answer = "Кирпич пройдёт.";
            }
            else if ((rectangleDimensionY>=brickDimensionY) && (rectangleDimensionX>=brickDimensionZ)){
                answer = "Кирпич пройдёт.";
            }
            else if ((rectangleDimensionX>=brickDimensionY) && (rectangleDimensionY>=brickDimensionZ)){
                answer = "Кирпич пройдёт.";
            }
            else {
                answer = "Кирпич не пройдёт.";
            }
        }
        System.out.println(answer);
    }

    public static void branchingTask5(){
        double x;
        double result;
        Scanner console = new Scanner(System.in);
        System.out.print("Введите х: ");
        x = console.nextDouble();
        if (x<=3){
            result = Math.pow(x,2)-3*x+9;
            System.out.println("x^2-3x+9 = "+ result);
        }
        else if (x>3){
            result = 1/(Math.pow(x,3)+6);
            System.out.println("1/(x^3+6) = "+ result);
        }
        else {
            System.out.println("Функция не задана на данном промежутке.");
        }
    }

    public static void loopTask1(){
        int number;
        int sum=0;
        Scanner console = new Scanner(System.in);
        System.out.print("Введите целое положительное число: ");
        number = console.nextInt();
        for (int i=1;i<=number;i++){
            sum+=i;
        }
        System.out.printf("Сумма всех чисел от 1 до %d = %d",number, sum);
    }

    public static void loopTask2(){
        float periodStart;
        float periodEnd;
        float step;
        float result;
        Scanner console = new Scanner(System.in);
        System.out.print("Введите начало отрезка: ");
        periodStart = console.nextFloat();
        System.out.print("\nВведите конец отрезка: ");
        periodEnd = console.nextFloat();
        System.out.println("Введите шаг: ");
        step = console.nextFloat();
        for (float i=periodStart;i<=periodEnd;i+=step){
            if (i<=2){
                result=-i;
                System.out.printf("%.3f\n",result);
            }
            else if (i>2){
                result=i;
                System.out.printf("%.3f\n",result);
            }
            else {
                System.out.println(0);
            }
        }
    }

    public static void loopTask3(){
        int sum=0;
        for (int i=1;i<=100;i++){
            sum+=Math.pow(i,2);
        }
        System.out.println(sum);
    }

    public static void loopTask4(){
        int multiplicaton=1;
        for (int i=1;i<=200;i++){
            multiplicaton*=Math.pow(i,2);
        }
        System.out.println(multiplicaton);
    }

    public static void main(String[] args) {
        int choice = 0;
        while (choice != 4) {
            System.out.print("1. Линейные" + "\n" + "2. Ветвления" + "\n" + "3. Циклы\n" + "4. Выход\n" + "> ");
            Scanner console = new Scanner(System.in);
            choice = console.nextInt();
            switch (choice) {
                case 1: {
                    int numberLinear = 0;
                    while (numberLinear != 7) {
                        System.out.print("1. Задание1\n" + "2. Задание2\n" + "3. Задание1\n" + "4. Задание4\n" + "5. Задание5\n" + "6. Задание6\n" + "7. Выход" + "> ");
                        numberLinear = console.nextInt();
                        switch (numberLinear) {
                            case 1: { linearTask1(); System.out.println("\n");} break;
                            case 2: { linearTask2(); System.out.println("\n");} break;
                            case 3: { linearTask3(); System.out.println("\n");} break;
                            case 4: { linearTask4(); System.out.println("\n");} break;
                            case 5: { linearTask5(); System.out.println("\n");} break;
                            case 6: { linearTask6(); System.out.println("\n");} break;
                            case 7: break;
                        }
                    }
                }
                break;
                case 2: {
                    int numberBranching = 0;
                    while (numberBranching != 6) {
                        System.out.print("1. Задание1\n" + "2. Задание2\n" + "3. Задание1\n" + "4. Задание4\n" + "5. Задание5\n" + "6. Выход\n" + "> ");
                        numberBranching = console.nextInt();
                        switch (numberBranching) {
                            case 1: { branchingTask1(); System.out.println();}break;
                            case 2: { branchingTask2(); System.out.println();}break;
                            case 3: { branchingTask3(); System.out.println();}break;
                            case 4: { branchingTask4(); System.out.println();}break;
                            case 5: { branchingTask5(); System.out.println();}break;
                            case 6: break;
                        }
                    }
                }
                break;
                case 3: {
                    int numberLoop = 0;
                    while (numberLoop != 9) {
                        System.out.print("1. Задание1\n" + "2. Задание2\n" + "3. Задание1\n" + "4. Задание4\n" + "5. Задание5\n" + "6. Задание6\n" + "7. Задание7\n" + "8. Задание8\n" + "9. Выход\n" + "> ");
                        numberLoop = console.nextInt();
                        switch (numberLoop) {
                            case 1: { loopTask1(); System.out.println();}break;
                            case 2: { loopTask2(); System.out.println();}break;
                            case 3: { loopTask3(); System.out.println();}break;
                            case 4: { loopTask4(); System.out.println();}break;
                            case 5: {}break;
                            case 6: {}break;
                            case 7: {}break;
                            case 8: {}break;
                            case 9: break;
                        }
                    }
                }
                break;
                case 4:
                    break;
            }
        }
    }
}
