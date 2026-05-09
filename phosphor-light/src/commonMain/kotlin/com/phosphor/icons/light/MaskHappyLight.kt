package com.phosphor.icons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Light.MaskHappyLight: ImageVector
    get() {
        if (_MaskHappyLight != null) {
            return _MaskHappyLight!!
        }
        _MaskHappyLight = ImageVector.Builder(
            name = "Light.MaskHappyLight",
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
                moveTo(144f, 128f)
                curveToRelative(4.39f, -4.91f, 12.89f, -8f, 20f, -8f)
                reflectiveCurveToRelative(15.61f, 3.09f, 20f, 8f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 12f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(72f, 128f)
                curveToRelative(4.39f, -4.91f, 12.89f, -8f, 20f, -8f)
                reflectiveCurveToRelative(15.61f, 3.09f, 20f, 8f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 12f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(162.36f, 168f)
                arcToRelative(44.89f, 44.89f, 0f, isMoreThanHalf = false, isPositiveArc = true, -68.72f, 0f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 12f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(216f, 48f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -10.89f, -7.47f)
                curveTo(190f, 46.41f, 160.89f, 55.71f, 128f, 55.71f)
                reflectiveCurveToRelative(-62f, -9.3f, -77.11f, -15.16f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 40f, 48f)
                verticalLineToRelative(55.77f)
                curveTo(40f, 174.6f, 79.4f, 232f, 128f, 232f)
                reflectiveCurveToRelative(88f, -57.4f, 88f, -128.21f)
                close()
            }
        }.build()

        return _MaskHappyLight!!
    }

@Suppress("ObjectPropertyName")
private var _MaskHappyLight: ImageVector? = null
