package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.PixLogoFill: ImageVector
    get() {
        if (_PixLogoFill != null) {
            return _PixLogoFill!!
        }
        _PixLogoFill = ImageVector.Builder(
            name = "Filled.PixLogoFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(235.34f, 139.28f)
                lineToRelative(-19.56f, 19.55f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 213f, 160f)
                lineTo(171.32f, 160f)
                lineToRelative(-32f, -32f)
                lineToRelative(32f, -32f)
                lineTo(213f, 96f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.82f, 1.17f)
                lineToRelative(19.56f, 19.55f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 235.34f, 139.28f)
                close()
                moveTo(67.05f, 80f)
                lineTo(88f, 80f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.65f, 2.34f)
                lineTo(128f, 116.68f)
                lineToRelative(34.35f, -34.34f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 168f, 80f)
                lineTo(189f, 80f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.83f, -6.83f)
                lineToRelative(-52.5f, -52.51f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, -22.56f, 0f)
                lineTo(64.22f, 73.17f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 67.05f, 80f)
                close()
                moveTo(189f, 176f)
                lineTo(168f, 176f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -5.65f, -2.34f)
                lineTo(128f, 139.31f)
                lineTo(93.65f, 173.66f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 88f, 176f)
                horizontalLineToRelative(-21f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.83f, 6.83f)
                lineToRelative(52.5f, 52.51f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 22.56f, 0f)
                lineToRelative(52.5f, -52.51f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 189f, 176f)
                close()
                moveTo(116.74f, 128f)
                lineTo(84.74f, 96f)
                lineTo(43f, 96f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.82f, 1.17f)
                lineTo(20.66f, 116.72f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 22.56f)
                lineToRelative(19.56f, 19.55f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 43f, 160f)
                lineTo(84.68f, 160f)
                close()
            }
        }.build()

        return _PixLogoFill!!
    }

@Suppress("ObjectPropertyName")
private var _PixLogoFill: ImageVector? = null
