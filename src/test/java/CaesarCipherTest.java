import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CaesarCipherTest {

    CaesarsCipher caesarsCipher = new CaesarsCipher();

    @Test
    void testCipheredMessageWithOffsetOf12() {
        assertEquals("tai mdq kag pauzs fapmk", caesarsCipher.cipher("how are you doing today", 12));
    }

    @Test
    void testEmptyString() {
        assertEquals("", caesarsCipher.cipherExtend("", 12));
    }

//    @Test
//    void testEmptyString() {
//        assertEquals("uftu oguucig iluvw", caesarsCipher.cipherExtend("test message first", 1));
//    }

}