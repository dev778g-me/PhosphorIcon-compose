package com.phosphor.icons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Bold.ThermometerHotBold: ImageVector
    get() {
        if (_ThermometerHotBold != null) {
            return _ThermometerHotBold!!
        }
        _ThermometerHotBold = ImageVector.Builder(
            name = "Bold.ThermometerHotBold",
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
                moveTo(108f, 188f)
                lineTo(108f, 56f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(68f, 154.78f)
                verticalLineTo(56f)
                arcToRelative(40f, 40f, 0f, isMoreThanHalf = false, isPositiveArc = true, 80f, 0f)
                verticalLineToRelative(98.77f)
                horizontalLineToRelative(0f)
                arcToRelative(52f, 52f, 0f, isMoreThanHalf = true, isPositiveArc = true, -80f, 0f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(108f, 188f)
                moveToRelative(-24f, 0f)
                arcToRelative(24f, 24f, 0f, isMoreThanHalf = true, isPositiveArc = true, 48f, 0f)
                arcToRelative(24f, 24f, 0f, isMoreThanHalf = true, isPositiveArc = true, -48f, 0f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(184f, 76.4f)
                curveToRelative(22.91f, -14.92f, 33.09f, 14.12f, 56f, -0.8f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(184f, 116.4f)
                curveToRelative(22.91f, -14.92f, 33.09f, 14.12f, 56f, -0.8f)
            }
        }.build()

        return _ThermometerHotBold!!
    }

@Suppress("ObjectPropertyName")
private var _ThermometerHotBold: ImageVector? = null
