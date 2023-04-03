package stack.problems;

// https://practice.geeksforgeeks.org/batch/cp-47/track/DSASP-Stack/problem/implement-two-stacks-in-an-array
public class Impl2StacksInArrayEfficiently {

    public static void main(String[] args) {

    }

    // Structure of the class is
    static class TwoStack {
        int size;
        int top1, top2;
        int[] arr = new int[100];

        TwoStack() {
            size = 100;
            top1 = -1;
            top2 = size;
        }
    }

    static class Stacks {
        // Function to push an integer into the stack1.
        void push1(int x, TwoStack stack) {
            if (stack.top1 < stack.top2 - 1)
                stack.arr[++stack.top1] = x;
        }

        // Function to push an integer into the stack2.
        void push2(int x, TwoStack stack) {
            if (stack.top1 < stack.top2 - 1) stack.arr[--stack.top2] = x;
        }

        // Function to remove an element from top of the stack1.
        int pop1(TwoStack stack) {
            if (stack.top1 >= 0) {
                int poppedElement = stack.arr[stack.top1];
                stack.top1--;
                return poppedElement;
            }
            return -1;
        }

        // Function to remove an element from top of the stack2.
        int pop2(TwoStack stack) {
            if (stack.top2 < stack.size) {
                int poppedElement = stack.arr[stack.top2];
                stack.top2++;
                return poppedElement;
            }
            return -1;
        }
    }
}
