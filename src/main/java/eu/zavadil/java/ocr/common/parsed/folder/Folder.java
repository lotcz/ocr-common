package eu.zavadil.java.ocr.common.parsed.folder;

import eu.zavadil.java.ocr.common.template.document.DocumentTemplate;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
@Entity
public class Folder extends FolderBase {

	@ManyToOne
	private Folder parent;

	@ManyToOne
	private DocumentTemplate documentTemplate;

	@Override
	public String toString() {
		return String.format("[Folder][%d/%s]", this.getId(), this.getName());
	}
}
