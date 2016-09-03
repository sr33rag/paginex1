package net.codesree.paginex1.api.forms;

import java.util.Map;
import java.io.Serializable;

public interface IForm extends Serializable {
 Map<String, String> validate();
}