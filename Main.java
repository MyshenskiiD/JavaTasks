import java.util.Scanner;

// Задача 1. Стоимость: 1 балл.
// class Main {
//   public static void main(String[] args) {
//   System.out.print("Введите температуру: - ");
//    int temp;
//   Scanner num = new Scanner(System.in);
//   temp = num.nextInt();
//   if (temp <= 0){
//     System.out.print("лед");
//   }
//   else if(temp > 0 && temp < 100){
//     System.out.print("вода");
//   }
//   else{System.out.print("пар");}
//   }
// }

//Задача 2. Стоимость: 1 балл.
// class Main {
//   public static void main(String[] args) {
//   boolean is = true, isnot= false;
//   System.out.print("Введите возраст: - ");
//    int age;
//   Scanner num = new Scanner(System.in);
//   age = num.nextInt();
//   if (age < 18){
//     System.out.print(is);
//   }
//   else{System.out.print(isnot);}
//   }
// }


//Задача 4. Стоимость: 1 балл.
// class Main {
//   public static void main(String[] args) {
//       int num1, num2, num3;
//   Scanner num = new Scanner(System.in);
//     System.out.print("Введите первое число: - ");
//   num1 = num.nextInt();
//     System.out.print("Введите второе число: - ");
//   num2 = num.nextInt();
//     System.out.print("Введите третье число: - ");
//   num3 = num.nextInt();
//   System.out.println(num1 + " " + num2 + " " +  num3);
//   if (num1 > num2 && num1 > num3)
//   System.out.print("Максимальное число: - " + num1);
//   if (num2 > num1 && num2 > num3)
//   System.out.print("Максимальное число: - " + num2);
//   if (num3 > num1 && num3 > num2)
//   System.out.print("Максимальное число: - " + num3);
//   }
// }


//Задача 8. Стоимость: 5 баллов.
// class Main {
//   public static void main(String[] args) {
//     int sum = 0;
//     int [] arr = new int [] {12, 54, 34, 23};
//     for (int i = 0; i < arr.length; i++){
//     sum += arr[i];
//     System.out.println(arr[i]);
//     }
//     System.out.println("Медиана: " + sum / 4);
//   }
// }

// Задача 9. Стоимость: 8 баллов.
// class Main {
//   public static void main(String[] args) {
//     int index = 0;
//     int [] arr1 = new int[] {1, 2};
//     int [] arr2 = new int[] {3, 4};
//     int lenArr3 = arr1.length + arr2.length;
//     int [] arr3 = new int[lenArr3];
//     for (int i = 0; i < arr1.length; i++){
//       arr3[index] = arr1[i];
//       index ++;
//       }
//     for (int i = 0; i < arr2.length; i++){
//       arr3[index] = arr2[i];
//       index++;
//       }
//     for (int i = 0; i < arr3.length; i++){
//       System.out.println(arr3[i]);
//     }
// }
// }

//Задача 10. Стоимость: 5 баллов.
// class Main {
//   public static void main(String[] args) {
//    int [] arr = new int[] {1, 2, 3, 4};
//         int min = arr[0];
//         arr[0] = arr[3];
//         arr[arr.length - 1] = min;
//         for (int i = 0; i < arr.length; i++)
//             System.out.println(arr[i]);
// }
// }

//Задача 11. Стоимость: 5 баллов.
// class Main {
//   public static void main(String[] args) {
//     int sum = 0;
//    int [] arr = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9};
//         for (int i = 0; i < arr.length; i++){
//           sum += arr[i] * arr[i];
//             System.out.println(sum);
//         }
//     if (sum % 2 == 0)
//     System.out.println("Сумма числа - " + sum + " четное");
//     else
//     System.out.println("Сумма числа - " + sum + " нечетное");
// }
// }

//Задача 12. Стоимость: 5 баллов.
// class Main {
//   public static void main(String[] args) {
//     int max = 0;
//    int [] arr = new int[] {56, 23, 11, 4, 5, 666, 7, 65, 9};
//         for (int i = 0; i < arr.length; i++){
//           if (max < arr[i])
//           max = arr[i];
//         }
//         int min = arr[0];
//         for (int i = 0; i < arr.length; i++){
//           if (min > arr[i])
//           min = arr[i];
//         }
//         System.out.println("Максимальное - " + max + " Минимальное - " + min);
// }
// }



//Задача 15. Стоимость: 5 баллов.
// class Main {
//   public static void main(String[] args) {
//    int check = 0;
//    int [] arr1 = new int[] {1, 3, 5};
//    int [] arr2 = new int[] {1, 2, 3};
//    int [] arr3 = new int[] {1, 2, 4};
//         for (int i = 0; i < arr1.length - 1; i++){
//           check = arr1[i + 1] - arr1[i];
//           if (check != 2){
//             System.out.println("false");
//             break;}
//           }
//           if (check == 2){
//             System.out.println("true");}
//         for (int i = 0; i < arr2.length - 1; i++){
//           check = arr2[i + 1] - arr2[i];
//           if (check != 2){
//             System.out.println("false");
//             break;}
//           }
//           if (check == 2){
//             System.out.println("true");}
//         for (int i = 0; i < arr3.length - 1; i++){
//           check = arr3[i + 1] - arr3[i];
//           if (check != 2){
//             System.out.println("false");
//             break;}
//           }
//           if (check == 2){
//             System.out.println("true");}
//         }
// }

