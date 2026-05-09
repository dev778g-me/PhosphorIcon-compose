package com.phosphor.icons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Duotone.FootballDuotone: ImageVector
    get() {
        if (_FootballDuotone != null) {
            return _FootballDuotone!!
        }
        _FootballDuotone = ImageVector.Builder(
            name = "Duotone.FootballDuotone",
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
                moveTo(33.45f, 145.45f)
                curveToRelative(3.32f, -25.24f, 13f, -53f, 36f, -76f)
                reflectiveCurveToRelative(50.75f, -32.69f, 76f, -36f)
                horizontalLineToRelative(0f)
                lineToRelative(77.1f, 77.1f)
                horizontalLineToRelative(0f)
                curveToRelative(-3.32f, 25.24f, -13f, 53f, -36f, 76f)
                reflectiveCurveToRelative(-50.75f, 32.69f, -76f, 36f)
                horizontalLineToRelative(0f)
                lineToRelative(-77.1f, -77.1f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(186.54f, 186.54f)
                curveToRelative(-43f, 43f, -102.66f, 39.55f, -131.35f, 34.69f)
                arcToRelative(24.92f, 24.92f, 0f, isMoreThanHalf = false, isPositiveArc = true, -20.42f, -20.42f)
                curveToRelative(-4.86f, -28.69f, -8.29f, -88.37f, 34.69f, -131.35f)
                reflectiveCurveTo(172.12f, 29.91f, 200.81f, 34.77f)
                arcToRelative(24.92f, 24.92f, 0f, isMoreThanHalf = false, isPositiveArc = true, 20.42f, 20.42f)
                curveTo(226.09f, 83.88f, 229.52f, 143.56f, 186.54f, 186.54f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(104f, 128f)
                lineTo(128f, 152f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(128f, 104f)
                lineTo(152f, 128f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(160f, 96f)
                lineTo(96f, 160f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(145.45f, 33.45f)
                lineTo(222.55f, 110.55f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(33.45f, 145.45f)
                lineTo(110.55f, 222.55f)
            }
        }.build()

        return _FootballDuotone!!
    }

@Suppress("ObjectPropertyName")
private var _FootballDuotone: ImageVector? = null
