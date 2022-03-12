import java.util.Scanner;

public class maxMin {
    public class problem {
        public static void main(String[] args){
            Scanner s = new Scanner(System.in);
            int hotDaysNumber=0;
            int coldDaysNumber=0;
            int pleasantDaysNumber=0;
            int degree;
            int highestPoint=0;
            int lowestPoint=0;
            int average=0;
            int sum = 0 ;
            while(true){
                System.out.println("Enter a degree");
                degree = s.nextInt();
                if(degree == -1000){
                    break;
                }else {
                    if(degree >= 30){
                        System.out.println(degree + "is a hot day");
                        hotDaysNumber++;
                        sum += degree;
                        highestPoint = degree;
                        if(degree> highestPoint){
                            highestPoint = degree;
                        }
                    }else if(degree>= 17 && degree<=29){
                        System.out.println(degree + "is a pleasant day");
                        sum += degree;
                        pleasantDaysNumber++;
                    }else if (degree>-1000 && degree<=16){
                        System.out.println(degree + "is a cold day");
                        coldDaysNumber++;
                        sum = degree+ sum;
                        lowestPoint = degree;
                        if(degree < lowestPoint){
                            lowestPoint = degree;
                        }
                    }
                }
            }
            average = sum / (coldDaysNumber+hotDaysNumber+pleasantDaysNumber);

            System.out.println("hot days number" + hotDaysNumber);
            System.out.println("pleasant days number: " + pleasantDaysNumber);
            System.out.println("cold days number : " + coldDaysNumber);
            System.out.println("lowest point" + lowestPoint);
            System.out.println("highest point: " + highestPoint);
            System.out.println("average :" + average);
        }
    }
}
