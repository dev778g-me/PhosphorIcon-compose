package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.PhoneListFill: ImageVector
    get() {
        if (_PhoneListFill != null) {
            return _PhoneListFill!!
        }
        _PhoneListFill = ImageVector.Builder(
            name = "Filled.PhoneListFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(223.88f, 183.08f)
                arcTo(56.26f, 56.26f, 0f, isMoreThanHalf = false, isPositiveArc = true, 168f, 232f)
                curveTo(88.6f, 232f, 24f, 167.4f, 24f, 88f)
                arcTo(56.26f, 56.26f, 0f, isMoreThanHalf = false, isPositiveArc = true, 72.92f, 32.12f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16.62f, 9.52f)
                lineToRelative(21.12f, 47.15f)
                arcToRelative(0.61f, 0.61f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 0.12f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 109.39f, 104f)
                curveToRelative(-0.18f, 0.27f, -0.37f, 0.52f, -0.57f, 0.77f)
                lineTo(88f, 129.45f)
                curveToRelative(7.49f, 15.22f, 23.41f, 31f, 38.83f, 38.51f)
                lineToRelative(24.34f, -20.71f)
                arcToRelative(8.12f, 8.12f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.75f, -0.56f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 15.18f, -1.4f)
                lineToRelative(0.12f, 0.06f)
                lineToRelative(47.1f, 21.11f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 223.88f, 183.08f)
                close()
                moveTo(144f, 72f)
                horizontalLineToRelative(64f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -16f)
                lineTo(144f, 56f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 16f)
                close()
                moveTo(144f, 112f)
                horizontalLineToRelative(64f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -16f)
                lineTo(144f, 96f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 16f)
                close()
            }
        }.build()

        return _PhoneListFill!!
    }

@Suppress("ObjectPropertyName")
private var _PhoneListFill: ImageVector? = null
