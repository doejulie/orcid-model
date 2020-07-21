//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.10.04 at 01:24:28 PM BST 
//

package org.orcid.jaxb.model.v3.release.record;

import java.io.Serializable;

import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import io.swagger.annotations.ApiModelProperty;
import org.orcid.jaxb.model.common.CitationType;
import org.orcid.jaxb.model.common.adapters.CitationTypeAdapter;

import io.swagger.annotations.ApiModel;

/**
 * Element to contain a citation of a given type
 *
 * Java class for citation complex type.
 *
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "citation", propOrder = { "citationType", "citation" })
@ApiModel(value = "CitationV3_0")
public class Citation implements Serializable {
	private static final long serialVersionUID = 6177533651147799332L;
	@XmlJavaTypeAdapter(CitationTypeAdapter.class)
	@XmlElement(name = "citation-type", required = true, defaultValue = "formatted-unspecified", namespace = "http://www.orcid.org/ns/work")
	@ApiModelProperty(dataType = "string", allowableValues = "formatted-unspecified, bibtex, formatted-apa, formatted-harvard, formatted-ieee, formatted-mla, formatted-vancouver, formatted-chicago, ris")
	protected CitationType citationType;
	@XmlElement(name = "citation-value", required = true, namespace = "http://www.orcid.org/ns/work")
	protected String citation;

	public Citation() {
	}

	public Citation(String citation, CitationType citationType) {
		this.citation = citation;
		this.citationType = citationType;
	}

	/**
	 * Gets the value of the workCitationType property.
	 *
	 * @return possible object is {@link CitationType }
	 */
	public CitationType getWorkCitationType() {
		return citationType;
	}

	/**
	 * Sets the value of the workCitationType property.
	 *
	 * @param value allowed object is {@link CitationType }
	 */
	public void setWorkCitationType(CitationType value) {
		this.citationType = value;
	}

	/**
	 * Gets the value of the citation property.
	 *
	 * @return possible object is {@link Citation }
	 */
	public String getCitation() {
		return citation;
	}

	/**
	 * Sets the value of the citation property.
	 *
	 * @param value allowed object is {@link Citation }
	 */
	public void setCitation(String value) {
		this.citation = value;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (!(o instanceof Citation)) {
			return false;
		}

		Citation citation1 = (Citation) o;

		if (citation != null ? !citation.equals(citation1.citation) : citation1.citation != null) {
			return false;
		}
		if (citationType != citation1.citationType) {
			return false;
		}

		return true;
	}

	@Override
	public int hashCode() {
		int result = citationType != null ? citationType.hashCode() : 0;
		result = 31 * result + (citation != null ? citation.hashCode() : 0);
		return result;
	}
}
