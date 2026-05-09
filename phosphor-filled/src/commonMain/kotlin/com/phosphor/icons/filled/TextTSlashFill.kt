package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.TextTSlashFill: ImageVector
    get() {
        if (_TextTSlashFill != null) {
            return _TextTSlashFill!!
        }
        _TextTSlashFill = ImageVector.Builder(
            name = "Filled.TextTSlashFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(208f, 32f)
                lineTo(48f, 32f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 32f, 48f)
                lineTo(32f, 208f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 16f)
                lineTo(208f, 224f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, -16f)
                lineTo(224f, 48f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 208f, 32f)
                close()
                moveTo(128f, 72f)
                horizontalLineToRelative(48f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, 8f)
                lineTo(184f, 96f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -16f, 0f)
                lineTo(168f, 88f)
                lineTo(128f, 88f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -16f)
                close()
                moveTo(189.27f, 198f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -11.29f, -0.75f)
                lineToRelative(-42f, -48f)
                lineTo(135.98f, 176f)
                horizontalLineToRelative(12f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 16f)
                lineTo(108f, 192f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -16f)
                horizontalLineToRelative(12f)
                lineTo(120f, 131f)
                lineTo(88f, 94.43f)
                lineTo(88f, 96f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -16f, 0f)
                lineTo(72f, 80f)
                arcToRelative(8.13f, 8.13f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.63f, -3.13f)
                lineTo(66f, 69.27f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 78f, 58.73f)
                lineToRelative(112f, 128f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 189.27f, 198f)
                close()
            }
        }.build()

        return _TextTSlashFill!!
    }

@Suppress("ObjectPropertyName")
private var _TextTSlashFill: ImageVector? = null
