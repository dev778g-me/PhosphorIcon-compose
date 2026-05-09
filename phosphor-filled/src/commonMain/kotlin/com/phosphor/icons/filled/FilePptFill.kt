package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.FilePptFill: ImageVector
    get() {
        if (_FilePptFill != null) {
            return _FilePptFill!!
        }
        _FilePptFill = ImageVector.Builder(
            name = "Filled.FilePptFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(224f, 152.53f)
                arcToRelative(8.17f, 8.17f, 0f, isMoreThanHalf = false, isPositiveArc = true, -8.25f, 7.47f)
                lineTo(204f, 160f)
                verticalLineToRelative(47.73f)
                arcToRelative(8.17f, 8.17f, 0f, isMoreThanHalf = false, isPositiveArc = true, -7.47f, 8.25f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -8.53f, -8f)
                lineTo(188f, 160f)
                lineTo(176.27f, 160f)
                arcToRelative(8.17f, 8.17f, 0f, isMoreThanHalf = false, isPositiveArc = true, -8.25f, -7.47f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, -8.53f)
                horizontalLineToRelative(40f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 224f, 152.53f)
                close()
                moveTo(92f, 172.85f)
                curveTo(91.54f, 188.08f, 78.64f, 200f, 63.4f, 200f)
                lineTo(56f, 200f)
                verticalLineToRelative(7.73f)
                arcTo(8.17f, 8.17f, 0f, isMoreThanHalf = false, isPositiveArc = true, 48.53f, 216f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 40f, 208f)
                lineTo(40f, 152f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, -8f)
                lineTo(64f, 144f)
                arcTo(28f, 28f, 0f, isMoreThanHalf = false, isPositiveArc = true, 92f, 172.85f)
                close()
                moveTo(76f, 170.85f)
                arcTo(12.25f, 12.25f, 0f, isMoreThanHalf = false, isPositiveArc = false, 63.65f, 160f)
                lineTo(56f, 160f)
                verticalLineToRelative(24f)
                horizontalLineToRelative(8f)
                arcTo(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = false, 76f, 170.84f)
                close()
                moveTo(160f, 172.85f)
                curveTo(159.54f, 188.08f, 146.64f, 200f, 131.4f, 200f)
                lineTo(124f, 200f)
                verticalLineToRelative(7.73f)
                arcToRelative(8.17f, 8.17f, 0f, isMoreThanHalf = false, isPositiveArc = true, -7.47f, 8.25f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -8.53f, -8f)
                lineTo(108f, 152f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, -8f)
                horizontalLineToRelative(16f)
                arcTo(28f, 28f, 0f, isMoreThanHalf = false, isPositiveArc = true, 160f, 172.85f)
                close()
                moveTo(144f, 170.85f)
                arcTo(12.25f, 12.25f, 0f, isMoreThanHalf = false, isPositiveArc = false, 131.65f, 160f)
                lineTo(124f, 160f)
                verticalLineToRelative(24f)
                horizontalLineToRelative(8f)
                arcTo(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = false, 144f, 170.84f)
                close()
                moveTo(40f, 116f)
                lineTo(40f, 40f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 56f, 24f)
                horizontalLineToRelative(96f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.66f, 2.34f)
                lineToRelative(56f, 56f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 216f, 88f)
                verticalLineToRelative(28f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, -4f, 4f)
                lineTo(44f, 120f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 40f, 116f)
                close()
                moveTo(152f, 88f)
                horizontalLineToRelative(44f)
                lineTo(152f, 44f)
                close()
            }
        }.build()

        return _FilePptFill!!
    }

@Suppress("ObjectPropertyName")
private var _FilePptFill: ImageVector? = null
