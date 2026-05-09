package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.PaintBucketFill: ImageVector
    get() {
        if (_PaintBucketFill != null) {
            return _PaintBucketFill!!
        }
        _PaintBucketFill = ImageVector.Builder(
            name = "Filled.PaintBucketFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(256f, 208f)
                arcToRelative(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = true, -48f, 0f)
                curveToRelative(0f, -17.91f, 15.57f, -41.77f, 17.34f, -44.44f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 13.32f, 0f)
                curveTo(240.43f, 166.23f, 256f, 190.09f, 256f, 208f)
                close()
                moveTo(132.49f, 124.49f)
                arcToRelative(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = false, -17f, -17f)
                lineToRelative(0f, 0f)
                reflectiveCurveToRelative(0f, 0f, 0f, 0f)
                arcToRelative(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = false, 17f, 16.94f)
                close()
                moveTo(37.65f, 18.34f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 26.34f, 29.66f)
                lineToRelative(32.6f, 32.6f)
                lineTo(70.25f, 51f)
                close()
                moveTo(234.53f, 139.07f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.13f, -13.24f)
                lineTo(122.17f, 10.34f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -11.31f, 0f)
                lineTo(70.25f, 51f)
                lineToRelative(40.43f, 40.42f)
                arcToRelative(28f, 28f, 0f, isMoreThanHalf = true, isPositiveArc = true, -11.31f, 11.32f)
                lineTo(58.94f, 62.26f)
                lineTo(15f, 106.17f)
                arcToRelative(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 33.94f)
                lineTo(99.89f, 225f)
                arcToRelative(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = false, 33.94f, 0f)
                lineToRelative(78.49f, -78.49f)
                close()
            }
        }.build()

        return _PaintBucketFill!!
    }

@Suppress("ObjectPropertyName")
private var _PaintBucketFill: ImageVector? = null
