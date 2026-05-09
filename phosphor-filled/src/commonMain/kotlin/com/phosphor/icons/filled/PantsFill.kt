package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.PantsFill: ImageVector
    get() {
        if (_PantsFill != null) {
            return _PantsFill!!
        }
        _PantsFill = ImageVector.Builder(
            name = "Filled.PantsFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(53.44f, 43.5f)
                lineTo(54.12f, 38f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 70f, 24f)
                horizontalLineTo(186f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 15.88f, 14f)
                lineToRelative(0.68f, 5.49f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, -4f, 4.5f)
                horizontalLineTo(57.41f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 53.44f, 43.5f)
                close()
                moveTo(169f, 64f)
                arcToRelative(32.06f, 32.06f, 0f, isMoreThanHalf = false, isPositiveArc = false, 31f, 24f)
                horizontalLineToRelative(3.59f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, -4.5f)
                lineToRelative(-2f, -16f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4f, -3.5f)
                close()
                moveTo(52.41f, 88f)
                horizontalLineTo(56f)
                arcTo(32.06f, 32.06f, 0f, isMoreThanHalf = false, isPositiveArc = false, 87f, 64f)
                horizontalLineTo(54.41f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4f, 3.5f)
                lineToRelative(-2f, 16f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 52.41f, 88f)
                close()
                moveTo(223.88f, 214f)
                lineTo(210.56f, 107.5f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4f, -3.5f)
                horizontalLineTo(200f)
                arcToRelative(48.07f, 48.07f, 0f, isMoreThanHalf = false, isPositiveArc = true, -47.32f, -40f)
                horizontalLineTo(136f)
                verticalLineToRelative(39.73f)
                arcToRelative(8.18f, 8.18f, 0f, isMoreThanHalf = false, isPositiveArc = true, -7.47f, 8.25f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -8.53f, -8f)
                verticalLineTo(64f)
                horizontalLineTo(103.32f)
                arcTo(48.07f, 48.07f, 0f, isMoreThanHalf = false, isPositiveArc = true, 56f, 104f)
                horizontalLineTo(49.41f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4f, 3.5f)
                lineTo(32.12f, 214f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6.71f, 15.09f)
                arcTo(16.56f, 16.56f, 0f, isMoreThanHalf = false, isPositiveArc = false, 48.39f, 232f)
                horizontalLineToRelative(40.3f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 15.51f, -12.06f)
                lineToRelative(23.8f, -92f)
                lineToRelative(23.79f, 91.94f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 167.31f, 232f)
                horizontalLineToRelative(40.3f)
                arcToRelative(16.54f, 16.54f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9.56f, -2.89f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 223.88f, 214f)
                close()
            }
        }.build()

        return _PantsFill!!
    }

@Suppress("ObjectPropertyName")
private var _PantsFill: ImageVector? = null
