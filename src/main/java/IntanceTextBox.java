public class IntanceTextBox {
    public static void main(String[] args) {
        TextBox textBox = new TextBox();
        textBox.setText("something");
        //System.out.println(textBox.text); //Null

        var textBox1 = new TextBox();
        var textBox2 = textBox1; // both of variables are referencing the same
        //text box on the heap
        //2 variables, on stack, referencing the same object on the heap

        textBox2.setText("Hello world");
        System.out.println(textBox1.text);
    }

}
