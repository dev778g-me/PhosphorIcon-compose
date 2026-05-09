package com.phosphor.icons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Bold.MaskSadBold: ImageVector
    get() {
        if (_MaskSadBold != null) {
            return _MaskSadBold!!
        }
        _MaskSadBold = ImageVector.Builder(
            name = "Bold.MaskSadBold",
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
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(148f, 181.5f)
                arcToRelative(39.11f, 39.11f, 0f, isMoreThanHalf = false, isPositiveArc = false, -40f, 0f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(148f, 120f)
                arcToRelative(29.59f, 29.59f, 0f, isMoreThanHalf = false, isPositiveArc = false, 28f, 2.12f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(80f, 122.12f)
                arcTo(29.61f, 29.61f, 0f, isMoreThanHalf = false, isPositiveArc = false, 108f, 120f)
            }
        }.build()

        return _MaskSadBold!!
    }

@Suppress("ObjectPropertyName")
private var _MaskSadBold: ImageVector? = null
