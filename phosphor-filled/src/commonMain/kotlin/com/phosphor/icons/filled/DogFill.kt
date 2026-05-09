package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.DogFill: ImageVector
    get() {
        if (_DogFill != null) {
            return _DogFill!!
        }
        _DogFill = ImageVector.Builder(
            name = "Filled.DogFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(239.71f, 125f)
                lineToRelative(-16.42f, -88f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, -19.61f, -12.58f)
                lineToRelative(-0.31f, 0.09f)
                lineTo(150.85f, 40f)
                horizontalLineToRelative(-45.7f)
                lineTo(52.63f, 24.56f)
                lineToRelative(-0.31f, -0.09f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 32.71f, 37.05f)
                lineTo(16.29f, 125f)
                arcToRelative(15.77f, 15.77f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9.12f, 17.52f)
                arcTo(16.26f, 16.26f, 0f, isMoreThanHalf = false, isPositiveArc = false, 32.12f, 144f)
                arcTo(15.48f, 15.48f, 0f, isMoreThanHalf = false, isPositiveArc = false, 40f, 141.84f)
                lineTo(40f, 184f)
                arcToRelative(40f, 40f, 0f, isMoreThanHalf = false, isPositiveArc = false, 40f, 40f)
                horizontalLineToRelative(96f)
                arcToRelative(40f, 40f, 0f, isMoreThanHalf = false, isPositiveArc = false, 40f, -40f)
                lineTo(216f, 141.85f)
                arcToRelative(15.5f, 15.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.87f, 2.16f)
                arcToRelative(16.31f, 16.31f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6.72f, -1.47f)
                arcTo(15.77f, 15.77f, 0f, isMoreThanHalf = false, isPositiveArc = false, 239.71f, 125f)
                close()
                moveTo(176f, 208f)
                lineTo(136f, 208f)
                lineTo(136f, 195.31f)
                lineToRelative(13.66f, -13.65f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -11.32f, -11.32f)
                lineTo(128f, 180.69f)
                lineToRelative(-10.34f, -10.35f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -11.32f, 11.32f)
                lineTo(120f, 195.31f)
                lineTo(120f, 208f)
                lineTo(80f, 208f)
                arcToRelative(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = true, -24f, -24f)
                lineTo(56f, 123.11f)
                lineTo(107.93f, 56f)
                horizontalLineToRelative(40.14f)
                lineTo(200f, 123.11f)
                lineTo(200f, 184f)
                arcTo(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = true, 176f, 208f)
                close()
                moveTo(104f, 140f)
                arcToRelative(12f, 12f, 0f, isMoreThanHalf = true, isPositiveArc = true, -12f, -12f)
                arcTo(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = true, 104f, 140f)
                close()
                moveTo(176f, 140f)
                arcToRelative(12f, 12f, 0f, isMoreThanHalf = true, isPositiveArc = true, -12f, -12f)
                arcTo(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = true, 176f, 140f)
                close()
            }
        }.build()

        return _DogFill!!
    }

@Suppress("ObjectPropertyName")
private var _DogFill: ImageVector? = null
