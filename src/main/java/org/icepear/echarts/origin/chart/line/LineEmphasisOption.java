package org.icepear.echarts.origin.chart.line;

import org.icepear.echarts.origin.util.AreaStyleOption;
import org.icepear.echarts.origin.util.EmphasisOption;
import org.icepear.echarts.origin.util.LineStyleOption;

/**
 * https://github.com/apache/echarts/blob/790687df55a5dbe286e52cf182c0983938efd367/src/chart/line/LineSeries.ts#L73
 * https://github.com/apache/echarts/blob/790687df55a5dbe286e52cf182c0983938efd367/src/chart/line/LineSeries.ts#L48
 * https://github.com/apache/echarts/blob/790687df55a5dbe286e52cf182c0983938efd367/src/util/types.ts#L1534
 */
public interface LineEmphasisOption extends LineStateOption, EmphasisOption {
    LineEmphasisOption setFocus(String focus);

    LineEmphasisOption setScale(Boolean scale);

    LineEmphasisOption setLineStyle(LineStyleOption lineStyle);

    LineEmphasisOption setAreaStyle(AreaStyleOption areaStyle);

    LineEmphasisOption setBlurScope(Object blurScope);
}
