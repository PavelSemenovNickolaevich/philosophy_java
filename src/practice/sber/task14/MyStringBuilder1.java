package practice.sber.task14;

class MyStringBuilder1 {
    private int size = 0; // размер не требуется. Удалите его и измените код.
    private int capacity = 0;
    private char[] buffer;

    public MyStringBuilder1() {
    }

    public MyStringBuilder1(char[] chars) {
        buffer = new char[chars.length];
        size = capacity = chars.length;
        System.arraycopy(chars, 0, buffer, 0, chars.length);
    }

    public MyStringBuilder1(String s) {
        capacity = size = s.length();
        buffer = new char[capacity];

        for (int i = 0; i < s.length(); i++)
            buffer[i] = s.charAt(i);
    }

    private void increaseCapacity(int newCapacity) {
        char[] temp = new char[newCapacity];
        System.arraycopy(buffer, 0, temp, 0, size);
        capacity = newCapacity;
        buffer = temp;
    }

    public MyStringBuilder1 append(MyStringBuilder1 s) {
        if (capacity < size + s.length()) {
            increaseCapacity(2 * (size + s.length()));
        }

        for (int i = 0; i < s.length(); i++)
            buffer[i + size] = s.charAt(i);

        size += s.length();

        return this;
    }

    public MyStringBuilder1 append(int i) {
        return append(new MyStringBuilder1(String.valueOf(i)));
    }

    public int length() {
        return size;
    }

    public char charAt(int index) {
        return buffer[index];
    }

    public MyStringBuilder1 toLowerCase() {
        for (int i = 0; i < size; i++)
            buffer[i] = Character.toLowerCase(buffer[i]);

        return this;
    }

    public MyStringBuilder1 substring(int begin, int end) {
        char[] result = new char[end - begin];
        for (int i = 0; i < result.length; i++)
            result[i] = this.buffer[begin + i];

        return new MyStringBuilder1(result);
    }

    @Override
    public String toString() {
        char[] temp = new char[size];
        for (int i = 0; i < size; i++)
            temp[i] = buffer[i];

        return new String(temp);
    }
}
