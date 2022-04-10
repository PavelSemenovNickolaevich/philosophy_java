package practice.sber.task14;

public class MyStringBuilder2 {

    int size;
    int capacity;
    char[] buffer;

    public MyStringBuilder2() {

    }

    public MyStringBuilder2(String s) {
        capacity = s.length();
        buffer = new char[capacity];
        for (int i = 0; i < buffer.length; i++) {
            buffer[i] = s.charAt(i);
        }
    }

    public MyStringBuilder2(char[] chars) {
        buffer = new char[chars.length];
        size = capacity = chars.length;
        System.arraycopy(chars, 0, buffer, 0, chars.length);
    }

    private void increaseCapacity(int newCapacity) {
        char[] temp = new char[newCapacity];
        System.arraycopy(buffer, 0, temp, 0, size);
        capacity = newCapacity;
        buffer = temp;
    }

    public int length() {
        return size;
    }

    public MyStringBuilder2 substring(int begin, int end) {
        char[] result = new char[end - begin];
        for (int i = 0; i < result.length; i++)
            result[i] = buffer[begin + i];

        return new MyStringBuilder2(result);
    }

    public MyStringBuilder2 insert(int offset, MyStringBuilder2 s) {
        if (capacity < size + s.length()) {
            increaseCapacity(2 * (size + s.length()));
        }

        String temp = s.toString();
        for (int i = 0; i < temp.length(); i++)
            buffer[size - 1 + temp.length() - i] = buffer[size - 1 - i];

        for (int i = 0; i < temp.length(); i++)
            buffer[i + offset] = temp.charAt(i);

        size += temp.length();

        return this;
    }

    public MyStringBuilder2 reverse() {
        for (int i = 0; i < size / 2; i++) {
            char temp = buffer[i];
            buffer[i] = buffer[size - 1 - i];
            buffer[size - 1 - i] = temp;
        }

        return this;
    }

    public MyStringBuilder2 substring(int begin) {
        return substring(begin, size);
    }

    public MyStringBuilder2 toUpperCase() {
        for (int i = 0; i < size; i++)
            buffer[i] = Character.toUpperCase(buffer[i]);

        return this;
    }


}
