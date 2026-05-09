package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.RecycleFill: ImageVector
    get() {
        if (_RecycleFill != null) {
            return _RecycleFill!!
        }
        _RecycleFill = ImageVector.Builder(
            name = "Filled.RecycleFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(96f, 208f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -8f, 8f)
                lineTo(40f, 216f)
                arcToRelative(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = true, -20.77f, -36f)
                lineToRelative(28f, -48.3f)
                lineToRelative(-13.82f, -8f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 35.33f, 109f)
                lineToRelative(32.77f, -8.77f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9.8f, 5.66f)
                lineToRelative(8.79f, 32.77f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -11.73f, 9f)
                lineToRelative(-13.88f, -8f)
                lineTo(33.11f, 188f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 40f, 200f)
                lineTo(88f, 200f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 96f, 208f)
                close()
                moveTo(236.73f, 180f)
                lineTo(213.59f, 140f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -13.84f, 8f)
                lineToRelative(23.14f, 40f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 216f, 200f)
                lineTo(160f, 200f)
                lineTo(160f, 184f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -13.66f, -5.66f)
                lineToRelative(-24f, 24f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 11.32f)
                lineToRelative(24f, 24f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 160f, 232f)
                lineTo(160f, 216f)
                horizontalLineToRelative(56f)
                arcToRelative(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20.77f, -36f)
                close()
                moveTo(128f, 32f)
                arcToRelative(7.85f, 7.85f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6.92f, 4f)
                lineToRelative(28f, 48.3f)
                lineToRelative(-13.82f, 8f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 151f, 106.92f)
                lineToRelative(32.78f, 8.79f)
                arcToRelative(8.23f, 8.23f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.07f, 0.27f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.72f, -5.93f)
                lineToRelative(8.79f, -32.79f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -11.72f, -9f)
                lineToRelative(-13.89f, 8f)
                lineTo(148.77f, 28f)
                arcToRelative(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = false, -41.54f, 0f)
                lineTo(84.07f, 68f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 13.85f, 8f)
                lineToRelative(23.16f, -40f)
                arcTo(7.85f, 7.85f, 0f, isMoreThanHalf = false, isPositiveArc = true, 128f, 32f)
                close()
            }
        }.build()

        return _RecycleFill!!
    }

@Suppress("ObjectPropertyName")
private var _RecycleFill: ImageVector? = null
