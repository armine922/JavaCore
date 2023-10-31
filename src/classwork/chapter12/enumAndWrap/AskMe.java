package classwork.chapter12.enumAndWrap;


class AskMe {
    static void answer(Answers result) {
        switch (result) {
            case NO:
                System.out.println("NO");
                break;
            case YES:
                System.out.println("YES");
                break;
            case SOON:
                System.out.println("SOON");
                break;
            case LATER:
                System.out.println("LATER");
                break;
            case MAYBE:
                System.out.println("Maybe");
                break;
            case NEVER:
                System.out.println("NEVER");
                break;
        }
    }

    public static void main(String[] args) {
        Question q = new Question();
        answer(q.ask());
        answer(q.ask());
        answer(q.ask());
        answer(q.ask());

    }
}