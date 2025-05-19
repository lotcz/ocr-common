package eu.zavadil.java.ocr.common.parsed.document;

import eu.zavadil.java.ocr.common.parsed.folder.Folder;
import eu.zavadil.java.ocr.common.parsed.page.Page;
import eu.zavadil.java.ocr.common.template.document.DocumentTemplate;
import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.ArrayList;
import java.util.List;

@EqualsAndHashCode(callSuper = true, exclude = "pages")
@Data
@Entity
@Table(name = "document")
public class Document extends DocumentBase {

	@ManyToOne(optional = false)
	private Folder folder;

	@ManyToOne(optional = true)
	private DocumentTemplate documentTemplate;

	@OneToMany(mappedBy = "document", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	private List<Page> pages = new ArrayList<>();

	@Override
	public String toString() {
		return String.format("[Document][%d/%s]", this.getId(), this.getImagePath());
	}
}
