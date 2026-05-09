package com.phosphor.icons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Light.StudentLight: ImageVector
    get() {
        if (_StudentLight != null) {
            return _StudentLight!!
        }
        _StudentLight = ImageVector.Builder(
            name = "Light.StudentLight",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 12f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(32f, 64f)
                lineTo(32f, 144f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 12f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(56f, 216f)
                curveToRelative(15.7f, -24.08f, 41.11f, -40f, 72f, -40f)
                reflectiveCurveToRelative(56.3f, 15.92f, 72f, 40f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 12f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(224f, 64f)
                lineToRelative(-96f, 32f)
                lineToRelative(-96f, -32f)
                lineToRelative(96f, -32f)
                lineToRelative(96f, 32f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 12f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(169.34f, 82.22f)
                arcToRelative(56f, 56f, 0f, isMoreThanHalf = true, isPositiveArc = true, -82.68f, 0f)
            }
        }.build()

        return _StudentLight!!
    }

@Suppress("ObjectPropertyName")
private var _StudentLight: ImageVector? = null
