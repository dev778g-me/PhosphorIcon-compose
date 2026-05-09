package com.phosphor.icons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Bold.ClockCountdownBold: ImageVector
    get() {
        if (_ClockCountdownBold != null) {
            return _ClockCountdownBold!!
        }
        _ClockCountdownBold = ImageVector.Builder(
            name = "Bold.ClockCountdownBold",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(224f, 136f)
                curveToRelative(-4.07f, 49.28f, -45.67f, 88f, -96f, 88f)
                arcToRelative(96f, 96f, 0f, isMoreThanHalf = false, isPositiveArc = true, -96f, -96f)
                curveToRelative(0f, -50.33f, 38.72f, -91.93f, 88f, -96f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(128f, 76f)
                lineToRelative(0f, 52f)
                lineToRelative(52f, 0f)
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(208f, 80f)
                moveToRelative(-16f, 0f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = true, isPositiveArc = true, 32f, 0f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = true, isPositiveArc = true, -32f, 0f)
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(176f, 48f)
                moveToRelative(-16f, 0f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = true, isPositiveArc = true, 32f, 0f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = true, isPositiveArc = true, -32f, 0f)
            }
        }.build()

        return _ClockCountdownBold!!
    }

@Suppress("ObjectPropertyName")
private var _ClockCountdownBold: ImageVector? = null
