import com.google.protobuf.InvalidProtocolBufferException;

import java.nio.charset.StandardCharsets;

public class Proto {
    private static byte[] encode() {
        PersonOuterClass.Person person = PersonOuterClass.Person.newBuilder().setName("Buford").setAge(22).build();

        return person.toByteArray();
    }

    public static void main(String[] args) throws InvalidProtocolBufferException {
        System.out.println(encode().toString());

        System.out.println(PersonOuterClass.Person.parseFrom(encode()));
    }
}
