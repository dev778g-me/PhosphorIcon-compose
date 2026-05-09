package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.ChatCenteredSlashFill: ImageVector
    get() {
        if (_ChatCenteredSlashFill != null) {
            return _ChatCenteredSlashFill!!
        }
        _ChatCenteredSlashFill = ImageVector.Builder(
            name = "Filled.ChatCenteredSlashFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(232f, 56f)
                verticalLineTo(184f)
                arcToRelative(15.93f, 15.93f, 0f, isMoreThanHalf = false, isPositiveArc = true, -4.82f, 11.42f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, -5.68f, -0.25f)
                lineTo(86.52f, 46.69f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, -6.69f)
                horizontalLineTo(216f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 232f, 56f)
                close()
                moveTo(53.92f, 34.62f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 40f, 40f)
                horizontalLineToRelative(0f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, 56f)
                verticalLineTo(184f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 16f)
                horizontalLineToRelative(60.43f)
                lineToRelative(13.68f, 23.94f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 27.78f, 0f)
                lineTo(155.57f, 200f)
                horizontalLineToRelative(27.07f)
                lineToRelative(19.44f, 21.38f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = false, 11.84f, -10.76f)
                close()
            }
        }.build()

        return _ChatCenteredSlashFill!!
    }

@Suppress("ObjectPropertyName")
private var _ChatCenteredSlashFill: ImageVector? = null
