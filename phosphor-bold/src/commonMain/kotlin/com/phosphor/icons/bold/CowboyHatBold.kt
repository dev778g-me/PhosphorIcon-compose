package com.phosphor.icons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Bold.CowboyHatBold: ImageVector
    get() {
        if (_CowboyHatBold != null) {
            return _CowboyHatBold!!
        }
        _CowboyHatBold = ImageVector.Builder(
            name = "Bold.CowboyHatBold",
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
                moveTo(44f, 128f)
                curveToRelative(40f, 64f, 84f, 64f, 84f, 64f)
                reflectiveCurveToRelative(44f, 0f, 84f, -64f)
                arcToRelative(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 64f)
                horizontalLineTo(44f)
                arcToRelative(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -64f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(70.06f, 136f)
                lineTo(185.94f, 136f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(66.05f, 157.08f)
                lineTo(85.54f, 54.53f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 98.4f, 49.76f)
                lineTo(123f, 70.25f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 10f, 0f)
                lineToRelative(24.6f, -20.49f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12.86f, 4.77f)
                lineTo(190f, 157.08f)
            }
        }.build()

        return _CowboyHatBold!!
    }

@Suppress("ObjectPropertyName")
private var _CowboyHatBold: ImageVector? = null
