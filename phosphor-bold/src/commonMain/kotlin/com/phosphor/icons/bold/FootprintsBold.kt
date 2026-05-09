package com.phosphor.icons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Bold.FootprintsBold: ImageVector
    get() {
        if (_FootprintsBold != null) {
            return _FootprintsBold!!
        }
        _FootprintsBold = ImageVector.Builder(
            name = "Bold.FootprintsBold",
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
                moveTo(156f, 192f)
                horizontalLineToRelative(56f)
                verticalLineToRelative(12f)
                arcToRelative(28f, 28f, 0f, isMoreThanHalf = false, isPositiveArc = true, -56f, 0f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(44f, 168f)
                horizontalLineToRelative(56f)
                verticalLineToRelative(12f)
                arcToRelative(28f, 28f, 0f, isMoreThanHalf = false, isPositiveArc = true, -56f, 0f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(46.74f, 128f)
                curveTo(20.54f, 98.29f, 47.48f, 24f, 72f, 24f)
                reflectiveCurveToRelative(51.46f, 74.29f, 25.26f, 104f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(158.74f, 152f)
                curveToRelative(-26.2f, -29.71f, 0.74f, -104f, 25.26f, -104f)
                reflectiveCurveToRelative(51.46f, 74.29f, 25.26f, 104f)
                close()
            }
        }.build()

        return _FootprintsBold!!
    }

@Suppress("ObjectPropertyName")
private var _FootprintsBold: ImageVector? = null
