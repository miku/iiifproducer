/*
 * IIIFProducer
 *
 * Copyright (C) 2017 Leipzig University Library <info@ub.uni-leipzig.de>
 *
 * @author Stefan Freitag <freitag@uni-leipzig.de>
 * @author Christopher Johnson <christopher_hanna.johnson@uni-leipzig.de>
 * @author Felix Kreißig <kreissig@ub.uni-leipzig.de>
 * @author Leander Seige <seige@ub.uni-leipzig.de>
 * @license http://opensource.org/licenses/gpl-2.0.php GNU GPLv2
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License version 2,
 * as published by the Free Software Foundation.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA
 */

package org.ubl.iiifproducer.template;

import static org.ubl.iiifproducer.vocabulary.SC._painting;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * TemplateImage.
 *
 * @author christopher-johnson
 */
@JsonPropertyOrder({"@type", "motivation", "resource", "on"})
public class TemplateImage {

    @JsonProperty("@type")
    private String type = "oa:Annotation";

    @JsonProperty
    private String motivation = _painting;

    @JsonProperty
    private Object resource;

    @JsonProperty
    private String on = "unnamed";

    public void setResource(TemplateResource resource) {
        this.resource = resource;
    }

    public void setTarget(String target) {
        this.on = target;
    }

}
