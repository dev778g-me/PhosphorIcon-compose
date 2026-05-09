package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.SneakerMoveFill: ImageVector
    get() {
        if (_SneakerMoveFill != null) {
            return _SneakerMoveFill!!
        }
        _SneakerMoveFill = ImageVector.Builder(
            name = "Filled.SneakerMoveFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(70.8f, 184f)
                lineTo(32f, 184f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -16f)
                lineTo(70.8f, 168f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = true, 0f, 16f)
                close()
                moveTo(102.8f, 200f)
                lineTo(48f, 200f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 16f)
                horizontalLineToRelative(54.8f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = false, 0f, -16f)
                close()
                moveTo(231.16f, 166.63f)
                lineTo(202.53f, 152.32f)
                arcTo(47.74f, 47.74f, 0f, isMoreThanHalf = false, isPositiveArc = true, 176f, 109.39f)
                lineTo(176f, 80f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -7.93f, -8f)
                arcTo(48.05f, 48.05f, 0f, isMoreThanHalf = false, isPositiveArc = true, 120f, 24.07f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -12.83f, -6.44f)
                lineTo(45.11f, 64.68f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.41f, 6f)
                lineToRelative(51.44f, 51.44f)
                arcToRelative(8.19f, 8.19f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.6f, 11.09f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -11.71f, 0.43f)
                lineToRelative(-53f, -53f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, -6.44f, 1.09f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.12f, 18.22f)
                lineTo(142.4f, 213.66f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.66f, 2.34f)
                lineTo(224f, 216f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, -16f)
                lineTo(240f, 180.94f)
                arcTo(15.92f, 15.92f, 0f, isMoreThanHalf = false, isPositiveArc = false, 231.16f, 166.63f)
                close()
            }
        }.build()

        return _SneakerMoveFill!!
    }

@Suppress("ObjectPropertyName")
private var _SneakerMoveFill: ImageVector? = null
