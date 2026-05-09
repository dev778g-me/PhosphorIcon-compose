package com.phosphor.icons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Light.SwatchesLight: ImageVector
    get() {
        if (_SwatchesLight != null) {
            return _SwatchesLight!!
        }
        _SwatchesLight = ImageVector.Builder(
            name = "Light.SwatchesLight",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(76f, 180f)
                moveToRelative(-10f, 0f)
                arcToRelative(10f, 10f, 0f, isMoreThanHalf = true, isPositiveArc = true, 20f, 0f)
                arcToRelative(10f, 10f, 0f, isMoreThanHalf = true, isPositiveArc = true, -20f, 0f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 12f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(110.84f, 186.25f)
                arcToRelative(35.71f, 35.71f, 0f, isMoreThanHalf = false, isPositiveArc = true, -41.34f, 29.2f)
                horizontalLineToRelative(0f)
                arcToRelative(36f, 36f, 0f, isMoreThanHalf = false, isPositiveArc = true, -28.95f, -41.71f)
                lineToRelative(25f, -143.13f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9.19f, -6.49f)
                lineToRelative(54.67f, 9.73f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6.44f, 9.26f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 12f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(232f, 156.19f)
                verticalLineTo(208f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -8f, 8f)
                horizontalLineTo(76f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 12f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(121.42f, 125.76f)
                lineToRelative(80.79f, -29.28f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10.22f, 4.75f)
                lineToRelative(19.09f, 52.21f)
                arcToRelative(7.93f, 7.93f, 0f, isMoreThanHalf = false, isPositiveArc = true, -4.77f, 10.17f)
                lineTo(88.16f, 213.84f)
                arcTo(35.07f, 35.07f, 0f, isMoreThanHalf = false, isPositiveArc = true, 76f, 216f)
            }
        }.build()

        return _SwatchesLight!!
    }

@Suppress("ObjectPropertyName")
private var _SwatchesLight: ImageVector? = null
