package com.github.steveice10.mc.protocol.packet.ingame.clientbound.level.border;

import com.github.steveice10.packetlib.io.NetInput;
import com.github.steveice10.packetlib.io.NetOutput;
import com.github.steveice10.packetlib.packet.Packet;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.With;

import java.io.IOException;

@Data
@With
@AllArgsConstructor
public class ClientboundSetBorderWarningDelayPacket implements Packet {
    private final int warningDelay;

    public ClientboundSetBorderWarningDelayPacket(NetInput in) throws IOException {
        this.warningDelay = in.readVarInt();
    }

    @Override
    public void write(NetOutput out) throws IOException {
        out.writeVarInt(this.warningDelay);
    }
}
