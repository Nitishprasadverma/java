package stackquqe;

public class DyanmicStack extends CustomStack {
    public DyanmicStack() {
        super();
    }

    public DyanmicStack(int size) {
        super(size);
    }

    @Override
    public boolean push(int item) {
        if (this.isFull()) {
            // double the array size
            int temp[] = new int[data.length * 2];
            // copy all previous data item into temp;
            for (int i = 0; i < data.length; i++) {
                temp[i] = data[i];
            }

            data = temp;
        }
        // insert the item;

        return super.push(item);

    }
}
