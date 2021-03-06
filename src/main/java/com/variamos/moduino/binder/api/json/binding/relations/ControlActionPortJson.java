package com.variamos.moduino.binder.api.json.binding.relations;

import com.variamos.moduino.binder.api.json.RelationshipJson;
import lombok.Getter;
import lombok.ToString;

@ToString
@Getter
public class ControlActionPortJson extends RelationshipJson {

    private String controlAction;
    private String state;

    private String readPort;
    private String writePort;

    private String timer;
    private String varTimerLimit;

}
