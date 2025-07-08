package Test_Exam;

public class String_builder_buffer_compare {

        public static void main(String[] args) {
            int iterations = 10000; // number of concatenations

            // 1. String concatenation using '+'
            long startTime = System.currentTimeMillis();
            String str = "";
            for (int i = 0; i < iterations; i++) {
                str += "A"; // creates new String object each time
            }
            long endTime = System.currentTimeMillis();
            System.out.println("Time taken with String '+' : " + (endTime - startTime) + " ms");

            // 2. Using StringBuilder
            startTime = System.currentTimeMillis();
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < iterations; i++) {
                sb.append("A"); // modifies same object
            }
            endTime = System.currentTimeMillis();
            System.out.println("Time taken with StringBuilder : " + (endTime - startTime) + " ms");

            // 3. Using StringBuffer
            startTime = System.currentTimeMillis();
            StringBuffer sbf = new StringBuffer();
            for (int i = 0; i < iterations; i++) {
                sbf.append("A"); // modifies same object, thread-safe
            }
            endTime = System.currentTimeMillis();
            System.out.println("Time taken with StringBuffer : " + (endTime - startTime) + " ms");
        }
    }

