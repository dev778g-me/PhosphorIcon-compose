package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.HandsPrayingFill: ImageVector
    get() {
        if (_HandsPrayingFill != null) {
            return _HandsPrayingFill!!
        }
        _HandsPrayingFill = ImageVector.Builder(
            name = "Filled.HandsPrayingFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(235.32f, 180f)
                lineToRelative(-36.24f, -36.25f)
                lineTo(162.62f, 23.46f)
                arcTo(21.76f, 21.76f, 0f, isMoreThanHalf = false, isPositiveArc = false, 128f, 12.93f)
                arcTo(21.76f, 21.76f, 0f, isMoreThanHalf = false, isPositiveArc = false, 93.38f, 23.46f)
                lineTo(56.92f, 143.76f)
                lineTo(20.68f, 180f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 22.62f)
                lineToRelative(32.69f, 32.69f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 22.63f, 0f)
                lineTo(124.28f, 187f)
                arcToRelative(40.68f, 40.68f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.72f, -4.29f)
                arcToRelative(40.68f, 40.68f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.72f, 4.29f)
                lineTo(180f, 235.32f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 22.63f, 0f)
                lineToRelative(32.69f, -32.69f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 235.32f, 180f)
                close()
                moveTo(120f, 158.75f)
                arcToRelative(23.85f, 23.85f, 0f, isMoreThanHalf = false, isPositiveArc = true, -7f, 17f)
                lineTo(88.68f, 200f)
                lineTo(56f, 167.32f)
                lineToRelative(13.65f, -13.66f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, -3.34f)
                lineToRelative(37f, -122.22f)
                arcTo(5.78f, 5.78f, 0f, isMoreThanHalf = false, isPositiveArc = true, 120f, 29.78f)
                close()
                moveTo(167.44f, 200.13f)
                lineTo(143f, 175.72f)
                arcToRelative(23.85f, 23.85f, 0f, isMoreThanHalf = false, isPositiveArc = true, -7f, -17f)
                verticalLineToRelative(-129f)
                arcToRelative(5.78f, 5.78f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11.31f, -1.68f)
                lineToRelative(37f, 122.22f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 3.34f)
                lineToRelative(14.49f, 14.49f)
                close()
            }
        }.build()

        return _HandsPrayingFill!!
    }

@Suppress("ObjectPropertyName")
private var _HandsPrayingFill: ImageVector? = null
