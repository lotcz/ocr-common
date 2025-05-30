package eu.zavadil.java.ocr.common.template.document;

import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
@MappedSuperclass
public class DocumentTemplateStubBase extends DocumentTemplateBase {

	@Column(name = "language_id")
	private Integer languageId;

}
