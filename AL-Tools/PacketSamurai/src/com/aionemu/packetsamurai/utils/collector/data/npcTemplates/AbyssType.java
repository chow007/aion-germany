/**
 * This file is part of Aion-Lightning <aion-lightning.org>.
 *
 *  Aion-Lightning is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *
 *  Aion-Lightning is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details. *
 *  You should have received a copy of the GNU General Public License
 *  along with Aion-Lightning.
 *  If not, see <http://www.gnu.org/licenses/>.
 */
package com.aionemu.packetsamurai.utils.collector.data.npcTemplates;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;

@XmlType(name= "AbyssType")
@XmlEnum
public enum AbyssType {

    SHIELDNPC_OFF,  
    RAID,  
    SHIELDNPC_ON,  
    DEFENDER,  
    BOSS,  
    DOOR,  
    GUARD,  
    TELEPORTER,  
    ETC,  
    ARTIFACT_EFFECT_CORE,  
    DOORREPAIR,  
    ARTIFACT,  
    NONE;
  
    public String value() {
        return name();
    }
  
    public static AbyssType fromValue(String v) {
        return valueOf(v);
    }
}
