package com.phosphor.icons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Thin.ChartLineThin: ImageVector
    get() {
        if (_ChartLineThin != null) {
            return _ChartLineThin!!
        }
        _ChartLineThin = ImageVector.Builder(
            name = "Thin.ChartLineThin",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 8f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(224f, 208f)
                lineToRelative(-192f, 0f)
                lineToRelative(0f, -160f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 8f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(224f, 96f)
                lineToRelative(-64f, 56f)
                lineToRelative(-64f, -48f)
                lineToRelative(-64f, 56f)
            }
        }.build()

        return _ChartLineThin!!
    }

@Suppress("ObjectPropertyName")
private var _ChartLineThin: ImageVector? = null
