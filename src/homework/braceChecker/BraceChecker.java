package homework.braceChecker;

public class BraceChecker {
    private String text;

    public BraceChecker(String text) {

        this.text = text;

    }

    public void check() {
        Stack stack = new Stack();
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            char ch;
            switch (c) {
                case '(':
                case '{':
                case '[':
                    stack.push(c);
                    break;
                case ')':

                    ch = (char) stack.pop();
                    if (ch == 0) {
                        System.err.println("Error at " + i + ":" + "Closed " + c + ",but NOT OPENED");
                        break;
                    } else if (ch != '(') {
                        System.err.println("Error at " + i + ":" + "Opened " + ch + "but closed " + c);
                    }
                    break;

                case '}':
                    ch = (char) stack.pop();
                    if (ch == 0) {
                        System.err.println("Error at " + i + ":" + "Closed " + c + ",but NOT OPENED");
                        break;
                    } else if (ch != '{') {
                        System.err.println("Error at " + i + ":" + "Opened " + ch + "but closed " + c);
                    }
                    break;

                case ']':
                    ch = (char) stack.pop();
                    if (ch == 0) {
                        System.err.println("Error at " + i + ":" + "Closed" + c + " but NOT OPENED");
                        break;
                    } else if (ch != '[') {
                        System.err.println("Error at " + i + ":" + "Opened " + ch + "but closed " + c);
                    }
                    break;
            }

        }
        char ch;
        while ((ch = (char) stack.pop()) != 0) {
            System.err.println("Opened " + ch + " but NOT CLOSED");

        }
    }
}

