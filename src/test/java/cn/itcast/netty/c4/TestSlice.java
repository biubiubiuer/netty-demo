package cn.itcast.netty.c4;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.ByteBufAllocator;
import lombok.extern.slf4j.Slf4j;

import static cn.itcast.netty.c4.TestByteBuf.log;

@Slf4j
public class TestSlice {
    public static void main(String[] args) {
        ByteBuf buf = ByteBufAllocator.DEFAULT.buffer(10);
        buf.writeBytes(new byte[]{'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j'});
        log(buf);

        // 在切片过程中，没有发生数据复制
        ByteBuf f1 = buf.slice(0, 5);
        f1.retain();
        ByteBuf f2 = buf.slice(5, 5);
        log(f1);
        log(f2);

        log.debug("释放原有 buteBuf 内存...");
        buf.release();
        log(f1);
        
        f1.release();
        f2.release();
        
//        System.out.println("=============================================================================================================================================");
//        
//        f1.setByte(0, 'b');
//        log(f1);
//        log(buf);
        
    }
}
