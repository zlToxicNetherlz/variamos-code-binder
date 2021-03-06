package com.variamos.moduino.binder.resolver.json.actions;

import com.variamos.moduino.binder.resolver.json.actions.instructions.DeviceInstructionJson;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class DeviceWriteActionJson {

    private String name;
    private DeviceInstructionJson[] instructions;

}
