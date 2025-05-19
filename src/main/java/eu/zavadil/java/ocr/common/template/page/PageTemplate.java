package eu.zavadil.java.ocr.common.template.page;

import eu.zavadil.java.ocr.common.template.document.DocumentTemplate;
import eu.zavadil.java.ocr.common.template.fragment.FragmentTemplate;
import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

import java.util.ArrayList;
import java.util.List;

@EqualsAndHashCode(callSuper = true, exclude = "fragments")
@Data
@Entity
@Table(name = "page_template")
public class PageTemplate extends PageTemplateBase {

	@ManyToOne
	DocumentTemplate documentTemplate;

	@ManyToOne
	PageTemplate inheritFromPageTemplate;

	@OneToMany(mappedBy = "pageTemplate", fetch = FetchType.EAGER)
	@Cascade(CascadeType.ALL)
	private List<FragmentTemplate> fragments = new ArrayList<>();

	@Override
	public String toString() {
		return String.format("[PageTemplate][%d/%d]", this.getId(), this.getPageNumber());
	}

}
