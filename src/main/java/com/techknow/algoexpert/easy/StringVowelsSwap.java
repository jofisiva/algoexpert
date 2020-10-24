package com.techknow.algoexpert.easy;

public class StringVowelsSwap {

    public static void main(String[] args) {
int [] array = {2,4,2,4,2,4,2};
       System.out.println(solution(array));
/*int [] array = {1,2,3,4,1,1,3};
int k =4;
        System.out.println(solution(array, k));*/
/*int a[] ={2,3,2};

        int [] b ={10,3,40};*/
        //int a[]={7,5,3,4};
        //int b[] ={2,3,1,3};
       // Scanner scanner = new Scanner(System.in);
        //int n = scanner.nextInt();
        //int a[] = Stream.of(scanner.next().split(",")).mapToInt(Integer::parseInt).toArray();
        //int b[] = Stream.of(scanner.next().split(",")).mapToInt(Integer::parseInt).toArray();

        //System.out.println(maxProfit(a, b,n));
       /*Scanner scan = new Scanner(System.in);
       String s = scan.nextLine();

        getIpAddress(s);



        //String s = "hello, world";
       // System.out.println(reverseVowels(s));
       // int [] array = {3,5,6,8,1};

     /*   Scanner sc =new Scanner(System.in);
List<String> lines = new ArrayList<String>();
        int n = sc.nextInt();
        System.out.println(n);
        int i=0;
        while(i<n) {

            lines.add(sc.next());
            i++;
        }
        System.out.println(lines);
        lines.clear();
         i=0;
       // List<Integer> number = new ArrayList<Integer>();
        int number [] = new int[n];

        while(i<n) {

            number[i] =sc.nextInt();
            i++;
        }
List<Integer>  list= Arrays.stream(number).mapToObj(Integer::new).collect(Collectors.toList());


       // System.out.println(list);
        //int [] result = list.stream().mapToInt(Integer::intValue).toArray();

       // int []  array =  Stream.of(new Scanner(System.in).nextLine().split(":")[1].split(" ")).mapToInt(Integer::parseInt).toArray();


        int []  array = Stream.of(new Scanner(System.in).nextLine().split(":")[1].trim().split(" ")).mapToInt(Integer::parseInt).toArray();

        List<Integer> result = Arrays.stream(array).mapToObj(Integer::new).collect(Collectors.toList());
        result.forEach(a->System.out.println(a));

        int
        reverseOddAndEven(array);
        System.out.println();*/
      //  segregateEvenOdd(array);
    }
    static void segregateEvenOdd(int arr[]) {
        /* Initialize left and right indexes */
        int left = 0, right = arr.length - 1;
        while (left < right) {
            /* Increment left index while we see 0 at left */
            while (arr[left] % 2 == 1 && left < right)
                left++;



            /* Decrement right index while we see 1 at right */
            while (arr[right] % 2 == 0 && left < right)
                right--;

            if (left < right) {
                /* Swap arr[left] and arr[right]*/

                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }

        for (int i =0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");

        }
    }

    public static int maxProfit(int[] array, int[] array1, int n) {
        int marketa = 0;
        for(int a:array) {
            marketa+=a;
        }

        int marketb = 0;
        for(int b:array1) {
            marketb+=b;
        }

        return marketa>marketb?marketa:marketb;


    }
    public static int solution(int[] A, int K) {
if(A==null || A.length==0 || K<=0) {
    return -1;
}
        int result =0;
        int currlen =0;
        for (int r:A) {
            currlen+=r;
            if(currlen>=K) {
                result++;
                currlen=0;
            }
        }
        return result+1;

        // return -1;
    }
    public static int solution(int[] A) {
int res=0;
        for (int i = 0; i < A.length; i++) {
            System.out.println(res +","+ A[i]);
            res = res ^ A[i];
            System.out.println(res +","+  A[i]);
        }
            return res;
        }
        //write your code here
       /* List<Integer> integerList = new ArrayList<>();
        Collections.addAll(integerList, inptArr);

        int length = inptArr.length;
        for(int i = 0; i < length; i++) {
            if(Collections.frequency(integerList, integerList.get(i))%2 != 0) {
                return(integerList.get(i));
            }
        }
  */
       // return -1;


   // }
//Array : 10.0.1.45 -/d/in/intheclass,10.0.1.45-/a/facts/final/bhgahf,10.3.54.123-/d/xyz/bcc/yes
    private static void getIpAddress(String s) {

       // String s ="Array : 10.0.1.45 -/d/in/intheclass,10.0.1.45-/a/facts/final/bhgahf,10.3.54.123-/d/xyz/bcc/yes";
        String inputArray = s.split(":")[1];

     String result[] =  inputArray.split(",");

     for(String s2 : result) {

         System.out.println(s2.trim());
         System.out.println(s2.trim().split("-")[0]);
     }

    }
        private static void reverseOddAndEven(int [] array) {

        int index = -1;

        for (int i = 0; i < array.length; i++) {
//3,5,6,8,1
            if (array[i] % 2 == 1) {

                    int temp = array[i];
                    array[i] = array[++index];
                    array[index] = temp;

            }

        }



        for (int i =0; i < array.length; i++) {
            System.out.print(array[i] + " ");

        }
    }
    private static String reverseVowels(String s) {

        char[] chars = s.toCharArray();

        int left = 0;
        int right = s.length()-1;

        while (left < right) {

            if (vowels(chars[left]) && vowels(chars[right])) {

                char temp = chars[left];
                chars[left] = chars[right];
                chars[right] = temp;
                left++;
                right--;

            } else if (!vowels(chars[left])) {
                left++;
            } else if (!vowels(chars[right])) {
                right--;
            }

        }
        return new String(chars);
    }

    private static boolean vowels(char c) {

        return 'a' == c || 'A' == c || 'e' == c || 'E' == c || 'i' == c || 'I' == c || 'o' == c || 'O' == c || 'u' == c || 'U' == c;
    }
}

