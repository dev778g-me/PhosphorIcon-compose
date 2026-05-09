package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.ChatTeardropSlashFill: ImageVector
    get() {
        if (_ChatTeardropSlashFill != null) {
            return _ChatTeardropSlashFill!!
        }
        _ChatTeardropSlashFill = ImageVector.Builder(
            name = "Filled.ChatTeardropSlashFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(213.92f, 210.62f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = true, -11.84f, 10.76f)
                lineToRelative(-13.57f, -14.92f)
                arcTo(99.4f, 99.4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 132f, 224f)
                lineTo(48f, 224f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, -16f, -16f)
                lineTo(32f, 124f)
                arcTo(99.54f, 99.54f, 0f, isMoreThanHalf = false, isPositiveArc = true, 55.29f, 59.92f)
                lineTo(42.08f, 45.38f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.72f, -11.46f)
                arcToRelative(8.22f, 8.22f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11.34f, 0.95f)
                close()
                moveTo(208.35f, 180.71f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6.24f, -0.4f)
                arcTo(100f, 100f, 0f, isMoreThanHalf = false, isPositiveArc = false, 83.78f, 36.42f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1f, 6.18f)
                close()
            }
        }.build()

        return _ChatTeardropSlashFill!!
    }

@Suppress("ObjectPropertyName")
private var _ChatTeardropSlashFill: ImageVector? = null
