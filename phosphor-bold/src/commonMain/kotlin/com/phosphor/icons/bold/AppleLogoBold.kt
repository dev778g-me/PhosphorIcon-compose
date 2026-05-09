package com.phosphor.icons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Bold.AppleLogoBold: ImageVector
    get() {
        if (_AppleLogoBold != null) {
            return _AppleLogoBold!!
        }
        _AppleLogoBold = ImageVector.Builder(
            name = "Bold.AppleLogoBold",
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
                moveTo(216f, 73.52f)
                curveTo(204.53f, 62.66f, 185f, 56f, 168f, 56f)
                arcToRelative(63.72f, 63.72f, 0f, isMoreThanHalf = false, isPositiveArc = false, -40f, 14f)
                horizontalLineToRelative(0f)
                arcTo(63.71f, 63.71f, 0f, isMoreThanHalf = false, isPositiveArc = false, 88.88f, 56f)
                curveTo(52f, 55.5f, 23.06f, 86.3f, 24f, 123.19f)
                arcToRelative(119.62f, 119.62f, 0f, isMoreThanHalf = false, isPositiveArc = false, 37.65f, 84.12f)
                arcTo(31.92f, 31.92f, 0f, isMoreThanHalf = false, isPositiveArc = false, 83.6f, 216f)
                horizontalLineToRelative(87.7f)
                arcToRelative(31.75f, 31.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 23.26f, -10f)
                curveToRelative(15.85f, -17f, 21.44f, -33.2f, 21.44f, -33.2f)
                horizontalLineToRelative(0f)
                curveToRelative(-16.79f, -11.53f, -24f, -30.87f, -24f, -52.78f)
                curveToRelative(0f, -18.3f, 11.68f, -34.81f, 24f, -46.48f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(148f, 12f)
                arcToRelative(32.12f, 32.12f, 0f, isMoreThanHalf = false, isPositiveArc = false, -9.77f, 8.37f)
            }
        }.build()

        return _AppleLogoBold!!
    }

@Suppress("ObjectPropertyName")
private var _AppleLogoBold: ImageVector? = null
