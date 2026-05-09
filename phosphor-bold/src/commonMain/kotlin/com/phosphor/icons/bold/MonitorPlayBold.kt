package com.phosphor.icons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Bold.MonitorPlayBold: ImageVector
    get() {
        if (_MonitorPlayBold != null) {
            return _MonitorPlayBold!!
        }
        _MonitorPlayBold = ImageVector.Builder(
            name = "Bold.MonitorPlayBold",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(
                fill = SolidColor(Color.Black),
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(156f, 120f)
                lineToRelative(-40f, -28f)
                lineToRelative(0f, 56f)
                lineToRelative(40f, -28f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(208f, 192f)
                lineTo(48f, 192f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 32f, 176f)
                lineTo(32f, 64f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 48f, 48f)
                lineTo(208f, 48f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 224f, 64f)
                lineTo(224f, 176f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 208f, 192f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(160f, 228f)
                lineTo(96f, 228f)
            }
        }.build()

        return _MonitorPlayBold!!
    }

@Suppress("ObjectPropertyName")
private var _MonitorPlayBold: ImageVector? = null
