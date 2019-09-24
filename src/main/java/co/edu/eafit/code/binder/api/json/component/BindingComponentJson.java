package co.edu.eafit.code.binder.api.json.component;

import co.edu.eafit.code.binder.api.json.ComponentJson;
import co.edu.eafit.code.binder.api.json.binding.actions.ControlActionJson;
import co.edu.eafit.code.binder.api.json.binding.actions.ReadActionJson;
import co.edu.eafit.code.binder.api.json.binding.actions.WriteActionJson;
import co.edu.eafit.code.binder.api.json.binding.instruction.*;
import co.edu.eafit.code.binder.api.json.binding.relations.*;
import co.edu.eafit.code.binder.api.structure.BindingComponent;
import co.edu.eafit.code.binder.api.type.BindingComponentType;
import lombok.ToString;

import java.util.Map;

@ToString
public class BindingComponentJson extends ComponentJson {

    private VariableJson variable;
    private ActivityJson activity;

    private TimerJson timer;
    private PredicateJson predicate;
    private LogicalOperatorJson logicalOperator;

    private ReadActionJson readAction;
    private WriteActionJson writeAction;
    private ControlActionJson controlAction;

    private StateActivityJson relationship_state_activity;
    private ActivityWriteJson relationship_activity_writeAction;
    private WritePortJson relationship_writeAction_port;
    private ControlActionPortJson relationship_controlAction_port;
    private OperatorTransitionJson relationship_logicalOperator_transition;
    private OperatorPredicateJson relationship_logicalOperator_predicate;
    private PredicateReadJson relationship_predicate_readActions;
    private ReadPortJson relationship_readAction_port;

    public <E> BindingComponent getComponent() {
        Map.Entry<BindingComponentType, E> entry = BindingComponentType.getComponent(this);
        return new BindingComponent(entry.getKey(), entry.getValue());
    }

}
