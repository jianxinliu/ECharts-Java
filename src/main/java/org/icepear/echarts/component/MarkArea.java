package org.icepear.echarts.component;

import java.util.List;

import org.icepear.echarts.origin.component.marker.MarkAreaOption;
import org.icepear.echarts.origin.component.marker.MarkerTooltipOption;
import org.icepear.echarts.origin.util.EmphasisOption;

import lombok.experimental.Accessors;
import lombok.Data;

@Accessors(chain=true)
@Data
public class MarkArea implements MarkAreaOption {
    private Number precision;

    private Boolean silent;

    private List<Object> data;

    private MarkerTooltipOption tooltip;

    private String mainType;

    private String type;

    private String id;

    private String name;

    private Number z;

    private Number zlevel;

    private String animation;

    private Number animationThreshold;

    private Number animationDuration;

    private String animationEasing;

    private Number animationDelay;

    private Number animationDurationUpdate;

    private String animationEasingUpdate;

    private Number animationDelayUpdate;

    private Object itemStyle;

    private Object label;

    private EmphasisOption emphasis;

    private Object select;

    private Object blur;
}
