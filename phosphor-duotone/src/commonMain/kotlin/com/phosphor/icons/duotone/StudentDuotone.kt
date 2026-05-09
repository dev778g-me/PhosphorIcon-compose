package com.phosphor.icons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Duotone.StudentDuotone: ImageVector
    get() {
        if (_StudentDuotone != null) {
            return _StudentDuotone!!
        }
        _StudentDuotone = ImageVector.Builder(
            name = "Duotone.StudentDuotone",
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
                moveTo(224f, 64f)
                lineToRelative(-96f, 32f)
                lineToRelative(-96f, -32f)
                lineToRelative(96f, -32f)
                lineToRelative(96f, 32f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(32f, 64f)
                lineTo(32f, 144f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(56f, 216f)
                curveToRelative(15.7f, -24.08f, 41.11f, -40f, 72f, -40f)
                reflectiveCurveToRelative(56.3f, 15.92f, 72f, 40f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
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
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(169.34f, 82.22f)
                arcToRelative(56f, 56f, 0f, isMoreThanHalf = true, isPositiveArc = true, -82.68f, 0f)
            }
        }.build()

        return _StudentDuotone!!
    }

@Suppress("ObjectPropertyName")
private var _StudentDuotone: ImageVector? = null
