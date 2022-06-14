import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

//9.
class PackedBuilderTest {


    @Test
    void shouldHandleCode(){
        Command command = new Command(CommandType.CREATE_PRODUCT, "user1", new byte[]{1, 2, 3});

        PackedBuilder packedBuilder = new PackedBuilder();
        byte[] packet = packedBuilder.encode(command);

        Command decodedCommand = packedBuilder.decode(packet);
        assertEquals(command, decodedCommand);

    }


}
