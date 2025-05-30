package eu.zavadil.java.ocr.common.template;

import eu.zavadil.java.spring.common.entity.EntityBase;
import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
@MappedSuperclass
public class TemplateBase extends EntityBase {

	private static final int NAME_LENGTH = 100;

	@Column(length = NAME_LENGTH)
	private String name;

	public void setName(String name) {
		this.name = this.truncateString(name, NAME_LENGTH);
	}

}
