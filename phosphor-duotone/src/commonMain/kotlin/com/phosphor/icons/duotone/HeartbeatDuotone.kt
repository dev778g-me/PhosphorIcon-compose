package com.phosphor.icons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Duotone.HeartbeatDuotone: ImageVector
    get() {
        if (_HeartbeatDuotone != null) {
            return _HeartbeatDuotone!!
        }
        _HeartbeatDuotone = ImageVector.Builder(
            name = "Duotone.HeartbeatDuotone",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(
                fill = SolidColor(Color.Black),
                fillAlpha = 0.2f,
                strokeAlpha = 0.2f
            ) {
                moveTo(128f, 224f)
                reflectiveCurveTo(24f, 168f, 24f, 102f)
                arcTo(54f, 54f, 0f, isMoreThanHalf = false, isPositiveArc = true, 78f, 48f)
                curveToRelative(22.59f, 0f, 41.94f, 12.31f, 50f, 32f)
                curveToRelative(8.06f, -19.69f, 27.41f, -32f, 50f, -32f)
                arcToRelative(54f, 54f, 0f, isMoreThanHalf = false, isPositiveArc = true, 54f, 54f)
                curveTo(232f, 168f, 128f, 224f, 128f, 224f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(32f, 136f)
                lineToRelative(40f, 0f)
                lineToRelative(16f, -24f)
                lineToRelative(32f, 48f)
                lineToRelative(16f, -24f)
                lineToRelative(24f, 0f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(24f, 104f)
                curveToRelative(0f, -0.67f, 0f, -1.33f, 0f, -2f)
                arcTo(54f, 54f, 0f, isMoreThanHalf = false, isPositiveArc = true, 78f, 48f)
                curveToRelative(22.59f, 0f, 41.94f, 12.31f, 50f, 32f)
                curveToRelative(8.06f, -19.69f, 27.41f, -32f, 50f, -32f)
                arcToRelative(54f, 54f, 0f, isMoreThanHalf = false, isPositiveArc = true, 54f, 54f)
                curveToRelative(0f, 66f, -104f, 122f, -104f, 122f)
                reflectiveCurveToRelative(-42f, -22.6f, -72.58f, -56f)
            }
        }.build()

        return _HeartbeatDuotone!!
    }

@Suppress("ObjectPropertyName")
private var _HeartbeatDuotone: ImageVector? = null
