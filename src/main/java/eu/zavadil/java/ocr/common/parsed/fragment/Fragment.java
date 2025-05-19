package eu.zavadil.java.ocr.common.parsed.fragment;

import eu.zavadil.java.ocr.common.parsed.page.Page;
import eu.zavadil.java.ocr.common.template.fragment.FragmentTemplate;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
@Entity
@Table(name = "fragment")
public class Fragment extends FragmentBase {

	@ManyToOne(optional = false)
	private Page page;

	@ManyToOne(optional = false)
	private FragmentTemplate fragmentTemplate;

	@Override
	public String toString() {
		return String.format("[Fragment][%d/%s]", this.getId(), this.getText());
	}
}
