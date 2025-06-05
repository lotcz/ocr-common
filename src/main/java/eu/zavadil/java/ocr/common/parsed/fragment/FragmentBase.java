package eu.zavadil.java.ocr.common.parsed.fragment;

import eu.zavadil.java.spring.common.entity.EntityBase;
import eu.zavadil.java.spring.common.entity.EntityWithNameBase;
import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
@MappedSuperclass
public class FragmentBase extends EntityWithNameBase {

	private String imagePath;

	@Column(columnDefinition = "TEXT")
	private String text;

}
