package com.phosphor.icons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Duotone.GhostDuotone: ImageVector
    get() {
        if (_GhostDuotone != null) {
            return _GhostDuotone!!
        }
        _GhostDuotone = ImageVector.Builder(
            name = "Duotone.GhostDuotone",
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
                moveTo(216f, 216f)
                lineToRelative(-29.33f, -24f)
                lineToRelative(-29.34f, 24f)
                lineTo(128f, 192f)
                lineTo(98.67f, 216f)
                lineTo(69.33f, 192f)
                lineTo(40f, 216f)
                verticalLineTo(120f)
                arcToRelative(88f, 88f, 0f, isMoreThanHalf = false, isPositiveArc = true, 176f, 0f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(100f, 116f)
                moveToRelative(-12f, 0f)
                arcToRelative(12f, 12f, 0f, isMoreThanHalf = true, isPositiveArc = true, 24f, 0f)
                arcToRelative(12f, 12f, 0f, isMoreThanHalf = true, isPositiveArc = true, -24f, 0f)
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(156f, 116f)
                moveToRelative(-12f, 0f)
                arcToRelative(12f, 12f, 0f, isMoreThanHalf = true, isPositiveArc = true, 24f, 0f)
                arcToRelative(12f, 12f, 0f, isMoreThanHalf = true, isPositiveArc = true, -24f, 0f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(216f, 216f)
                lineToRelative(-29.33f, -24f)
                lineToRelative(-29.34f, 24f)
                lineTo(128f, 192f)
                lineTo(98.67f, 216f)
                lineTo(69.33f, 192f)
                lineTo(40f, 216f)
                verticalLineTo(120f)
                arcToRelative(88f, 88f, 0f, isMoreThanHalf = false, isPositiveArc = true, 176f, 0f)
                close()
            }
        }.build()

        return _GhostDuotone!!
    }

@Suppress("ObjectPropertyName")
private var _GhostDuotone: ImageVector? = null
