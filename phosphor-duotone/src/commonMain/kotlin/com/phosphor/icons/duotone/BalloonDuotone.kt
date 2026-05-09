package com.phosphor.icons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Duotone.BalloonDuotone: ImageVector
    get() {
        if (_BalloonDuotone != null) {
            return _BalloonDuotone!!
        }
        _BalloonDuotone = ImageVector.Builder(
            name = "Duotone.BalloonDuotone",
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
                moveTo(208f, 104f)
                arcToRelative(80f, 80f, 0f, isMoreThanHalf = false, isPositiveArc = false, -160f, 0f)
                curveToRelative(0f, 40.83f, 30.59f, 88.18f, 70.1f, 95.13f)
                horizontalLineToRelative(0f)
                lineTo(104f, 232f)
                horizontalLineToRelative(48f)
                lineToRelative(-14.09f, -32.87f)
                horizontalLineToRelative(0f)
                curveTo(177.41f, 192.18f, 208f, 144.83f, 208f, 104f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(208f, 104f)
                curveToRelative(0f, 44.18f, -35.82f, 96f, -80f, 96f)
                reflectiveCurveToRelative(-80f, -51.82f, -80f, -96f)
                arcToRelative(80f, 80f, 0f, isMoreThanHalf = false, isPositiveArc = true, 160f, 0f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(136f, 56f)
                arcToRelative(49.52f, 49.52f, 0f, isMoreThanHalf = false, isPositiveArc = true, 40f, 40f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(137.91f, 199.13f)
                lineToRelative(14.09f, 32.87f)
                lineToRelative(-48f, 0f)
                lineToRelative(14.09f, -32.87f)
            }
        }.build()

        return _BalloonDuotone!!
    }

@Suppress("ObjectPropertyName")
private var _BalloonDuotone: ImageVector? = null
